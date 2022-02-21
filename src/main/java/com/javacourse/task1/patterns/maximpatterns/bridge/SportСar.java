package com.javacourse.task1.patterns.maximpatterns.bridge;

class SportCar extends Car implements Engine {
    public SportCar(Engine engine) {
        super(engine);
    }
    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }
}
