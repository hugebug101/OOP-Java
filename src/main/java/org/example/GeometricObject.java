package org.example;

//Nik Danish Rifqi Bin Nik Reduan 2215205
//Muhammad Anas Daniel Bin Mohd Satria 2217581

class GeometricObject {
    double area;
    double perimeter;

    public static void main(String[] args) {
        //use meter
        Rectangle rectangle = new Rectangle(4, 40);
        Circle circle = new Circle(5);

        System.out.println("The area of the rectangle is " + rectangle.getArea() + " square meters");
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter() + " meters");
        System.out.println("The area of the circle is " + circle.getArea() + " square meters");
        System.out.println("The perimeter of the circle is " + circle.getPerimeter() + " meters");
    }
}

class Rectangle extends GeometricObject {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        area = width * height;
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * (width + height);
        return perimeter;
    }
}

class Circle extends GeometricObject {
    double radius;

    Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

}
