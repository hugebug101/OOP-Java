package org.example;

public class Triangle extends GeometricObject {

    double a, b, c;
    double area;
    double angle;

    public static void main(String[] args) {

    }

    //constructor
    public Triangle(double a, double b, double c, double angle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.angle = angle;
    }

    public Triangle() {
    }

    public void area() {
        area = (a * b * Math.sin(angle)) / 2;
        System.out.println("The area of the triangle is " + area + " square meters");
    }
}
