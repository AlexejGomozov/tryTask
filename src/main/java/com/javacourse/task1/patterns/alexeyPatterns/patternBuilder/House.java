package com.javacourse.task1.patterns.alexeypatterns.patternbuilder;

public class House {

    public boolean isWood;
    public boolean isElec;
    public int area = 10;
    public int countFloors = 1;
    public int valuePool;
    public int areaPool;

    public String toString(){
        String s = "Получился следующий дом: ";
        if(isWood) s+= "деревянный, ";
        else s+= "кирпичный";
        if(isElec) s+= "с электричеством, ";
        else s+= "без электричества, ";
        s+= countFloors + " эт., ";
        s+= "площадь" + area + "m^2";
        if(valuePool != 0){
            s+= ", бассейн объемом " + valuePool + " литров и площадью" + areaPool + "m^2";
        }
        return s;
    }
}
