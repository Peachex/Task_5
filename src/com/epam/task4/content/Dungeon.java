package com.epam.task4.content;

import java.util.Arrays;
import java.util.Comparator;

public class Dungeon {
    private static final int treasureSize = 100;
    private Treasure[] treasures = new Treasure[treasureSize];

    public Dungeon() {

    }

    public Treasure[] getTreasures() {
        return this.treasures;
    }

    public void setTreasures(Treasure[] treasures) {
        this.treasures = treasures;
    }

    public static int getTreasureSize() {
        return treasureSize;
    }

    public void fillDungeon() {
        for (int i = 0; i < treasureSize; i++) {
            this.treasures[i] = new Treasure(Coin.getRandomCoins());
        }
    }

    public void viewTreasures() {
        for (Treasure treasure : this.treasures) {
            System.out.println(treasure);
        }
    }

    public void viewTreasuresCoins() {
        for (Treasure treasure : this.treasures) {
            System.out.println("Treasure #" + treasure.getId());
            for (Coin coin : treasure.getCoins()) {
                System.out.println(coin);
            }
            System.out.println("--------------------------------------------\n");
        }
    }

    public void findTheMostValuableTreasure() {
        System.out.println(Arrays
                .stream(this.treasures)
                .max(Comparator.comparingDouble(Treasure::findTreasurePrice)).get());
    }

    public void findTreasureByPrice(double price) {
        for (Treasure treasure : this.treasures) {
            if (treasure.findTreasurePrice() == price) {
                System.out.println(treasure);
                return;
            }
        }
        System.out.println("Couldn't find...\n");
    }

    public String toString() {
        System.out.println("Dungeon: ");
        this.viewTreasures();
        return "";
    }
}
