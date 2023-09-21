package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageImpl {
    @Autowired
    Message message;

    public String getMessage() {
        return message.getMessage();
    }
}
