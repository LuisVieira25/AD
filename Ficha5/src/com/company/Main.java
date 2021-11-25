package com.company;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(3,8);
        Point p2 = new Point(1,1);

        double distance = p1.distanceTo(p2);
        System.out.println(distance);

        Point p3 = new Point(3,1);

        Triangle triangle = new Triangle(new Point(1,0),new Point(3,0),new Point(3,4));
        double base = triangle.comprimentoBase();
        double altura = triangle.alturaTriangulo();
        double areaTriangulo = triangle.areaTriangulo();

        System.out.println(base);
        System.out.println(altura);
        System.out.println(areaTriangulo);

        Rectangle retangulo = new Rectangle(new Point(3,3),2,5);

        System.out.println(retangulo.areaRetangulo());
        System.out.println(retangulo.perimetroRetangulo());
        System.out.println(retangulo.verifyPoint(new Point(3,2)));

    }
}
