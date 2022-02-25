package com.javacourse.task1.patterns.alexeypatterns.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SMSSubscriber implements Subscriber {
    private static final Logger LOGGER = LogManager.getLogger();

    protected String phone;

    public SMSSubscriber(String phone){
        this.phone = phone;
    }

    public void update(String message){
        LOGGER.info("Отправка на  телефон ( {} ) сообщения: {}",  phone, message);
    }
}
