package com.company;

public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other){
        return Math.sqrt((Math.pow((other.x - this.x),2)) + (Math.pow((other.y - this.y),2)));
    }

}