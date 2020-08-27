package com.epam.task4.launch;

import com.epam.task4.content.Dungeon;

import java.util.Scanner;

/* Задача 4.
   Создать консольное приложение, удовлетворяющее следующим требованиям:
   • Приложение должно быть объектно-, а не процедурно-ориентированным.
   • Каждый класс должен иметь отражающее смысл название и информативный состав.
   • Наследование должно применяться только тогда, когда это имеет смысл.
   • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
   • Классы должны быть грамотно разложены по пакетам.
   • Консольное меню должно быть минимальным.
   • Для хранения данных можно использовать файлы.

   Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
   дракона.  Реализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и
   выбора сокровищ на заданную сумму. */
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Dungeon dungeon = new Dungeon();

		while (true) {
			System.out.println("1)View treasures.\n2)View the most valuable treasure.\n3)Find treasure by price.\n4)Exit.\n");
			switch (in.nextInt()) {
				case 1: {
					System.out.println();
					dungeon.viewTreasures();
					break;
				}
				case 2: {
					System.out.println("\nThe most valuable treasure:");
					dungeon.findTheMostValuableTreasure();
					break;
				}
				case 3: {
					System.out.print("\nInput price: ");
					dungeon.findTreasureByPrice(in.nextDouble());
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
