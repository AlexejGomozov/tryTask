package com.javacourse.task1.patterns.alexeypatterns.fasade;

public class Request {

    protected MyURL url;
    static final String S = "60";
    public Request(MyURL url){
        this.url = url;
    }
    public String sendRequest(){
        return S;
    }
}
