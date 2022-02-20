package com.javacourse.task1.patterns.alexeypatterns.mediator;

public class PatternMediator {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        Person en = new Engineer(mediator);
        Person m = new Marketer(mediator);
        Person b = new Booker(mediator);
        mediator.en = en;
        mediator.m = m;
        mediator.b = b;

        en.send("Я сделал новый продукт");
        m.send("Я завершил маркетинг");
    }
}
