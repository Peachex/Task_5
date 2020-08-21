package com.epam.task5.content.flower;

import java.util.Scanner;

public class Flower {
    private String name;
    private double price;
    private int id;
    private static double priceConst = 10;
    private static int count = 0;

    public Flower(String name, double priceRatio) {
        this.name = name;
        this.price = priceConst * priceRatio;
        this.id = count++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getPriceConst() {
        return priceConst;
    }

    public static void setPriceConst(double priceConst) {
        Flower.priceConst = priceConst;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public static Flower chooseFlower() {
        while (true) {
            System.out.println("1)Rose.\n2)Daisy.\n3)Snowdrop.\n");
            switch (new Scanner(System.in).nextInt()) {
                case 1: {
                    return new Rose();
                }
                case 2: {
                    return new Daisy();
                }
                case 3: {
                    return new Snowdrop();
                }
                default: {
                    System.out.println("\nSomething wrong...\n");
                }
            }
        }
    }

    public String toString() {
        return "flower id = " + this.id + ", " + this.name + " - " + this.price + "$";
    }
}
