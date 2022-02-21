package com.javacourse.task1.patterns.maximpatterns.bridge;

public class BridgeTest {//тест
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car unknownCar = new UnknownCar(new UnknownEngine());
        unknownCar.setEngine();
    }
}
