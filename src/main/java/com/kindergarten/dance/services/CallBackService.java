package com.kindergarten.dance.services;

import com.kindergarten.dance.model.CallBack;
import com.kindergarten.dance.repositories.CallBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallBackService {

    @Autowired
    private CallBackRepository callBackRepository;

    public CallBack findNotClosedByPhoneNumber(String phone) {
        return callBackRepository.findNotClosedByPhoneNumber(phone);
    }

    public CallBack save(CallBack callBack) {
        return callBackRepository.save(callBack);
    }

    public List<CallBack> getAllNew() {
        List<CallBack> callBacks = callBackRepository.getAllNew();
        if (callBacks != null && !callBacks.isEmpty())
            callBacks.sort((o1, o2) -> o1.getCreated().compareTo(o2.getCreated()));
        return callBacks;
    }

    public List<CallBack> getAll() {
        List<CallBack> callBacks = callBackRepository.findAll();
        if (callBacks != null && !callBacks.isEmpty())
            callBacks.sort((o1, o2) -> o1.getCreated().compareTo(o2.getCreated()));
        return callBacks;
    }

    public CallBack getById(Long id) {
        return callBackRepository.getOne(id);
    }

    public CallBack update(CallBack callBack) {
        return callBackRepository.save(callBack);
    }
}
