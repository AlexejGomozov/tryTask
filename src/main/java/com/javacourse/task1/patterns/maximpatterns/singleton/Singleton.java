package com.javacourse.task1.patterns.maximpatterns.singleton;

import java.util.logging.Logger;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Singletone created");
        }
        return instance;
    }

}
