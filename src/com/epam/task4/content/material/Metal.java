package com.epam.task4.content.material;

import java.util.Random;

public class Metal {
    private double priceRatio;
    private double weightRatio;
    private String name;

    public Metal(double priceRatio, double weightRatio, String name) {
        this.priceRatio = priceRatio;
        this.weightRatio = weightRatio;
        this.name = name;
    }

    public static Metal getRandomMetal() {
        switch (new Random().nextInt(3)) {
            case 0: {
                return new Gold();
            }
            case 1: {
                return new Silver();
            }
            case 2: {
                return new Bronze();
            }
        }
        return null;
    }

    public double getPriceRatio() {
        return this.priceRatio;
    }

    public void setPriceRatio(double priceRatio) {
        this.priceRatio = priceRatio;
    }

    public double getWeightRatio() {
        return this.weightRatio;
    }

    public void setWeightRatio(double weightRatio) {
        this.weightRatio = weightRatio;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "material: " + this.name + ", price ratio = " + this.priceRatio + ", weight ratio = " + this.weightRatio;
    }
}
