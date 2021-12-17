package com.dvana;

import com.dvana.Context.Car;
import com.dvana.Context.SportUtilityCar;
import com.dvana.Context.SedanCar;

public class main {
    public static void main(String[] args) {
        System.out.println("Car brake system: ");
        Car sedanCar = new SedanCar();
        sedanCar.applyBrake();
        Car cuvCar = new SportUtilityCar();
        cuvCar.applyBrake();
    }
}
