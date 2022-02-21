package com.javacourse.task1.patterns.alexeypatterns.builder;

public class Architect {

    private Architect(){}

    public static House getWoodHouse(){
        BuilderHouse builder = new BuilderHouse();
        builder.setWood(true);
        builder.setArea(70);
        builder.setElec(true);
        return builder.getHouse();
    }

    public static House getRichHouse(){
        BuilderHouse builder = new BuilderHouse();
        builder.setWood(false);
        builder.setArea(570);
        builder.setElec(true);
        builder.setPool(100_000, 300);
        builder.setCountFloors(3);
        return builder.getHouse();
    }
}
