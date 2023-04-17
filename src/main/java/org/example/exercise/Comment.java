package org.example.exercise;

public class Comment {
    private String commentAuthor;
    private String commentContent;
    private String commentDate;
    private String commentTime;
    private Post postTag;
    private boolean isDeleted;
    private boolean isEdited;
    private boolean isLiked;

    public Comment(String commentAuthor, String commentContent, String commentDate, String commentTime, Post postTag) {
        this.commentAuthor = commentAuthor;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.commentTime = commentTime;
        this.postTag = postTag;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setEdited(boolean edited) {
        isEdited = edited;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public boolean isEdited() {
        return isEdited;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public Post getPostTag() {
        return postTag;
    }

    public void setPostTag(Post postTag) {
        this.postTag = postTag;
    }
}
