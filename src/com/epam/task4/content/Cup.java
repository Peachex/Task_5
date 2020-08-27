package com.epam.task4.content;

import java.util.Random;

public class Cup extends Treasure {
	private double volume;

	public Cup(Material cupMaterial, double volume) {
		super(cupMaterial);
		this.volume = volume;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public static double getRandomVolume() {
		switch (new Random().nextInt(3)) {
			case 0: {
				return 1000;
			}
			case 1: {
				return 2000;
			}
			case 2: {
				return 3000;
			}
			default: {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return "Cup material: " + this.getMaterial() + ", volume = " + this.volume + ", price = " + this.getPrice();
	}
}
