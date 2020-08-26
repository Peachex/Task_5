package com.epam.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payment {
	public enum Product {
		BREAD(1.99), MILK(2.49), CHEESE(1.69), ICE_CREAM(3.99), CAKE(7.0), WATER(0.99), MEAT(19.29), CHICKEN(16.99);

		private double price;

		Product(double price) {
			this.price = price;
		}

		public double getPrice() {
			return this.price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		private static void viewProducts() {
			System.out.println();
			for (Product product : Product.values()) {
				System.out.println((product.ordinal() + 1) + ")" + product.name() + " - " + product.price + "$");
			}
		}
	}

	private List<Product> cart = new ArrayList<>();

	public Payment() {

	}

	public List<Product> getCart() {
		return this.cart;
	}

	public void addToCart(Product product) {
		this.cart.add(product);
	}

	public void chooseProducts() {
		Product.viewProducts();
		System.out.print("\nChoose product: ");
		try {
			Product product = Product.valueOf(new Scanner(System.in).next().toUpperCase());
			cart.add(product);
			System.out.println("\nAdded in your cart.\n");
		} catch (IllegalArgumentException e) {
			System.out.println("\nSomething wrong...\n");
		}
	}

	public double totalCost() {
		double totalCost = 0;
		for (Product product : this.cart) {
			totalCost += product.price;
		}
		return totalCost;
	}

	public void viewCart() {
		System.out.println("\nYour cart:");
		for (Product product : this.cart) {
			System.out.println(product.name() + " - " + product.price + "$");
		}
		System.out.println("----------------------\nTotal cost = " + this.totalCost() + "\n");
	}

	public void buyProducts() {
		System.out.println("\nPay " + this.totalCost() + "$\n");
		this.cart = new ArrayList<>();
	}
}
