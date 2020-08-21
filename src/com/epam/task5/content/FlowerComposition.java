package com.epam.task5.content;

import com.epam.task5.content.flower.Flower;
import com.epam.task5.content.pack.Pack;
import java.util.Scanner;

public class FlowerComposition {
    private Flower[] flowers;
    private Pack pack;
    private double price;
    private int id;
    private static int count = 1;

    public FlowerComposition(Pack pack, Flower... flowers) {
        Flower.setCount(0);
        this.pack = pack;
        this.flowers = flowers;
        this.id = count++;
        this.price = this.findPrice();
    }

    public Flower[] getFlowers() {
        return this.flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Pack getPack() {
        return this.pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
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
        FlowerComposition.count = count;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Flower[] fillFlowersArray() {
        System.out.println("\nAmount of flowers:\n");
        int size = new Scanner(System.in).nextInt();

        Flower[] flowers = new Flower[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\nChoose flower:");
            flowers[i] = Flower.chooseFlower();
        }
        System.out.println();
        return flowers;
    }

    public double findPrice() {
        double totalPrice = 0;
        for (Flower flower : this.flowers) {
            totalPrice += flower.getPrice();
        }
        return totalPrice + this.pack.getPrice();
    }

    public String toString() {
        System.out.println("Flower composition #" + this.id + "\n" + this.pack);
        for (Flower flower : this.flowers) {
            System.out.println(flower);
        }
        return "---------------------------------\nPrice = " + this.price + "$\n";
    }
}
