package com.javacourse.task1.patterns.alexeyPatterns.patternBuilder;

public class PatternBuilder {

    public static void main(String[] args) {

        BuilderHouse builder = new BuilderHouse();
        builder.setWood(true);
        builder.setArea(50);
        House house = builder.getHouse();
        System.out.println(house);

        System.out.println(Architect.getWoodHouse());
        System.out.println(Architect.getRichHouse());
    }
}

