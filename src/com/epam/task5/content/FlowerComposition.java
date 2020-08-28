package com.epam.task5.content;

import java.util.ArrayList;

public class FlowerComposition {
	private ArrayList<Flower> flowers = new ArrayList<>();
	private Pack pack;

	public FlowerComposition(Pack pack) {
		this.pack = pack;
	}

	public ArrayList<Flower> getFlowers() {
		return this.flowers;
	}

	public void addToFlowers(Flower flower) {
		this.flowers.add(flower);
	}

	public Pack getPack() {
		return this.pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public double findTotalPrice() {
		double totalPrice = 0;
		for (Flower flower : this.flowers) {
			totalPrice += flower.getPrice();
		}
		return totalPrice + this.pack.getPrice();
	}

	@Override
	public String toString() {
		for (Flower flower : this.flowers) {
			System.out.println(flower);
		}
		return this.pack + "\n--------------------------------------\nPrice = " + this.findTotalPrice() + "$";
	}
}
