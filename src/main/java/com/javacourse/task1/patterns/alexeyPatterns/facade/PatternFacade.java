package com.javacourse.task1.patterns.alexeypatterns.facade;

public class PatternFacade {

    public static void main(String[] args) {
        double rub = 12_000;
        double usd = Facade.rubToUSD(rub);
        System.out.println(usd);
    }
}
