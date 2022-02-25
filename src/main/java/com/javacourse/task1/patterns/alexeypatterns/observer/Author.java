package com.javacourse.task1.patterns.alexeypatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Author {

    protected List<Subscriber> list = new ArrayList<>();

    public void subscribe(Subscriber s){
        list.add(s);
    }
    public void unsubscribe(Subscriber s){
        list.remove(s);
    }
    public void posts(){
        for(Subscriber s : list){
            s.update(" Вышел новый пост на блоге");
        }
    }
    public void news(){
        for(Subscriber s : list){
            s.update("Появилась новость на сайте");
        }
    }
}

