package com.epam.task5.content.pack;

public class Paper extends Pack {
    private static final String name = "paper";
    private static double priceRatio = 0.03;

    public Paper() {
        super(name, priceRatio);
    }
}
