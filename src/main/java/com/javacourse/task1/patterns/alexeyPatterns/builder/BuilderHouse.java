package com.javacourse.task1.patterns.alexeypatterns.builder;

public class BuilderHouse {

    private House house;

    public BuilderHouse(){
        reset();
    }

    public void reset(){
        house = new House();
    }

    public void setWood(boolean isWood){
        house.isWood = isWood;
    }

    public void setElec(boolean isElec){
        house.isElec = isElec;
    }

    public void setArea(int area){
        house.area = area;
    }

    public void setCountFloors(int countFloors){
        house.countFloors = countFloors;
    }

    public void setPool(int valuePool, int areaPool){
        house.valuePool = valuePool;
        house.areaPool = areaPool;
    }

    public House getHouse(){
        return house;
    }
}
