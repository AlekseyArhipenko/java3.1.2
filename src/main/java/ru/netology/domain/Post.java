package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private Like likesInfo;
    private Comment commentsInfo;
    private Repost repostInfo;
    private View viewsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public Like getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(Like likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Comment getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(Comment commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Repost getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(Repost repostInfo) {
        this.repostInfo = repostInfo;
    }

    public View getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(View viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}
