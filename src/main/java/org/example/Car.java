package org.example;

public class Car {
    String brand;
    String model;
    int year;
    String color;
    double price;


//    public Car(String make, String model, int year, String color, double price) {
//        this.brand = make;
//        this.model = model;
//        this.year = year;
//        this.color = color;
//        this.price = price;
//    }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void drive() {
        System.out.println("You drive");
    }

    public void brake() {
        System.out.println("You brake");
    }
}
