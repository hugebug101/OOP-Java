package org.example.exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SocialMedia {
    public static Scanner input = new Scanner(System.in);
    static User currentUser;
    static String username;
    static String password;
    static boolean isValid = false;


    public static void main(String[] args) {

        User user1 = new User("john", "doe", "john@doe.com");
        new User("jane", "doe", "jane@doe.com");
        new User("anas", "123", "anas@123.com");
        new User("mohammed", "123", "mohammed@123.com");

        System.out.println("Welcome to our social media");


        currentUser = user1;

        Post.posts.add(new Post(currentUser.getUsername(),
                "Hello World",
                "2020-12-12",
                "12:12:12"));
        //add another post
        Post.posts.add(new Post(currentUser.getUsername(),
                "Hello Dunia",
                "2020-12-12",
                "12:12:12"));

        //add comment to the second post
        Post.posts.get(1).addComment(new Comment(currentUser.getUsername(),
                "First comment",
                getCurrentDate(),
                getCurrentTime(),
                1));

        //get the first post
        Post post1 = Post.posts.get(0);
        System.out.println(post1.toString());

        //get the second post
        Post post = Post.posts.get(1);
        System.out.println(post.toString());


//        do {
//
//            System.out.println();
//            System.out.println("Please enter your username");
//            username = input.nextLine();
//            System.out.println("Please enter your password");
//            password = input.nextLine();
//
//            //check if user exists
//            for (User user : User.users
//            ) {
//                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//                    currentUser = user;
//                    isValid = true;
//                    break;
//                }
//            }
//
//            if (!isValid) {
//                System.out.println("Wrong username or password");
//            }
//        } while (!isValid);

        System.out.println("\nWelcome " + currentUser.getUsername() + "!\n");
        System.out.println("Select an option");

        do {
            options(currentUser);
            System.out.println("Do you want to continue? (y/n)");
            String answer = input.next();
            if (answer.equals("n")) {
                System.out.println("Thank you for using our social media");
                System.exit(0);
            }
        } while (true);
    }

    static void options(User currentUser) {
        System.out.println("Options:");
        System.out.println("1. Create a new post");
        System.out.println("2. Delete a post");
        System.out.println("3. View all posts");
        System.out.println("4. Follow a user");
        System.out.println("5. Unfollow a user");
        System.out.println("6. Send a message");
        System.out.println("7. View all messages");
        System.out.println("8. Exit");
        System.out.println("9. Like a post");
        System.out.println("10. Comment on a post");
        System.out.println("Enter your option: ");
        int option = input.nextInt();
        switch (option) {
            //create a new post
            case 1 -> {
                System.out.println("Enter your post content: ");
                currentUser.addPost(new Post(currentUser.getUsername(),
                        input.next(),
                        getCurrentDate(),
                        getCurrentTime()));
            }
            //delete a post
            case 2 -> {
                currentUser.viewPost();
                System.out.println("Enter the post id you want to delete: ");
                int postId = input.nextInt();
                currentUser.deletePost(postId);
            }
            //view all posts
            case 3 -> {

                Post.viewAllPosts();

                //prompt user if they want to see the post in detail with comments
                System.out.println("Do you want to see the post in detail? (y/n)");
                String answer = input.next();
                if (answer.equals("y")) {
                    System.out.println("Enter the post id: ");
                    int postId = input.nextInt();
                    Post.viewSpecificPost(postId - 1);
                }
            }
            //follow a user
            case 4 -> {
                System.out.println("Enter the username of the user you want to follow: ");
                String username = input.next();
                currentUser.follow(username, currentUser);
            }
            //unfollow a user
            case 5 -> {
                System.out.println("Enter the username of the user you want to unfollow: ");
                String username = input.next();
                currentUser.unfollow(username, currentUser);
            }
            //send a message
            case 6 -> {
                System.out.println("Enter the username of the user you want to send a message to: ");
                String username = input.next();
                if (!User.checkUser(username)) {
                    System.out.println("User not found");
                } else {
                    System.out.println("Enter your message: ");
                    String message = input.next();
                    currentUser.sendMessage(message, username);
                }
            }
            //view all messages
            case 7 -> currentUser.viewMessages();
            case 8 -> System.exit(0);
            //like a post
            case 9 -> {
//                System.out.println("Enter the post id you want to like: ");
//                int postId = input.nextInt();
//                currentUser.likePost(postId);
            }
            //comment on a post
            case 10 -> {
//                for (Post post : Post.posts
//                ) {
//                    int postNumber = post.getPostId();
//                    System.out.println(++postNumber + ". " + post.getPostContent());
//                }

                Post.viewAllPosts();

                System.out.println("Enter the post id you want to comment on: ");
                int postId = input.nextInt();
                input.nextLine(); //clear buffer
                boolean commentExists = false;
                //check if post exists
                for (Post post : Post.posts
                ) {

                    if (postId - 1 == post.getPostId()) {
                        System.out.println("Enter your comment: ");
                        String comment = input.nextLine();
                        post.addComment(new Comment(currentUser.getUsername(), comment, getCurrentDate(), getCurrentTime(), post.getPostId()));
                        commentExists = true;
                        System.out.println("Comment added");
                        break;
                    }
                }
                if (!commentExists) {
                    System.out.println("Post not found");
                }
            }
            default -> {
                System.out.println("Invalid option");
                options(currentUser);
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
