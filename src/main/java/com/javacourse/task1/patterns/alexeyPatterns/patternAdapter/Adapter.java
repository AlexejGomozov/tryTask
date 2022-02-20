package com.javacourse.task1.patterns.alexeypatterns.patternadapter;

public class Adapter {
    private final BankAccount b;
    static final double RATIO = 60;

    public Adapter(BankAccount b){
        this.b = b;
    }
    public double getSummaUSD(){
        double summa = b.getSumma();
        return ((double)Math.round(summa * 100/ RATIO))/ 100;
    }
}
