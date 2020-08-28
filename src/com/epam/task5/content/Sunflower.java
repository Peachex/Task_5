package com.epam.task5.content;

public class Sunflower extends Flower {
	private int seedsNumber;

	public Sunflower(double sunflowerLength, double sunflowerPrice, int seedsNumber) {
		super("Sunflower", "yellow", sunflowerLength, sunflowerPrice);
		this.seedsNumber = seedsNumber;
	}

	public int getSeedsNumber() {
		return this.seedsNumber;
	}

	public void setSeedsNumber(int seedsNumber) {
		this.seedsNumber = seedsNumber;
	}

	@Override
	public String toString() {
		return "flower: " + this.getName() + ", color: " + this.getColor() + ", length = " + this.getLength() + ", seeds number = " +
				this.seedsNumber + ", price = " + this.getPrice() + "$";
	}
}
