package com.javacourse.task1.patterns.alexeypatterns.mediator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Marketer extends Person{

    private static final Logger LOGGER = LogManager.getLogger();

    public Marketer(Mediator m) {
        super(m);
    }

    public void notify(String message) {
        LOGGER.info("Маркетолог получил сообщение: " + message);
    }
}
