package com.dvana.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxySportCar implements Car{
    private Car car = new SportCar();
    private static List<String> allowedOwners;

    static {
        allowedOwners = new ArrayList<>();
        allowedOwners.add("Mihaela Botezat");
        allowedOwners.add("Dumitru Ciorescu");
        allowedOwners.add("Pavel Ciobanu");
    }

    @Override
    public void connectTo(String owner) throws Exception {
        if (!allowedOwners.contains(owner)) {
            throw new Exception("Access denied");
        }
        car.connectTo(owner);
    }
}
