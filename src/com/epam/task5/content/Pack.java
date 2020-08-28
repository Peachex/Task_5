package com.epam.task5.content;

public class Pack {
	private String materialName;
	private double price;

	public Pack(String materialName, double price) {
		this.materialName = materialName;
		this.price = price;
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "package material: " + this.materialName + ", package price = " + this.price + "$";
	}
}
