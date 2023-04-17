package org.example.exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class SocialMedia {
    static Scanner input = new Scanner(System.in);
    static String username;
    static String password;

    public static void main(String[] args) {
        User user1 = new User("john", "doe", "john@doe.com");
        User user2 = new User("jane", "doe", "jane@doe.com");

//        System.out.println(getCurrentTime());
//        int test = input.nextInt();
//        System.out.println(getCurrentTime());


        System.out.println("Welcome to our social media");

//        do {
//
//            System.out.println();
//            System.out.println("Please enter your username");
//            username = input.nextLine();
//            System.out.println("Please enter your password");
//            password = input.nextLine();
//
//
//            if (username.equals(user1.getUsername()) && password.equals(user1.getPassword())) {
//                System.out.println("Welcome " + user1.getUsername() + "!\n");
//            } else {
//                System.out.println("Wrong username or password");
//            }
//
//        } while (!username.equals(user1.getUsername()) || !password.equals(user1.getPassword()));

        System.out.println("Select an option");

        while (true) {
            options(user1);
            System.out.println("Do you want to continue? (y/n)");
            String answer = input.next();
            if (answer.equals("y")) {
                options(user1);
            } else {
                break;
            }
        }


        System.out.println();

        //display all posts
        user1.viewPost();

    }

    static void options(User user) {
        System.out.println("Options:");
        System.out.println("1. Create a new post");
        System.out.println("2. Delete a post");
        System.out.println("3. View all posts");
        System.out.println("4. Follow a user");
        System.out.println("5. Unfollow a user");
//        System.out.println("6. Send a message");
//        System.out.println("7. View all messages");
//        System.out.println("8. Exit");
//        System.out.println("Enter your option: ");
        int option = input.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("Enter your post content: ");
                user.addPost(new Post(user.getUsername(), input.next(), getCurrentDate(), getCurrentTime()));

            }
            case 2 -> {
                user.viewPost();
                System.out.println("Enter the post id you want to delete: ");
                int postId = input.nextInt();
                user.deletePost(postId);
            }
            case 3 -> user.viewPost();
            case 4 -> {
                System.out.println("Enter the username of the user you want to follow: ");
                String username = input.next();
                user.follow(username);
            }
            case 5 -> {
                System.out.println("Enter the username of the user you want to unfollow: ");
                String username = input.next();
                user.unfollow(username);
            }
//            case 6 -> user.sendMessage();
//            case 7 -> user.viewMessages();
//            case 8 -> System.exit(0);
            default -> {
                System.out.println("Invalid option");
                options(user);
            }
        }
    }

    static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    static String getCurrentTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
