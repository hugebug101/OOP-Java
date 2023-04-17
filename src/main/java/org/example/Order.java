package org.example;

import java.util.Scanner;

public class Order {
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhoneNo;
    private String[] orderBooksTitle;
    private String orderDate;
    private int orderID;
    private double orderTotalAmount;
    private int orderTotalBook;
    static Scanner input = new Scanner(System.in);

    public Order(String customerName, String customerAddress, String customerEmail, String customerPhoneNo, String[] orderBooksTitle, String orderDate, int orderID, double orderTotalAmount, int orderTotalBook) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
        this.orderBooksTitle = orderBooksTitle;
        this.orderDate = orderDate;
        this.orderID = orderID;
        this.orderTotalAmount = orderTotalAmount;
        this.orderTotalBook = orderTotalBook;
    }

    //place order
    public void placeOrder() {
        System.out.println("Your order has been placed");
        System.out.println("---------------------------------");
        System.out.println("Your order ID is : " + orderID);
        System.out.println("Your order date is : " + orderDate);
        System.out.println("Your order total amount is : RM " + orderTotalAmount);
        System.out.println("Your order total book is : " + orderTotalBook);
        System.out.println("Your order books title is : " + orderBooksTitle);
    }

    //view order
    public void viewOrder() {
        System.out.println("Your order ID is " + orderID);
        System.out.println("Your order date is " + orderDate);
        System.out.println("Your order total amount is " + orderTotalAmount);
        System.out.println("Your order total book is " + orderTotalBook);
        System.out.println("Your order books title is " + orderBooksTitle);
    }

    //refund order
    public void refundOrder() {
        System.out.println("Your refund request has been placed");
    }

    public Order() {
    }

}
