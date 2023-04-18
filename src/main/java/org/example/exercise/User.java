package org.example.exercise;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String email;
    ArrayList<Post> userPosts = new ArrayList<>();
    ArrayList<User> following = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();

    static ArrayList<User> users = new ArrayList<>();

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        users.add(this);
    }

    public void addPost(Post post) {
        System.out.println("Post successfully added");
        userPosts.add(post);

        //add post to posts arraylist
        Post.posts.add(post);
    }

    public void deletePost(int postIndex) {
        Post post = userPosts.get(postIndex);
        System.out.println("Post successfully deleted");
        userPosts.remove(post);

        //delete post from posts arraylist
        Post.posts.remove(post);
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

    public void follow(String username, User currentUser) {
        //check if user is following the user
        for (User followingUser : following
        ) {
            if (followingUser.getUsername().equals(username)) {
                System.out.println("You are already following " + username);
                return;
            }
        }

        //check if user exists
        for (User user : users
        ) {
            if (user.getUsername().equals(username)) {
                System.out.println("You are now following " + username);
                currentUser.following.add(user);
                return;
            }
        }

        System.out.println("User not found");
    }

    public void unfollow(String username, User currentUser) {
        //check if user is following the user
        for (User followingUser : following
        ) {
            if (followingUser.getUsername().equals(username)) {
                System.out.println("You are already following " + username);
                return;
            }
        }

        for (User user : users
        ) {
            if (user.getUsername().equals(username)) {
                System.out.println("You are no longer following " + username);
                currentUser.following.remove(user);
                return;
            }
        }

        System.out.println("User not found");
    }

    public void sendMessage(String message, String username) {
        //find user to send message to
        for (User user : users
        ) {
            if (user.getUsername().equals(username)) {
                System.out.println("Message sent");
                user.messages.add(message);
                return;
            }
        }

        System.out.println("User not found");
    }

    //check if user exist
    public static boolean checkUser(String username) {
        for (User user : users
        ) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void viewUsers() {
        System.out.println("Viewing users");
        for (User user : users
        ) {
            System.out.println(user.getUsername());
        }
    }

    public void viewFollowing() {
        System.out.println("Viewing following");
        for (User user : following
        ) {
            System.out.println(user.getUsername());
        }
    }

    public void viewMessages() {
        //if messages is empty
        if (messages.size() == 0) {
            System.out.println("You have no messages");
        } else {
            System.out.println("Viewing messages");
            for (int i = 0; i < messages.size(); i++) {
                System.out.println(i + " " + messages.get(i));
            }
        }
    }

    public void viewPost() {
        if (userPosts.size() == 0) {
            System.out.println("Dont have any posts yet");
        } else {
            System.out.println("Viewing posts");
            for (int i = 0; i < userPosts.size(); i++) {
                System.out.println(i + 1 + " - " + userPosts.get(i).getPostContent() + " By "
                        + userPosts.get(i).getPostAuthor()
                        + " on " + userPosts.get(i).getPostDate()
                        + " " + userPosts.get(i).getPostTime());
            }
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

//    public void likePost(int postId) {
//        Post post = Post.posts.get(postId);
//        post.setLikes(post.getLikes() + 1);
//        System.out.println("Post liked");
//    }
}
