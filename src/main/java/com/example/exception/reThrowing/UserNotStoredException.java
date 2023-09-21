package com.example.exception.reThrowing;

public class UserNotStoredException extends Exception {
    public UserNotStoredException(String errorMsg) {
        super(errorMsg);
    }
}
