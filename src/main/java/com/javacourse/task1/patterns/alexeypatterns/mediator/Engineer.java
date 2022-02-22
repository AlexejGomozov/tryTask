package com.javacourse.task1.patterns.alexeypatterns.mediator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Engineer extends Person{
    private static final Logger LOGGER = LogManager.getLogger();

    public Engineer(Mediator m) {
        super(m);
    }

    public void notify(String message) {
        LOGGER.info("Инженер получил сообщение: " + message);
    }
}
