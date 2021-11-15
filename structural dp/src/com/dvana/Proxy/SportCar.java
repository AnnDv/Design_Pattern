package com.dvana.Proxy;

public class SportCar implements Car{
    @Override
    public void connectTo(String owner) {
        System.out.println("Engine car start. Owner is " + owner);
    }
}
