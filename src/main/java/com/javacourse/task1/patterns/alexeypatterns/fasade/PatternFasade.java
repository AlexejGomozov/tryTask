package com.javacourse.task1.patterns.alexeypatterns.fasade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatternFasade {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {

        double rub = 5_000;
        double usd = Fasade.rubToUSD(rub);
        LOGGER.info(usd);
    }
}
