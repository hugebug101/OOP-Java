package org.example.exercise;

import java.util.ArrayList;

public class Post {
    private int postId;
    private String postAuthor;
    private String postContent;
    private String postDate;
    private String postTime;
    ArrayList<Integer> postsId = new ArrayList<>();
    ArrayList<Like> postLikes = new ArrayList<>();
    ArrayList<Comment> postComments = new ArrayList<>();
    static ArrayList<Post> posts = new ArrayList<>();

    public Post(String postAuthor, String postContent, String postDate, String postTime) {
        this.postAuthor = postAuthor;
        this.postContent = postContent;
        this.postDate = postDate;
        this.postTime = postTime;
        this.postId = posts.size();
    }

    void displayUserPost(ArrayList<Post> userPost) {
        if (userPost.size() == 0) {
            System.out.println("You have no posts");
        } else {
            System.out.println("Your posts");
            for (Post post : userPost
            ) {
                System.out.println(post.toString());
            }
        }
    }

    static void findPostByDate(String date) {
        System.out.println("Posts on " + date);
        for (Post post : posts
        ) {
            if (post.getPostDate().equals(date)) {
                System.out.println(post.toString());
            }
        }
    }

    static void findPostByDate(ArrayList<Post> userPost, String date) {
        System.out.println("Your posts on " + date);
        for (Post post : userPost
        ) {
            if (post.getPostDate().equals(date)) {
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

    public void addComment(Comment comment) {
        postComments.add(comment);
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    void getPostsId() {
        System.out.println("Your posts id");
        for (int id : postsId
        ) {
            System.out.println(id);
        }
    }

    //get specific post by id
    static Post getPostById(int id) {
        for (Post post : posts
        ) {
            if (post.getPostId() == id) {
                return post;
            }
        }
        return null;
    }
}
