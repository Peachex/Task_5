package com.epam.task4.content;

import java.util.Random;

public enum Material {
	GOLD(3, 0.5), SILVER(2, 0.3), BRONZE(1, 0.25);

	private double priceRatio;
	private double weightRatio;

	Material(double priceRatio, double weightRatio) {
		this.priceRatio = priceRatio;
		this.weightRatio = weightRatio;
	}

	public double getPriceRatio() {
		return this.priceRatio;
	}

	public void setPriceRatio(double priceRatio) {
		this.priceRatio = priceRatio;
	}

	public double getWeightRatio() {
		return this.weightRatio;
	}

	public void setWeightRatio(double weightRatio) {
		this.weightRatio = weightRatio;
	}

	public static Material getRandomMaterial() {
		switch (new Random().nextInt(3)) {
			case 0: {
				return Material.GOLD;
			}
			case 1: {
				return Material.SILVER;
			}
			case 2: {
				return Material.BRONZE;
			}
			default: {
				return null;
			}
		}
	}

	@Override
	public String toString() {
		return this.name() + ", price ratio = " + this.priceRatio + ", weight ratio = " + this.weightRatio;
	}
}
