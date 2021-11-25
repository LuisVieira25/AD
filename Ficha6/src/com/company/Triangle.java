package com.company;

public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point a){
        this.a = a;
    }

    public Point getA(){
        return a;
    }

    public void setB(Point b){
        this.b = b;
    }

    public Point getB(){
        return b;
    }

    public void setC(Point c){
        this.c = c;
    }

    public Point getC(){
        return c;
    }

    public void setABC(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double comprimentoBase(){
        return a.distanceTo(b);
    }

    public double alturaTriangulo(){
        return b.distanceTo(c);
    }

    @Override
    public Point getPosition() {
        return getPosition();
    }

    @Override
    public double getArea() {
        return (comprimentoBase() * alturaTriangulo()) / 2;
    }

    @Override
    public double getPerimeter() {
        return (a.distanceTo(b)) + (a.distanceTo(c)) + (c.distanceTo(b));
    }



}
