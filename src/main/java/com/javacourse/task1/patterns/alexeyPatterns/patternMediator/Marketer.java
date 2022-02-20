package com.javacourse.task1.patterns.alexeypatterns.patternmediator;

public class Marketer extends Person{


    public Marketer(Mediator m) {
        super(m);
    }

    @Override
    public void notify(String message) {
        System.out.println("Маркетолог получил сообщение " + message);
    }
}
