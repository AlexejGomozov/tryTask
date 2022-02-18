package com.javacourse.task1.patterns_maksym.builder.details.rom;

public class Rom {
    private int cost;
    private String name;

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
