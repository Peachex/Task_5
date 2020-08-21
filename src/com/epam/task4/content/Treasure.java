package com.epam.task4.content;

import java.util.Arrays;

public class Treasure {
    private static int index = 1;
    private Coin[] coins;
    private int id;
    private int coinsNumber;

    public Treasure(Coin[] coins) {
        Coin.setCount(0);
        this.coins = coins;
        this.id = index++;
        this.coinsNumber = this.coins.length;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Treasure.index = index;
    }

    public Coin[] getCoins() {
        return this.coins;
    }

    public void setCoins(Coin... coins) {
        this.coins = coins;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoinsNumber() {
        return this.coinsNumber;
    }

    public void setCoinsNumber(int coinsNumber) {
        this.coinsNumber = coinsNumber;
    }

    public double findTreasurePrice() {
        double totalPrice = 0;
        for (Coin coin : this.coins) {
            totalPrice += coin.getPrice();
        }
        return totalPrice;
    }

    public double findTreasureWeight() {
        double totalWeight = 0;
        for (Coin coin : this.coins) {
            totalWeight += coin.getWeight();
        }
        return totalWeight;
    }

    public int findCoinsNumberOfCertainMetal(String metalName) {
        return (int) Arrays.stream(this.coins).filter(coin -> coin.getMetal().getName().equals(metalName)).count();
    }

    public String toString() {
        System.out.println("\nTreasure # " + this.id + "\n" +
                "Gold coin(s) x" + this.findCoinsNumberOfCertainMetal("gold") + "\n" +
                "Silver coin(s) x" + this.findCoinsNumberOfCertainMetal("silver") + "\n" +
                "Bronze coin(s) x" + this.findCoinsNumberOfCertainMetal("bronze")
        );
        return "--------------------------------------------\nTotal amount of coins: " + this.coinsNumber + "\nTotal price: " + this.findTreasurePrice()
                + "$\nTotal weight: " + this.findTreasureWeight() + "gr\n";
    }
}
