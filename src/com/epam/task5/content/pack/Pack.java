package com.epam.task5.content.pack;

import java.util.Scanner;

public class Pack {
    private String material;
    private double price;
    private static double priceConst = 10;

    public Pack(String material, double priceRatio) {
        this.material = material;
        this.price = priceConst * priceRatio;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        Pack.priceConst = priceConst;
    }

    public static Pack choosePack() {
        while (true) {
            System.out.println("Choose pack:\n1)Carton.\n2)Paper.\n3)Cellophane.\n");
            switch (new Scanner(System.in).nextInt()) {
                case 1: {
                    return new Carton();
                }
                case 2: {
                    return new Paper();
                }
                case 3: {
                    return new Cellophane();
                }
                default: {
                    System.out.println("\nSomething wrong...\n");
                }
            }
        }
    }

    public String toString() {
        return "pack: " + this.material + " - " + this.price + "$";
    }
}
