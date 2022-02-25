package com.javacourse.task1.patterns.alexeypatterns.bridge;

import java.util.Random;

public class PatternBridge {

    public static void main(String[] args) {

        Random rm = new Random();
        boolean isWindows = rm.nextBoolean();
        Bridge b;

        if(isWindows) {
            b = new Windows();
        } else b = new Linux();

        b.startWiFi();
        b.startBrowser();
    }
}
