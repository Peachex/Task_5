package com.epam.task5.content.flower;

public class Rose extends Flower {
    private static final String name = "rose";
    private static double priceRatio = 0.05;

    public Rose() {
        super(name, priceRatio);
    }
}
