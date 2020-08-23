package com.kindergarten.dance.wrappers.callBack;

public class CallBackResponse {

    private boolean success = true;
    private String errorMessage = "";

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
