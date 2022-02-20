package com.javacourse.task1.patterns.alexeypatterns.mediator;

public class Engineer extends Person{


    public Engineer(Mediator m) {
        super(m);
    }

    @Override
    public void notify(String message) {
        System.out.println("Инженер получил сообщение " + message);
    }
}
