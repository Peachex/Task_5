package com.epam.task4.content;

public abstract class Treasure {
	private Material material;
	private double price;
	private double weight;

	public Treasure(Material material) {
		this.material = material;
		this.price = this.material.getPriceRatio();
		this.weight = this.material.getWeightRatio();
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
}
