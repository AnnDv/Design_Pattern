package com.dvana.Bridge;

public class Diesel implements Combustible{

    @Override
    public void hasCombustible() {
        System.out.println("diesel");
    }
}
