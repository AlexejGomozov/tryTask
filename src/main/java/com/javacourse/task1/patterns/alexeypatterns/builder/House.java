package com.javacourse.task1.patterns.alexeypatterns.builder;

public class House {

    protected boolean isWood;
    protected boolean isElec;
    protected int area = 10;
    protected int countFloors = 1;
    protected int valueFool;
    protected int areaPool;

    public String toString(){
        String s = "Получился следующий дом: ";
        if(isWood) s += "деревянный, ";
        else s += "кирпичный";
        if(isElec) s +="с электричеством, ";
        else  s += "без электричества, ";
        s += countFloors + "эт., ";
        s += "площадь " + area + " m^2";
        if(valueFool != 0){
            s += ", бассейн объемом " + valueFool + " литров и площадью " + areaPool + "m^2";
        }
        return s;
    }

}
