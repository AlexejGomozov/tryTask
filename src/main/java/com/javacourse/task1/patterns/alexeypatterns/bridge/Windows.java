package com.javacourse.task1.patterns.alexeypatterns.bridge;

public class Windows implements Bridge{


    public void startWiFi() {
        StringBuilder s;
        s = new StringBuilder();
        s.append("Запускаем Wi-Fi в Windows");
    }


    public void startBrowser() {
        StringBuilder s;
        s = new StringBuilder();
        s.append("Запускаем браузeр в Windows");
    }
}
