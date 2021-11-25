package com.company;

public abstract class Vehicle {
    private int year;
    private float price;
    private String brand, model, color;

    public Vehicle(){
        this.year = 0;
        this.price = 0;
        this.brand = "";
        this.model = "";
        this.color = "";
    }

    public Vehicle(int year, float price, String brand, String model, String color){
        this.year = year;
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public float getPrice(){
        return year;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return getYear()+" , "+getPrice()+" , "+getBrand()+" , "+getModel()+" , "+getColor();
    }
}
