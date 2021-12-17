package com.dvana.Strategy;

public class AntiLockBrakeSystem implements BrakeSystem{
    @Override
    public void brake() {
        System.out.println("Anti lock brakes applied.");
    }
}
