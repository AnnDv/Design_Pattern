package com.dvana.Bridge;

public class Battery implements Combustible{

    @Override
    public void hasCombustible () {
        System.out.println("electricity");
    }
}
