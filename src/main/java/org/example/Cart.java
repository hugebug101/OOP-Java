package org.example;

import java.util.Scanner;

public class Cart {
    private double cartTotalAmount;
    private int cartTotalBook;
    private final String[] cartBooksTitle = new String[20];
    private final int[] cartBooksQuantity = new int[20];
    private final double[] cartBooksPrice = new double[20];
    static Scanner input = new Scanner(System.in);

    Cart() {
        this.cartTotalAmount = 0;
        this.cartTotalBook = 0;
    }

    public void addBook(Book book) {
        int bookNumber = 0;
        do {
            book.displayBookTitle();
            System.out.println("\nPlease enter a book number\n-1 to exit -2 to view cart");
            bookNumber = input.nextInt();
            int bookIndex = bookNumber - 1;

            switch (bookNumber) {
                case -1 -> {
                    return;
                }
                case -2 -> {
                    viewBook(book);
                }
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    System.out.println("You have selected " + book.getBookTitle(bookIndex));
                    String selectedBookTitle = book.getBookTitle(bookIndex);

                    for (int i = 0; i < cartBooksTitle.length; i++) {

                        //check if book quantity is enough
                        if (book.getBookQuantity(bookIndex) == 0) {
                            System.out.println("Sorry, we have no more stock for this book " + selectedBookTitle);
                            break;
                        }

                        //if book is null
                        if (cartBooksTitle[i] == null) {
                            cartBooksQuantity[i] = 1;
                            cartBooksTitle[i] = book.getBookTitle(bookIndex);
                            updateBook(book, bookIndex, i);
                            break;
                        }

                        //check book title is same
                        if (cartBooksTitle[i].equals(book.getBookTitle(bookIndex))) {
                            cartBooksQuantity[i]++;
                            updateBook(book, bookIndex, i);
                            break;
                        }
                    }

                    System.out.println("Total book in cart: " + cartTotalBook);
                    System.out.println("Total amount in cart: RM" + cartTotalAmount);
                }
            }

        } while (bookNumber != -1);
    }

    //update book quantity and price
    public void updateBook(Book book, int bookIndex, int i) {
        book.setBookQuantity(bookIndex, book.getBookQuantity(bookIndex) - 1);
        cartBooksPrice[i] += book.getBookPrice(bookIndex);
        cartTotalBook++;
        cartTotalAmount += book.getBookPrice(bookIndex);
    }

    public void deleteBook(Book book) {
        if (cartTotalBook == 0) {
            System.out.println("Your cart is empty");
            return;
        }
        viewBook(book);
        System.out.println("Please enter a book number\n-1 to exit");
        int bookNumber = 0;
        do {
            bookNumber = input.nextInt();
            int bookIndex = bookNumber;
            if (bookNumber != -1) {
                System.out.println("You have selected " + cartBooksTitle[bookIndex]);
                //delete book from cart
                cartBooksTitle[bookIndex] = null;
                cartTotalAmount -= book.getBookPrice(bookIndex);
                cartTotalBook--;
            }
        } while (bookNumber != -1);
    }

    public void viewBook(Book book) {
        if (cartTotalBook == 0) {
            System.out.println("Your cart is empty");
            return;
        }
        System.out.println("\nYour cart contains: ");
        System.out.format("%-30s %-15s %-10s\n", "Book Title", "Book Price", "Book Quantity");
        System.out.println("--------------------------------------------------------------------------");
        //display book id and title
        for (int i = 0; i < cartBooksTitle.length; i++) {
            if (cartBooksTitle[i] != null) {
                System.out.format("%-30s %-15s %-10s\n", (i + 1) + "-" + cartBooksTitle[i], cartBooksPrice[i], cartBooksQuantity[i]);
            }
        }
        //display total amount
        //display total book
        System.out.println("Total book in cart: " + cartTotalBook);
        System.out.println("Total amount in cart: RM" + cartTotalAmount);
        System.out.println();
    }

    public void setCartTotalAmount(double cartTotalAmount) {
        this.cartTotalAmount = cartTotalAmount;
    }

    public void setTotalBook(int totalBook) {
        this.cartTotalBook = totalBook;
    }

    public double getCartTotalAmount() {
        return cartTotalAmount;
    }

    public int getTotalBook() {
        return cartTotalBook;
    }

    public String[] getCartBooksTitle() {
        return cartBooksTitle;
    }

    public int getCartTotalBook() {
        return cartTotalBook;
    }
}
