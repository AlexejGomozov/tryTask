package com.javacourse.task1.patterns.alexeypatterns.fasade;

public class Request {

    protected MyURL url;

    public Request(MyURL url){
        this.url = url;
    }
    public String sendRequest(){
        String s = "60";
        return s;
    }
}
