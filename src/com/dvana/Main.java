package com.dvana;

import com.dvana.AbstractFactory.Engine;
import com.dvana.AbstractFactory.Wheels;
import com.dvana.AbstractFactory.Creator;
import com.dvana.Builder.Car;
import com.dvana.Builder.CarBuilder;
import com.dvana.Prototype.Brand;

public class Main {
    public static void main(String[] args) {
        createCar("sport car");

        Brand brand = new Brand();
        brand.setModel(Brand.Model.Audi);
        brand.setYear(2000);
        Brand brandCopy = brand.clone();
        brandCopy.setYear(2002);
        System.out.println("The year of the first car: " + brand.getYear());
        System.out.println("The year of the second car:" + brandCopy.getYear());
        Car car = new CarBuilder().setColor("black").setBrand("Toyota").setNumberOfDoors(2).setIsConvertible(true).createCar();
//        System.out.println(car.isConvertible);
    }

    public static void createCar(String type) {
        com.dvana.AbstractFactory.Car carFactory = Creator.createFactory(type);
        Wheels wheels = carFactory.createWheels();
        Engine engine = carFactory.createEngine();
        wheels.getDescription();
        engine.getDescription();
        System.out.println();
    }
}
