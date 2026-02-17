package com.billmaster.product.dto;

public class ProductRequest {

    private String name;
    private double price;
    private int stock;
    private String category;
    private String sku;
    public ProductRequest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategory() {
        return category;
    }
    public String getSku() {
    return sku;
}

public void setSku(String sku) {
    this.sku = sku;
}
    public void setCategory(String category) {
        this.category = category;
    }
}
