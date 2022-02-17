package com.javacourse.task1.patterns_maksym.builder.details;

public class Processor {
    private int cost;
    private String name;
    public Processor() {
        cost = 0;
        name = "noCpu";
    }

    public void setNewCost(int newCost){
        if(newCost>=0){
            cost=newCost;
        }
    }
    public void setNewName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
}
