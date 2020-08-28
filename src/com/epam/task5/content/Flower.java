package com.epam.task5.content;

public abstract class Flower {
	private String name;
	private String color;
	private double length;
	private double price;

	public Flower(String name, String color, double length, double price) {
		this.name = name;
		this.color = color;
		this.length = length;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
