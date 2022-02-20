package com.javacourse.task1.patterns.alexeyPatterns.patternAdapter;

public class PatternAdapter {

    public static void main(String[] args) {
        Adapter a = new Adapter(new BankAccount());
        System.out.println("Баланс в долларах: " + a.getSummaUSD());
    }
}
