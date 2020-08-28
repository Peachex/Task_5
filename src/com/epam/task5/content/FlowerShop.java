package com.epam.task5.content;

import java.util.ArrayList;

public class FlowerShop {
	private ArrayList<FlowerComposition> flowerCompositions = new ArrayList<>();

	public FlowerShop() {

	}

	public ArrayList<FlowerComposition> getFlowerCompositions() {
		return this.flowerCompositions;
	}

	public void addToBouquets(FlowerComposition bouquet) {
		this.flowerCompositions.add(bouquet);
	}

	public void createFlowerComposition() {
		FlowerComposition flowerComposition = new FlowerComposition(new Pack("paper", 0.99));
		flowerComposition.addToFlowers(new Rose("red", 10, 7.8, 0.7));
		flowerComposition.addToFlowers(new Sunflower(12, 4.23, 40));
		flowerComposition.addToFlowers(new Cactus(6, 19.19, 100));

		this.flowerCompositions.add(flowerComposition);
	}

	public void viewFlowerCompositions() {
		for (FlowerComposition flowerComposition : this.flowerCompositions) {
			System.out.println("Flower composition #" + (this.flowerCompositions.indexOf(flowerComposition) + 1));
			System.out.println(flowerComposition + "\n");
		}
	}
}
