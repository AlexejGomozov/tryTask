package com.javacourse.task1.patterns.alexeypatterns.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatternAdapter {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {

        Adapter a = new Adapter(new BankAccount());
        LOGGER.info("Баланс в долларах: " + a.getSummaUSD());
    }
}
