package org.example.exercise;

import java.util.ArrayList;

public class Post {
    private String postAuthor;
    private String postContent;
    private String postDate;
    private String postTime;


    public Post(String postAuthor, String postContent, String postDate, String postTime) {
        this.postAuthor = postAuthor;
        this.postContent = postContent;
        this.postDate = postDate;
        this.postTime = postTime;
    }

    void deletePost(Post post,int postNumber){
        System.out.println("Which post do you want to delete");
    }

    void displayPost(ArrayList<Post> userPost){
        System.out.println("Your posts");
        for (Post post:userPost
             ) {
            System.out.println(post.toString());
        }

    }

    void findPostByDate(ArrayList<Post> userPost, String date){
        System.out.println("Your posts on " + date);
        for (Post post:userPost
        ) {
            if (post.getPostDate().equals(date)){
                System.out.println(post.toString());
            }
        }
    }


    @Override
    public String toString() {
        return "Post{" +
                "postAuthor='" + postAuthor + '\'' +
                ", postContent='" + postContent + '\'' +
                ", postDate='" + postDate + '\'' +
                ", postTime='" + postTime + '\'' +
                '}';
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }
}
