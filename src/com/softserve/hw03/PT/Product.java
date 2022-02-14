package com.softserve.hw03.PT;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product() {
        name = "Bread";
        price = 2;
        quantity = 10;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){return "Name product: " + name + ", Quantity: " + quantity;}

}
