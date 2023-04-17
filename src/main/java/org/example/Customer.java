package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private int age;
    private String email;
    private String phoneNo;
    static Scanner input = new Scanner(System.in);
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Cart> carts = new ArrayList<>();
    static java.util.Date date = new java.util.Date();

    public static void main(String[] args) {

        String name = "anas";
        String address = "123 Jalan Kuchai";
        int age = 12;
        String email = "anas@daniel.com";
        String phoneNo = "0123456789";



        boolean isExit = false;

        Book book = new Book();
        Cart cart = new Cart();
        System.out.println("Welcome to XYZ Online Bookstore");

        Customer customer1 = new Customer(name, address, age, email, phoneNo);

        do {
            System.out.println("\nHello " + customer1.getName() + "!\n");
            System.out.print("1-Cart   2-Place order   9-Exit\n");
            System.out.print("Please enter your option >> ");
            int userOption = input.nextInt();

            switch (userOption) {
                case 1 -> customer1.useCart(book, cart);
                case 2 -> customer1.useOrder(book, cart);
                case 3 -> System.out.println("Thank you for shopping with us");
                case 9 -> isExit = true;
                default -> System.out.println("Invalid option");
            }
        } while (!isExit);
        System.out.println("Thank you for shopping with us");
    }

    //order section
    public void useOrder(Book book, Cart cart) {
        //create random string

        //create random ID
        int M = (int) (Math.random() * 1000000);
        //create order object
        Order order = new Order(name, address, email, phoneNo, cart.getCartBooksTitle(), date.toString(), M, cart.getCartTotalAmount(), cart.getCartTotalBook());
        //check if order is added into arraylist
        
        //add order to arraylist
        orders.add(order);
        boolean exitOrder = false;
        System.out.println("Welcome to the order section");
        do {
            System.out.println("1-Place order   2-View order status   3-Refund order  9-Back to main menu");
            switch (input.nextInt()) {
                case 1 -> order.placeOrder();
                case 2 -> order.viewOrder();
                case 3 -> order.refundOrder();
                case 9 -> exitOrder = true;
                default -> System.out.println("Invalid option");
            }
        } while (!exitOrder);
    }

    //cart section
    public void useCart(Book book, Cart cart) {
        boolean exitCart = false;
        System.out.println("Welcome to the cart section");
        do {
            System.out.println("1-Add book to cart   2-Delete book from cart   3-View book from cart  9-Back to main menu");
            switch (input.nextInt()) {
                case 1 -> cart.addBook(book);
                case 2 -> cart.deleteBook(book);
                case 3 -> cart.viewBook(book);
                case 9 -> exitCart = true;
                default -> System.out.println("Invalid option");
            }
        } while (!exitCart);
    }

    public Customer(String name, String address, int age, String email, String phoneNo) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
