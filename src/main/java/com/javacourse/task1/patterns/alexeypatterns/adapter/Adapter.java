package com.javacourse.task1.patterns.alexeypatterns.adapter;

public class Adapter {

    private final BankAccount b;
    public final double ratio;

    public Adapter(BankAccount b){
        this.b = b;
        ratio = 60;
    }
    public double getSummaUSD(){
        double summa = b.getSumma();
        return ((double) Math.round(summa * 100/ratio))/ 100;
    }
}
