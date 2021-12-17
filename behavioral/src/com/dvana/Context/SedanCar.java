package com.dvana.Context;

import com.dvana.Strategy.DiscBrakeSystem;

public class SedanCar extends Car {
    public SedanCar() {
        super(new DiscBrakeSystem(), "Sedan");
    }
}
