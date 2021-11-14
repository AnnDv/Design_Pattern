package com.dvana;

import com.dvana.Bridge.*;
import com.dvana.Facade.CarFacade;
import com.dvana.Proxy.Car;
import com.dvana.Proxy.ProxySportCar;

public class Main {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade();
        facade.createCar();

        com.dvana.Bridge.Car SimpleCar1 = new SimpleCar(new Battery());
        SimpleCar1.getType();
        com.dvana.Bridge.Car SimpleCar2 = new SimpleCar(new Diesel());
        SimpleCar2.getType();
        com.dvana.Bridge.Car SportCar = new SportCar(new Petrol());
        SportCar.getType();

        com.dvana.Proxy.Car car = new ProxySportCar();
        try {
            car.connectTo("Mihaela Botezat");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
