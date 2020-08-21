package com.epam.task4.content;

import com.epam.task4.content.material.Metal;
import java.util.Random;

public class Coin {
    private static final double weightConst = 200;
    private static final double priceConst = 2;
    private static int count = 1;
    private Metal metal;
    private double weight;
    private double price;
    private int id;

    public Coin(Metal metal) {
        this.metal = metal;
        this.weight = this.metal.getWeightRatio() * weightConst;
        this.price = this.metal.getPriceRatio() * priceConst;
        this.id = count++;
    }

    public static double getWeightConst() {
        return weightConst;
    }

    public static double getPriceConst() {
        return priceConst;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Coin.count = count;
    }

    public static Coin[] getRandomCoins() {
        int coinsNumber = new Random().nextInt(50);
        Coin[] coinsArray = new Coin[coinsNumber];
        for (int i = 0; i < coinsNumber; i++) {
            coinsArray[i] = new Coin(Metal.getRandomMetal());
        }
        return coinsArray;
    }

    public Metal getMetal() {
        return this.metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Coin id = " + this.id + ", " + this.metal + ", weight = " + this.weight + "gr, price = " + this.price + "$";
    }
}
