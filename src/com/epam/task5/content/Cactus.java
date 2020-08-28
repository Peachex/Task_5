package com.epam.task5.content;

public class Cactus extends Flower {
	private double liquidVolume;

	public Cactus(double cactusLength, double cactusPrice, double liquidVolume) {
		super("Cactus", "green", cactusLength, cactusPrice);
		this.liquidVolume = liquidVolume;
	}

	public double getLiquidVolume() {
		return this.liquidVolume;
	}

	public void setLiquidVolume(double liquidVolume) {
		this.liquidVolume = liquidVolume;
	}

	@Override
	public String toString() {
		return "flower: " + this.getName() + ", color: " + this.getColor() + ", length = " + this.getLength() + ", liquid volume = " +
				this.liquidVolume + ", price = " + this.getPrice() + "$";
	}
}
