package org.example;

public class Book {
    private String[] booksTitle = {"Alice in Wonderland", "Harry Potter", "The BlackJack", "Cinderella", "The Little Prince"
            , "The Frogs & the Ox", "Belling the Cat", "The Tortoise and the Hare", "The Fox and the Grapes", "The Wolf and the Lamb"};
    private int totalBook = booksTitle.length;

    private double[] booksPrice = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    private int[] booksQuantity = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

    //display book title
    public void displayBookTitle() {
        //add number to the book title
        System.out.format("%-30s %-15s %-15s\n", "Book Title", "Book Price", "Book Quantity");
        //make a line
        System.out.println("--------------------------------------------------------------------------");
        System.out.format("");

        for (int i = 0; i < booksTitle.length; i++) {
            System.out.format("%-30s %-15s %-15s\n", (i + 1) + "-" + booksTitle[i],  booksPrice[i], booksQuantity[i]);
        }
    }

    public int getBookQuantity(int index) {
        return booksQuantity[index];
    }

    public double getBookPrice(int index) {
        return booksPrice[index];
    }

    public void setBookQuantity(int i, int quantity) {
        booksQuantity[i] = quantity;
    }

    //get specific book title
    public String getBookTitle(int index) {
        return booksTitle[index];
    }

}
