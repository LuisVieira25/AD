package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // EX 1

        Car car1 = new Car(2002,1999,"Renault","Clio","White",false);
        Motorcycle motorcycle1 = new Motorcycle(2018,4999,"Honda","cbr 1000","red",false);

        System.out.println(car1.getBrand());
        System.out.println(car1.getYear());
        System.out.println(car1.toString());
        System.out.println(motorcycle1.getModel());
        System.out.println(motorcycle1.getPrice());
        System.out.println(motorcycle1.toString());

        // EX 2

        Triangle tring = new Triangle(new Point(0,0),new Point(2.5,5),new Point(5,0));
        Triangle tring2 = new Triangle(new Point(1,1),new Point(3,8),new Point(5,0));

        System.out.println(tring.getArea());
        System.out.println(tring.getPerimeter());

        Rectangle rect = new Rectangle(new Point(0,3),3,5);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());


        // EX 3

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(tring);
        shapes.add(rect);

        Figure fig1 = new Figure(shapes);
        fig1.addShape(tring2);

        System.out.print(fig1.getShapes());

        for (Shape s:fig1.getShapes()) {
            System.out.println(s.toString());
            System.out.println("Area: "+s.getArea());
            System.out.println("Perimetro: "+s.getPerimeter());
            System.out.println("-");
        }

    }
}
