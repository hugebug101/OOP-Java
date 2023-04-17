package org.example.exercise;

public class Like {
    private String likeAuthor;
    private String likeDate;
    private String likeTime;
    private Comment commentTag;

    public Like(String likeAuthor, String likeDate, String likeTime, Post postTag) {
        this.likeAuthor = likeAuthor;
        this.likeDate = likeDate;
        this.likeTime = likeTime;
        this.commentTag = commentTag;
    }

    public String getLikeAuthor() {
        return likeAuthor;
    }

    public void setLikeAuthor(String likeAuthor) {
        this.likeAuthor = likeAuthor;
    }

    public String getLikeDate() {
        return likeDate;
    }

    public void setLikeDate(String likeDate) {
        this.likeDate = likeDate;
    }

    public String getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(String likeTime) {
        this.likeTime = likeTime;
    }

    public Comment getCommentTag() {
        return commentTag;
    }

    public void setCommentTag(Comment commentTag) {
        this.commentTag = commentTag;
    }


}
