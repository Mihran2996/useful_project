package com.example.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageImplTest {
    @Autowired
    private MessageImpl messageImpl;


    //Ays anotaciayi shnorhivv menq minjev ays bean karoxenq request uxarkel
    @MockBean
    private Message message;

    @Test
    public void getMessage() {
        when(message.getMessage()).thenReturn("Hello");
        String msg = messageImpl.getMessage();
        assertEquals(msg, "Hello");
    }

}