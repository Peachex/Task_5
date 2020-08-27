package com.epam.task4.content;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
			System.out.println("Treasure #" + this.treasureChests.indexOf(treasureChest) +
					"\nCoins number = " + treasureChest.getCoins().size() +
					"\nRings number = " + treasureChest.getRings().size() +
					"\nCups number = " + treasureChest.getCups().size() +
					"\n--------------------------------------------\nTotal price = " + treasureChest.findTotalPrice() +
					"$, total weight = " + treasureChest.findTotalWeight() + "kg\n");
		}

		while (true) {
			System.out.println("More information?\n1)Yes.\n2)No.\n");
			switch (new Scanner(System.in).nextInt()) {
				case 1: {
					System.out.println();
					for (TreasureChest treasureChest : this.treasureChests) {
						System.out.println("Treasure #" + this.treasureChests.indexOf(treasureChest));
						System.out.println(treasureChest);
					}
					return;
				}
				case 2: {
					System.out.println();
					return;
				}
				default: {
					System.out.println("\nSomething wrong...\n");
				}
			}
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
				System.out.println("\nTreasure #" + this.treasureChests.indexOf(treasureChest));
				System.out.println(treasureChest);
				return;
			}
		}
		System.out.println("\nSomething wrong...\n");
	}
}
