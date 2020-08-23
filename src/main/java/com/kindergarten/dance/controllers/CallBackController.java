package com.kindergarten.dance.controllers;

import com.kindergarten.dance.model.CallBack;
import com.kindergarten.dance.services.CallBackService;
import com.kindergarten.dance.wrappers.callBack.CallBackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CallBackController {

    @Autowired
    private CallBackService callBackService;

    @PostMapping(value = "/callBack")
    public CallBackResponse callBack(@RequestParam("name") String name, @RequestParam("phone") String phone) {
        CallBackResponse response = new CallBackResponse();
        CallBack callBack;
        try{
            callBack = callBackService.findNotClosedByPhoneNumber(phone);
            if(callBack == null){
                callBack = new CallBack();
                callBack.setPhone(phone);
                callBack.setName(name);
                callBackService.save(callBack);
                if(callBack == null || callBack.getId() == null){
                    response.setSuccess(false);
                }
            }else{
                response.setSuccess(false);
                response.setErrorMessage("Ви вже робили заявку на передзвін. Наші оператори з вами зв'яжуться.");
            }
        }catch (Exception e){
            e.printStackTrace();
            response.setSuccess(false);
        }
        return response;
    }

}
