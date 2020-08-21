package com.epam.task5.content.pack;

public class Carton extends Pack {
    private static final String name = "carton";
    private static double priceRatio = 0.03;

    public Carton() {
        super(name, priceRatio);
    }
}
