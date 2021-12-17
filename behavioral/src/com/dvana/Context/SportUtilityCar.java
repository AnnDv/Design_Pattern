package com.dvana.Context;

import com.dvana.Strategy.AntiLockBrakeSystem;

public class SportUtilityCar extends Car {
    public SportUtilityCar() {
        super(new AntiLockBrakeSystem(), "SportUtilityCar");
    }
}
