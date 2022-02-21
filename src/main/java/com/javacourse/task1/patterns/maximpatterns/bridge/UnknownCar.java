package com.javacourse.task1.patterns.maximpatterns.bridge;

class UnknownCar extends Car {
    public UnknownCar(Engine engine) {
        super(engine);
    }
    public void setEngine() {
        System.out.print("UnknownCar engine: ");
        engine.setEngine();
    }
}
