package com.javacourse.task1.patterns.alexeypatterns.facade;

public class Request {

    public MyURL url;

    public Request(MyURL url){
        this.url = url;
    }
    public String sendRequest(){
        return "60";
    }
}

