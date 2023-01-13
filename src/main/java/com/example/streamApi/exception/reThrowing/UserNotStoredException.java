package com.example.streamApi.exception.reThrowing;

public class UserNotStoredException extends Exception {
    public UserNotStoredException(String errorMsg) {
        super(errorMsg);
    }
}
