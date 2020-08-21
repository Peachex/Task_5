package com.epam.task4.content.material;

public class Gold extends Metal {
    private static double priceRatio = 90;
    private static double weightRatio = 0.05;
    private static String name = "gold";

    public Gold() {
        super(priceRatio, weightRatio, name);
    }
}
