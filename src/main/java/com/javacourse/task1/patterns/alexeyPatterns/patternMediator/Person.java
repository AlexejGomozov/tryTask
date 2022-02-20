package com.javacourse.task1.patterns.alexeyPatterns.patternMediator;

abstract public class Person {

    Mediator m;

    public Person(Mediator m){
        this.m = m;
    }
    public void send(String message){
        m.send(this, message);
    }
    abstract public void notify(String message);
}
