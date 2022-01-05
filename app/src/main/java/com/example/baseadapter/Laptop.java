package com.example.baseadapter;

public class Laptop {

    String model;
    String processor;
    String Price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Laptop(String brand, String processor, String price) {
        this.model = brand;
        this.processor = processor;
        Price = price;
    }
}
