package com.javacourse.task1.patterns.alexeyPatterns.patternFacade;

public class PatternFacade {

    public static void main(String[] args) {
        double rub = 5000;
        double usd = Facade.rubToUSD(rub);
        System.out.println(usd);
    }
}
