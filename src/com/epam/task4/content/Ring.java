package com.epam.task4.content;

import java.util.Random;

public class Ring extends Treasure {
	public enum Jewel {
		DIAMOND(3, 0.5), RUBY(2, 0.3), EMERALD(1, 0.25);

		private double priceRatio;
		private double weightRatio;

		Jewel(double priceRatio, double weightRatio) {
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

		public static Jewel getRandomJewel() {
			switch (new Random().nextInt(3)) {
				case 0: {
					return Jewel.DIAMOND;
				}
				case 1: {
					return Jewel.RUBY;
				}
				case 2: {
					return Jewel.EMERALD;
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

	private Jewel jewel;
	private double diameter;

	public Ring(Material ringMaterial, Jewel jewel, double diameter) {
		super(ringMaterial);
		this.jewel = jewel;
		this.diameter = diameter;
		this.setPrice(this.getPrice() * this.jewel.priceRatio);
	}

	public Jewel getJewel() {
		return this.jewel;
	}

	public void setJewel(Jewel jewel) {
		this.jewel = jewel;
	}

	public double getDiameter() {
		return this.diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public static double getRandomDiameter() {
		switch (new Random().nextInt(3)) {
			case 0: {
				return 0.5;
			}
			case 1: {
				return 1;
			}
			case 2: {
				return 1.5;
			}
			default: {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return "Ring material: " + this.getMaterial() + ", jewel: " + this.jewel + ", diameter = " + this.diameter + ", price = " + this.getPrice();
	}
}
