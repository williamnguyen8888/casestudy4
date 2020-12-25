package com.williamnews.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "williamnews", catalog = "")
public class CommentEntity {
    private int id;
    private Integer accountCommentId;
    private Integer postCommentId;
    private String contentComment;
    private Integer isActive;
    private Timestamp timeComment;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AccountCommentId")
    public Integer getAccountCommentId() {
        return accountCommentId;
    }

    public void setAccountCommentId(Integer accountCommentId) {
        this.accountCommentId = accountCommentId;
    }

    @Basic
    @Column(name = "PostCommentId")
    public Integer getPostCommentId() {
        return postCommentId;
    }

    public void setPostCommentId(Integer postCommentId) {
        this.postCommentId = postCommentId;
    }

    @Basic
    @Column(name = "ContentComment")
    public String getContentComment() {
        return contentComment;
    }

    public void setContentComment(String contentComment) {
        this.contentComment = contentComment;
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
    @Column(name = "TimeComment")
    public Timestamp getTimeComment() {
        return timeComment;
    }

    public void setTimeComment(Timestamp timeComment) {
        this.timeComment = timeComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntity that = (CommentEntity) o;
        return id == that.id && Objects.equals(accountCommentId, that.accountCommentId) && Objects.equals(postCommentId, that.postCommentId) && Objects.equals(contentComment, that.contentComment) && Objects.equals(isActive, that.isActive) && Objects.equals(timeComment, that.timeComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountCommentId, postCommentId, contentComment, isActive, timeComment);
    }
}
