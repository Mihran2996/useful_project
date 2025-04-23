package com.example.app.test;

import com.example.test.ForTest;
import com.example.test.Some;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringRunner.class)
public class ForTestTest {
    @InjectMocks
    private ForTest forTest;

    //Mock anotacian tuyle talis mez sarqel fiktivni object
    @Mock
    private Some some;


    //karoxenq ayspes anel kamel classi vra uenenaq sa @RunWith(MockitoJUnitRunner.class)
//    @Before
//    public void intMocks() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Test
    public void useSomeObj() {
        doNothing().when(some).say();
        int a = 5;
        int i = forTest.useSomeObj();
        assertTrue(a == i);
    }

    @Test
    public void say2() {
        when(some.say2()).thenReturn("hello");
        String msg = forTest.say2();
        assertEquals(msg, "hello");
    }

}