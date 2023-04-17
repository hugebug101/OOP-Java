package org.example;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Car userCar = new Car();

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();

        // creating a new object of the class Date
        java.util.Date date = new java.util.Date(millis);

        String dateNow = date.toString();
        System.out.println(dateNow);
    }

}

