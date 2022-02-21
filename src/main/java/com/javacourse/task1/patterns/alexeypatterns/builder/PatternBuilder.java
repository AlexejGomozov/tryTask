package com.javacourse.task1.patterns.alexeypatterns.builder;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatternBuilder {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        BuilderHouse builder = new BuilderHouse();

        builder.setWood(true);
        builder.setArea(50);
        House house = builder.getHouse();
        LOGGER.info(house);

        LOGGER.info(Architect.getWoodHouse());
        LOGGER.info(Architect.getRichHouse());
    }
}