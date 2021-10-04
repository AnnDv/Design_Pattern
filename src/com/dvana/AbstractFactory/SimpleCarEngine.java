package com.dvana.AbstractFactory;

public class SimpleCarEngine extends Engine{
    private static final String type = "atmno";

    @Override
    public void getDescription() {
        System.out.println("Simple car engine: " + type);
    }
}
