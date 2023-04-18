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
            case 1 -> {
                System.out.println("Enter your post content: ");
                currentUser.addPost(new Post(currentUser.getUsername(),
                        input.next(),
                        getCurrentDate(),
                        getCurrentTime()));
            }
            case 2 -> {
                currentUser.viewPost();
                System.out.println("Enter the post id you want to delete: ");
                int postId = input.nextInt();
                currentUser.deletePost(postId);
            }
            case 3 -> {
                //display all posts with their ids
                for (Post post : Post.posts
                ) {
                    int postNumber = post.getPostId();
                    System.out.println("Post id: " + ++postNumber);
                    System.out.println("Post content: " + post.getPostContent());
                    System.out.println("Post author: " + post.getPostAuthor());
                    System.out.println("Post date: " + post.getPostDate());
                    System.out.println("Post time: " + post.getPostTime());
//                    System.out.println("Post likes: " + post.getPostLikes());
//                    System.out.println("Post comments: " + post.getPostComments());

                    //display all comments
//                    for (Comment comment : post.getPostComments()
//                    ) {
//                        System.out.println("Comment id: " + comment.getCommentId());
//                        System.out.println("Comment author: " + comment.getCommentAuthor());
//                        System.out.println("Comment content: " + comment.getCommentContent());
//                        System.out.println("Comment date: " + comment.getCommentDate());
//                        System.out.println("Comment time: " + comment.getCommentTime());
//                    }
                    System.out.println();
                }
            }
            case 4 -> {
                System.out.println("Enter the username of the user you want to follow: ");
                String username = input.next();
                currentUser.follow(username, currentUser);
            }
            case 5 -> {
                System.out.println("Enter the username of the user you want to unfollow: ");
                String username = input.next();
                currentUser.unfollow(username, currentUser);
            }
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
            case 7 -> currentUser.viewMessages();
            case 8 -> System.exit(0);
            case 9 -> {
//                System.out.println("Enter the post id you want to like: ");
//                int postId = input.nextInt();
//                currentUser.likePost(postId);
            }
            case 10 -> {
                //display all posts with their ids
                for (Post post : Post.posts
                ) {
                    int postNumber = post.getPostId();
                    System.out.println(++postNumber + ". " + post.getPostContent());
                }

                System.out.println("Enter the post id you want to comment on: ");
                int postId = input.nextInt();
                //check if post exists
                for (Post post : Post.posts
                ) {
                    if (postId - 1 == post.getPostId()) {
                        System.out.println("Enter your comment: ");
                        String comment = input.next();
                        post.addComment(new Comment(currentUser.getUsername(), comment, getCurrentDate(), getCurrentTime(), postId));
                        break;
                    }
                }

                System.out.println("Post not found");
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
