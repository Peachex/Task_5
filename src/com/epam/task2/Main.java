package com.epam.task2;

import java.util.Scanner;

/* Задача 2.
   Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
   нескольких товаров. */
public class Main {
	public static void main(String[] args) {
		Payment payment = new Payment();
		while (true) {
			System.out.println("1)Choose product.\n2)Cart.\n3)Buy.\n4)Exit.\n");
			switch (new Scanner(System.in).nextInt()) {
				case 1: {
					payment.chooseProducts();
					break;
				}
				case 2: {
					payment.viewCart();
					break;
				}
				case 3: {
					payment.buyProducts();
					break;
				}
				case 4: {
					return;
				}
				default: {
					System.out.println("\nSomething wrong...\n");
				}
			}
		}
	}
}

