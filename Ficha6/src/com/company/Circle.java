package com.company;

import javax.swing.*;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        this.radius = 0;
    }

    public Circle(Point position, double radius){
        super(position);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * getRadius();
    }
}
