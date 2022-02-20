package com.javacourse.task1.patterns.alexeyPatterns.patternMediator;

public class Booker extends Person{

    public Booker(Mediator m) {
        super(m);
    }

    @Override
    public void notify(String message) {
        System.out.println("Бухгалтер получил сообщение " + message);
    }
}
