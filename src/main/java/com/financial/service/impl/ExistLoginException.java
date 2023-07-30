package com.financial.service.impl;

public class ExistLoginException extends RuntimeException  {

    public ExistLoginException (String message) {
        super(message);
    }

}
