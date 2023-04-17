package org.example.exercise;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String email;
    ArrayList<Post> userPosts;
    static ArrayList<User> users = new ArrayList<>();

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        userPosts = new ArrayList<>();
        users.add(this);
    }

    public void addPost(Post post) {
        userPosts.add(post);
        System.out.println("Post successfully added");
    }

    public void deletePost(int postIndex) {
        Post post = userPosts.get(postIndex);
        userPosts.remove(post);
        System.out.println("Post successfully deleted");
    }

    public void findPost(String postContent) {
        for (Post post : userPosts
        ) {
            if (post.getPostContent().equals(postContent)) {
                System.out.println("Post found");
                System.out.println(post.toString());
            }
        }
    }

    public void follow(String username) {
        System.out.println("You are now following " + username);

    }

    public void unfollow(String username) {
        System.out.println("You are no longer following " + username);
    }

    public void sendMessage(String message, User user) {
        System.out.println("Your message is " + message + " to " + user);
    }

    public void viewUsers() {
        System.out.println("Viewing users");
        for (User user : users
        ) {
            System.out.println(user.getUsername());
        }
    }


    public void viewPost() {
        System.out.println("Viewing post");
        for (Post post : userPosts
        ) {
            System.out.println(post.toString());
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
