package com.dvana.AbstractFactory;

public class SportClassWheels extends Wheels{
    private static String type = "slick";

    @Override
    public void getDescription() {
        System.out.println("Sport car wheels: " + type);
    }
}
