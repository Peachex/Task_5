package com.epam.task5.launch;

import com.epam.task5.content.FlowerShop;

import java.util.Scanner;

/* Задача 5. Создать консольное приложение, удовлетворяющее следующим требованиям:
   • Корректно спроектируйте и реализуйте предметную область задачи.
   • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
   • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
   • для проверки корректности переданных данных можно применить регулярные выражения.
   • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
   • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().

   Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект,
   представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка. */
public class Main {
    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        while (true) {
            System.out.println("1)Create flower composition.\n2)View flower composition(s).\n3)Exit.\n");
            switch (new Scanner(System.in).nextInt()) {
                case 1: {
                    System.out.println();
                    flowerShop.createFlowerComposition();
                    break;
                }
                case 2: {
                    System.out.println();
                    flowerShop.viewAllCompositions();
                    break;
                }
                case 3: {
                    return;
                }
                default: {
                    System.out.println("\nSomething wrong...\n");
                }
            }
        }
    }
}
