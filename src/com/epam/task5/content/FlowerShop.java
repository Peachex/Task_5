package com.epam.task5.content;

import com.epam.task5.content.pack.Pack;

public class FlowerShop {
    private final int size = 100;
    private FlowerComposition[] flowerCompositions = new FlowerComposition[size];
    private int index = 0;

    public FlowerShop() {

    }

    public FlowerComposition[] getFlowerCompositions() {
        return this.flowerCompositions;
    }

    public void setFlowerCompositions(FlowerComposition[] flowerCompositions) {
        this.flowerCompositions = flowerCompositions;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSize() {
        return size;
    }

    public void createFlowerComposition() {
        if (index < size) {
            this.flowerCompositions[index++] = new FlowerComposition(Pack.choosePack(), FlowerComposition.fillFlowersArray());
        } else {
            System.out.println("\nFlower shop is empty...\n");
        }
    }

    public void viewAllCompositions() {
        for (FlowerComposition flowerComposition : this.flowerCompositions) {
            if (flowerComposition != null) {
                System.out.println(flowerComposition);
            } else {
                break;
            }
        }
    }
}
