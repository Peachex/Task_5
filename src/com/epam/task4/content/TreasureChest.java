package com.epam.task4.content;

import java.util.ArrayList;
import java.util.Random;

public class TreasureChest {
	private ArrayList<Coin> coins = new ArrayList<>();
	private ArrayList<Ring> rings = new ArrayList<>();
	private ArrayList<Cup> cups = new ArrayList<>();

	public TreasureChest() {
		this.fillTreasureChest();
	}

	public ArrayList<Coin> getCoins() {
		return this.coins;
	}

	public void addToCoins(Coin coin) {
		this.coins.add(coin);
	}

	public ArrayList<Ring> getRings() {
		return this.rings;
	}

	public void addToRings(Ring ring) {
		this.rings.add(ring);
	}

	public ArrayList<Cup> getCups() {
		return this.cups;
	}

	public void addToCups(Cup cup) {
		this.cups.add(cup);
	}

	public void fillTreasureChest() {
		this.fillTreasureChestWithCoins();
		this.fillTreasureChestWithRings();
		this.fillTreasureChestWithCups();
	}

	public void fillTreasureChestWithCoins() {
		for (int i = 0; i < new Random().nextInt(12); i++) {
			this.coins.add(new Coin(Material.getRandomMaterial(), Coin.getRandomDenomination()));
		}
	}

	public void fillTreasureChestWithRings() {
		for (int i = 0; i < new Random().nextInt(6); i++) {
			this.rings.add(new Ring(Material.getRandomMaterial(), Ring.Jewel.getRandomJewel(), Ring.getRandomDiameter()));
		}
	}

	public void fillTreasureChestWithCups() {
		for (int i = 0; i < new Random().nextInt(4); i++) {
			this.cups.add(new Cup(Material.getRandomMaterial(), Cup.getRandomVolume()));
		}
	}

	public double findTotalPrice() {
		double totalPrice = 0;
		for (Treasure treasure : this.coins) {
			totalPrice += treasure.getPrice();
		}
		for (Treasure treasure : this.rings) {
			totalPrice += treasure.getPrice();
		}
		for (Treasure treasure : this.cups) {
			totalPrice += treasure.getPrice();
		}
		return totalPrice;
	}

	public double findTotalWeight() {
		double totalWeight = 0;
		for (Treasure treasure : this.coins) {
			totalWeight += treasure.getWeight();
		}
		for (Treasure treasure : this.rings) {
			totalWeight += treasure.getWeight();
		}
		for (Treasure treasure : this.cups) {
			totalWeight += treasure.getWeight();
		}
		return totalWeight;
	}

	@Override
	public String toString() {
		for (Treasure treasure : this.coins) {
			System.out.println(treasure);
		}
		for (Treasure treasure : this.rings) {
			System.out.println(treasure);
		}
		for (Treasure treasure : this.cups) {
			System.out.println(treasure);
		}
		return "--------------------------------------------\nTotal price = " + this.findTotalPrice() +
				"$, total weight = " + this.findTotalWeight() + "kg\n";
	}
}
