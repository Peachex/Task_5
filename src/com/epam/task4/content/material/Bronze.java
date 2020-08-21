package com.epam.task4.content.material;

public class Bronze extends Metal {
    private static double priceRatio = 10;
    private static double weightRatio = 0.02;
    private static String name = "bronze";

    public Bronze() {
        super(priceRatio, weightRatio, name);
    }
}
