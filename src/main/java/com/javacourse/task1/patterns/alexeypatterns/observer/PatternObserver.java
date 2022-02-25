package com.javacourse.task1.patterns.alexeypatterns.observer;

public class PatternObserver {

    public static void main(String[] args) {
        Author a = new Author();
        a.subscribe(new EmailSubscriber("abc@gmail.com"));
        a.subscribe(new EmailSubscriber("xcz@gmail.com"));
        a.subscribe(new SMSSubscriber("xcz@gmail.com"));
        EmailSubscriber es = new EmailSubscriber("123@gmail.com");
        a.subscribe(es);
        a.posts();
        a.unsubscribe(es);
        a.news();
    }
}


