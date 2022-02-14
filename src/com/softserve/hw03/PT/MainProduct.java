package com.softserve.hw03.PT;

public class MainProduct {
    public static void main(String[] args) {
        int maxPrise = 0;
        int maxQuantity = 0;
        Product mostExpensiveProduct = null;
        Product biggestQuantity = null;

        Product productOne = new Product();
        Product productTwo = new Product("Orange", 3, 40);
        Product productTree = new Product("Tomato", 7, 12);
        Product productFour = new Product("Beer", 5, 20);
        System.out.println(productOne);
        System.out.println(productTwo);
        System.out.println(productTree);
        System.out.println(productFour);
        Product[] products = {productOne, productTwo, productTree, productFour};
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > maxPrise) {
                maxPrise = products[i].getPrice();
                mostExpensiveProduct = products[i];
            }
        }
        System.out.println("Most expensive: " + mostExpensiveProduct);

        for (int i = 0; i < products.length; i++) {
            if (products[i].getQuantity() > maxQuantity) {
                maxQuantity = products[i].getQuantity();
                biggestQuantity = products[i];
            }
        }
        System.out.println("Biggest quantity: " + biggestQuantity.getName());

    }
}
