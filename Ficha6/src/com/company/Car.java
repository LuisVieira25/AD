package com.company;

public class Car extends Vehicle{
    private boolean roof;

    public Car() {
        super();
        this.roof = false;
    }

    public Car(int year, float price, String brand, String model, String color, boolean roof) {
        super(year, price, brand, model, color);
        this.roof = roof;
    }

    public void setRoof(boolean roof){
        this.roof = roof;
    }

    public boolean getRoof(){
        return roof;
    }

    @Override
    public String toString(){
        return "( "+super.toString()+" , "+getRoof()+" )";
    }
}
