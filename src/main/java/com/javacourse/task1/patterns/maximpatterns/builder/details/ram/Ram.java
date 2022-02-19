package com.javacourse.task1.patterns.maximpatterns.builder.details.ram;

public class Ram {
    private int cost;
    private String name = " GB DDR4";
    private int size=0;
    public Ram(int size){
        if (size>=0){
            this.size=size;
            cost=size*10;
        }
    }
    public int getCost(){
        return cost;
    }
    public String getName(){
        return size + name;
    }

}
