package com.example.streamApi.designPatterns.behavior.observer;

public interface Subject {
     void attach(Observer o);
     void detach(Observer o);
     void notifyUpdate(Message m);
}