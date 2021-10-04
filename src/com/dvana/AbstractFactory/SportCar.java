package com.dvana.AbstractFactory;

public class SportCar extends Car{

    @Override
    public SportClassWheels createWheels() {
        return new SportClassWheels();
    }

    @Override
    public SportCarEngine createEngine() {
        return new SportCarEngine();
    }
}
