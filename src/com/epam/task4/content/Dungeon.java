package com.epam.task4.content;

import java.util.ArrayList;
import java.util.Comparator;

public class Dungeon {
	private ArrayList<TreasureChest> treasureChests = new ArrayList<>();

	public Dungeon() {
		this.fillDungeonWithTreasures();
	}

	public void fillDungeonWithTreasures() {
		for (int i = 0; i < 3; i++) {
			this.treasureChests.add(new TreasureChest());
		}
	}

	public void viewTreasures() {
		for (TreasureChest treasureChest : this.treasureChests) {
			System.out.println("Treasure #" + this.treasureChests.indexOf(treasureChest));
			System.out.println(treasureChest);
		}
	}

	public void findTheMostValuableTreasure() {
		int treasureIndex = this.treasureChests.indexOf(this.treasureChests
				.stream()
				.max(Comparator.comparingDouble(TreasureChest::findTotalPrice)).get()
		);
		System.out.println("Treasure #" + treasureIndex);
		System.out.println(this.treasureChests.get(treasureIndex));
		//System.out.println(this.treasureChests.get(treasureIndex) + "\n" + "Treasure #" + treasureIndex);
	}

	public void findTreasureByPrice(double price) {
		for (TreasureChest treasureChest : this.treasureChests) {
			if (treasureChest.findTotalPrice() == price) {
				System.out.println("\n\nTreasure #" + this.treasureChests.indexOf(treasureChest));
				System.out.println(treasureChest);
				return;
			}
		}
		System.out.println("\nSomething wrong...\n");
	}
}
