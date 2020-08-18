package com.epam.task2;

import java.util.Scanner;

public class Payment {
    private static int index = 0;
    private Products[] cart = new Products[Products.values().length];
    public Payment() {

    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Payment.index = index;
    }

    public Products[] getCart() {
        return this.cart;
    }

    public void setCart(Products[] cart) {
        this.cart = cart;
    }

    public void chooseProducts() {
        if (index == Products.values().length) {
            System.out.println("\nYour cart is full!\n");
            return;
        }
        Products.viewProducts();
        Scanner in = new Scanner(System.in);
        System.out.print("\nChoose product: ");
        int toggle = in.nextInt() - 1;
        if (toggle >= 0 && toggle < Products.values().length) {
            this.cart[index++] = Products.values()[toggle];
            System.out.println("Added in your cart.\n");
        } else {
            System.out.println("Something wrong...\n");
        }
    }

    public double totalCost() {
        double totalCost = 0;
        for (Products products : this.cart) {
            if (products != null) {
                totalCost += products.cost();
            } else {
                break;
            }
        }
        return totalCost;
    }

    public void viewCart() {
        System.out.println("\nYour cart:");
        for (Products products : this.cart) {
            if (products != null) {
                System.out.println(products.name() + " - " + products.cost() + "$");
            } else {
                break;
            }
        }
        System.out.println("----------------------\nTotal cost = " + this.totalCost() + "\n");
    }

    public void buyProducts() {
        System.out.println("\nPay " + this.totalCost() + "$\n");
        this.cart = new Products[Products.values().length];
        index = 0;
    }

    public enum Products {
        BREAD, MILK, CHEESE, ICE_CREAM, CAKE, WATER, MEAT, CHICKEN;

        private static void viewProducts() {
            for (Products pr : Products.values()) {
                System.out.println((pr.ordinal() + 1) + ")" + pr.name() + " - " + pr.cost() + "$");
            }
        }

        private double cost() {
            switch (this) {
                case BREAD: {
                    return 1.99;
                }
                case MILK: {
                    return 2.49;
                }
                case CHEESE: {
                    return 1.69;
                }
                case ICE_CREAM: {
                    return 3.99;
                }
                case CAKE: {
                    return 7.0;
                }
                case WATER: {
                    return 0.99;
                }
                case MEAT: {
                    return 19.29;
                }
                case CHICKEN: {
                    return 16.99;
                }
                default: {
                    System.out.println("Unknown product!");
                }
            }
            return 0;
        }
    }
}
