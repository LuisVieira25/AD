package com.company;

public class Rectangle extends Shape{
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle(){
        this.topLeftPoint = new Point();
        this.height = 0.0;
        this.width = 0.0;
    }

    public Rectangle(Point topLeftPoint, double height, double width){
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public void setTopLeftPoint(Point topLeftPoint){
        this.topLeftPoint = topLeftPoint;
    }

    public Point getTopLeftPoint(){
        return topLeftPoint;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public boolean verifyPoint(Point other){
        Point TopRightPoint = new Point(width, topLeftPoint.getY());
        Point BottomRightPoint = new Point(width, (topLeftPoint.getY() - height));
        Point BottomleftPoint = new Point(topLeftPoint.getX(),(topLeftPoint.getY() - height));

        if(other.getX() >= topLeftPoint.getX() && other.getX() <= TopRightPoint.getX() && other.getY() <= topLeftPoint.getY() && other.getY() >= BottomleftPoint.getY()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Point getPosition() {
        return getPosition();
    }

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() * getHeight());
    }
}
