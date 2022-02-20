package com.javacourse.task1.patterns.alexeypatterns.mediator;

public class Mediator {

    public Person en, b, m;

    public void send(Person p, String message){
        if(p == en){
            m.notify("Товар вышел, нужен маркетинг");
            b.notify("Товар вышел, нужно учесть его в бухгалтерии");
        }else if (p == m){
            en.notify("Маркетинг прошел, нужен новый товар");
           b.notify("Маркетинг прошел, нужно учесть его в бухгалтерии");
        }
    }
}
