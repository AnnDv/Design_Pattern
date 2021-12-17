package com.dvana.Strategy;

public class DiscBrakeSystem implements BrakeSystem {
    @Override
    public void brake() {
        System.out.println("Disc brakes applied.");
    }
}
