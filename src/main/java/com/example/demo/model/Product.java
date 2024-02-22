package com.example.demo.model;

import java.util.Random;

public class Product {

    private String produtc_id;
    private String name;
    private String price;
    private String description;
    private String quantity;

    Random rand = new Random();

    public Product(String name, String price, String description, String quantity) {
        this.produtc_id = String.valueOf(rand.nextInt(50));
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public String getProdutc_id() {
        return produtc_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "produtc_id='" + produtc_id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
