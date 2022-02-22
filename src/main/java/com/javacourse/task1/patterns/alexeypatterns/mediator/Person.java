package com.javacourse.task1.patterns.alexeypatterns.mediator;

abstract class Person {

    Mediator m;

    protected Person(Mediator m){
        this.m = m;
    }
    public void send (String message){
        m.send(this, message);
    }

    public abstract void notify(String message);
}
