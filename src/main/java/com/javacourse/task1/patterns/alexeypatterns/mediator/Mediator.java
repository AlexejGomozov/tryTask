package com.javacourse.task1.patterns.alexeypatterns.mediator;

public class Mediator {

    protected Person en;
    protected Person b;
    protected Person m;

    public void send (Person p, String message){

        if(p == en){
            m.notify("Товар вышел, нужен маркетинг" + message);
            b.notify("Товар вышел, нужно учесть его в бухгалтерии " + message);
        }
        else if(p == m){
            en.notify("Маркетинг прошел, нужен новый товар " + message);
            b.notify("Маркетинг прошел, нужно учесть его в бухгалтерии " + message);
        }
        }
    }

