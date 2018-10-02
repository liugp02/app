package com.pdgz.app.util;


public class BaseException extends RuntimeException {
    private EResultCode code;

    public BaseException() {
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message, EResultCode code) {
        super(message);
        this.code = code;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }


    public EResultCode getCode() {
        return this.code;
    }

    public void setCode(EResultCode code) {
        this.code = code;
    }
}
