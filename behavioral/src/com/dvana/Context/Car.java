package com.dvana.Context;

import com.dvana.Strategy.BrakeSystem;

public abstract class Car {
    private BrakeSystem brakeSystem;
    private String type;

    public Car(BrakeSystem brakeSystem, String type) {
        this.brakeSystem = brakeSystem;
        this.type = type;
    }

    public void setBrakeBehavior(BrakeSystem brakeSystem) {
        this.brakeSystem = brakeSystem;
    }

    public void applyBrake() {
        System.out.println("The car " + type + " has ");
        brakeSystem.brake();
    }
}
