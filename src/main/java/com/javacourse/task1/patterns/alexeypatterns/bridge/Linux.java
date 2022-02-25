package com.javacourse.task1.patterns.alexeypatterns.bridge;

public class Linux implements Bridge {


    public void startWiFi() {
        StringBuilder s;
        s = new StringBuilder();
        s.append("Запускаем Wi-Fi в Linux");
    }


    public void startBrowser() {
        StringBuilder s;
        s = new StringBuilder();
        s.append("Запускаем браузер в Linux");
    }
}