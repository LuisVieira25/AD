package com.company;

public class Motorcycle extends Vehicle{
    private boolean trick;

    public Motorcycle() {
        super();
        this.trick = false;
    }

    public Motorcycle(int year, float price, String brand, String model, String color, boolean trick) {
        super(year, price, brand, model, color);
        this.trick = trick;
    }

    public void setTrick(boolean trick){
        this.trick = trick;
    }

    public boolean getTrick(){
        return trick;
    }

    @Override
    public String toString(){
        return "( "+super.toString()+" , "+getTrick()+" )";
    }
}
