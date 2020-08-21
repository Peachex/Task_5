package com.epam.task4.content.material;

public class Silver extends Metal {
    private static double priceRatio = 40;
    private static double weightRatio = 0.025;
    private static String name = "silver";

    public Silver() {
        super(priceRatio, weightRatio, name);
    }
}
