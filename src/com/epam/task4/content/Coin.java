package com.epam.task4.content;

import java.util.Random;

public class Coin extends Treasure {
	private int denomination;

	public Coin(Material coinMaterial, int denomination) {
		super(coinMaterial);
		this.denomination = denomination;
		this.setPrice(this.getPrice() * this.denomination);
	}

	public int getDenomination() {
		return this.denomination;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}

	public static int getRandomDenomination() {
		switch (new Random().nextInt(3)) {
			case 0: {
				return 1;
			}
			case 1: {
				return 5;
			}
			case 2: {
				return 10;
			}
			default: {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return "Coin material: " + this.getMaterial() + ", denomination: " + this.denomination + ", price = " +
				this.getPrice() + ", weight = " + this.getWeight();
	}
}
