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

    public static void viewPost(int postId) {
        System.out.println(posts.get(postId).toString());
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
                "postId=" + postId + '\'' +
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

    public int getPostComments() {
        return postComments.size();
    }

    //view specific post
    static void viewSpecificPost(int i) {
        System.out.println("Post id: " + (posts.get(i).getPostId() + 1));
        System.out.println("Author: " + posts.get(i).getPostAuthor());
        System.out.println("Content: " + posts.get(i).getPostContent());
        System.out.println("Date: " + posts.get(i).getPostDate());
        System.out.println("Time: " + posts.get(i).getPostTime());
//        System.out.println("Likes: " + posts.get(i).getPostLikes());
        System.out.println("Comments: " + posts.get(i).getPostComments());
        System.out.println();

        //view post comments
        posts.get(i).viewPostComments();
    }

    void viewPostComments() {
        System.out.println("Comments");
        System.out.println("--------------------");
        for (Comment comment : postComments
        ) {
            System.out.println("Post id: " + (comment.getCommentPostId() + 1));
            System.out.println("Comment id: " + (comment.getCommentId() + 1));
            System.out.println("Author: " + comment.getCommentAuthor());
            System.out.println("Content: " + comment.getCommentContent());
            System.out.println("Date: " + comment.getCommentDate());
            System.out.println("Time: " + comment.getCommentTime());
            System.out.println();
        }
        System.out.println("--------------------");
    }


    //view all posts
    static void viewAllPosts() {
        System.out.println("All posts");
        for (Post post : posts
        ) {
            System.out.println("Post id: " + (post.getPostId() + 1));
            System.out.println("Author: " + post.getPostAuthor());
            System.out.println("Content: " + post.getPostContent());
            System.out.println("Date: " + post.getPostDate());
            System.out.println("Time: " + post.getPostTime());
//            System.out.println("Likes: " + post.getPostLikes());
            System.out.println("Comments: " + post.getPostComments());
            System.out.println();
        }
    }
}
