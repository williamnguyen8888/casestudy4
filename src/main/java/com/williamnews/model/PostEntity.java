package com.williamnews.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "post", schema = "williamnews", catalog = "")
public class PostEntity {
    private int id;
    private String namePost;
    private Integer accountId;
    private Integer postCategoryId;
    private Integer postLayoutId;
    private Integer postTag;
    private String photo;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private String content;
    private Integer postCommentStatusId;
    private Integer isActive;
    private Timestamp publishedTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NamePost")
    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    @Basic
    @Column(name = "AccountId")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "PostCategoryId")
    public Integer getPostCategoryId() {
        return postCategoryId;
    }

    public void setPostCategoryId(Integer postCategoryId) {
        this.postCategoryId = postCategoryId;
    }

    @Basic
    @Column(name = "PostLayoutId")
    public Integer getPostLayoutId() {
        return postLayoutId;
    }

    public void setPostLayoutId(Integer postLayoutId) {
        this.postLayoutId = postLayoutId;
    }

    @Basic
    @Column(name = "PostTag")
    public Integer getPostTag() {
        return postTag;
    }

    public void setPostTag(Integer postTag) {
        this.postTag = postTag;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "ViewCount")
    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Basic
    @Column(name = "CommentCount")
    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Basic
    @Column(name = "LikeCount")
    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "PostCommentStatusID")
    public Integer getPostCommentStatusId() {
        return postCommentStatusId;
    }

    public void setPostCommentStatusId(Integer postCommentStatusId) {
        this.postCommentStatusId = postCommentStatusId;
    }

    @Basic
    @Column(name = "isActive")
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Basic
    @Column(name = "PublishedTime")
    public Timestamp getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Timestamp publishedTime) {
        this.publishedTime = publishedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return id == that.id && Objects.equals(namePost, that.namePost) && Objects.equals(accountId, that.accountId) && Objects.equals(postCategoryId, that.postCategoryId) && Objects.equals(postLayoutId, that.postLayoutId) && Objects.equals(postTag, that.postTag) && Objects.equals(photo, that.photo) && Objects.equals(viewCount, that.viewCount) && Objects.equals(commentCount, that.commentCount) && Objects.equals(likeCount, that.likeCount) && Objects.equals(content, that.content) && Objects.equals(postCommentStatusId, that.postCommentStatusId) && Objects.equals(isActive, that.isActive) && Objects.equals(publishedTime, that.publishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namePost, accountId, postCategoryId, postLayoutId, postTag, photo, viewCount, commentCount, likeCount, content, postCommentStatusId, isActive, publishedTime);
    }
}
