package com.epam.task4.content;

public abstract class Treasure {
	private Material material;
	private double price;
	private double weight;
	private static final double priceConst = 3;
	private static final double weightConst = 10;

	public Treasure(Material material) {
		this.material = material;
		this.price = this.material.getPriceRatio() * priceConst;
		this.weight = this.material.getWeightRatio() * weightConst;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public static double getPriceConst() {
		return priceConst;
	}

	public static double getWeightConst() {
		return weightConst;
	}
}
