package com.epam.task5.content;

public class Rose extends Flower {
	private double spikesLength;

	public Rose(String roseColor, double roseLength, double rosePrice, double spikesLength) {
		super("Rose", roseColor, roseLength, rosePrice);
		this.spikesLength = spikesLength;
	}

	public double getSpikesLength() {
		return this.spikesLength;
	}

	public void setSpikesLength(double spikesLength) {
		this.spikesLength = spikesLength;
	}

	@Override
	public String toString() {
		return "flower: " + this.getName() + ", color: " + this.getColor() + ", length = " + this.getLength() + ", spikes length = " +
				this.spikesLength + ", price = " + this.getPrice() + "$";
	}
}
