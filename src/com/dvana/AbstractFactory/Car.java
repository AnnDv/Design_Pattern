package com.dvana.AbstractFactory;

public abstract class Car {
    public abstract Engine createEngine();
    public abstract Wheels createWheels();
}
