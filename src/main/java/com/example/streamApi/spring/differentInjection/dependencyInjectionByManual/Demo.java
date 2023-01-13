package com.example.streamApi.spring.differentInjection.dependencyInjectionByManual;

import com.example.streamApi.spring.differentInjection.model.Music;
import com.example.streamApi.spring.differentInjection.model.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        //dzerqovenq katarum kaxvacutyan nerarkum@
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classicalMusic.xml");
        Music musicBean = context.getBean(Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        musicPlayer.getSong();


        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("rockMusic.xml");
        Music musicBean2 = context2.getBean(Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(musicBean2);

        musicPlayer2.getSong();

    }
}
