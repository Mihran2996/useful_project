package com.example.streamApi.spring.differentInjection.dependencyInjectionAutomaticly;

import com.example.streamApi.spring.differentInjection.model.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {

        //dependency injection by constructor
        //avtomat inject kani vorovhetev xml fayli mej by constructor talisenq objectin

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("automaticInjectByConstructor.xml");
        MusicPlayer bean = context.getBean(MusicPlayer.class);
        bean.getSong();


        //dependency injection by setter
        //avtomat inject kani vorovhetev xml fayli mej by setter talisenq objectin

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("automaticInjectBySetter.xml");

        MusicPlayer bean2 = context2.getBean(MusicPlayer.class);
        bean2.getSong();
    }
}
