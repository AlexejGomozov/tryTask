package com.javacourse.task1.patterns.alexeypatterns.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailSubscriber implements Subscriber {
    private static final Logger LOGGER = LogManager.getLogger();

    protected String email;

    public EmailSubscriber(String email){
        this.email = email;
    }

    public void update(String message){
        LOGGER.info("Отправка на  e-mail ( {} ) сообщения: {} " , email, message);
    }
}

