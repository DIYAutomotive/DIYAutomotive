package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "Comment", schema = "diyauto")
public class CommentModel {
    private int idComment;
    private String comment;
    private int userId;
    private int postId;
    private AccountModel accountByUserId;
    private PostModel postByPostId;

    @Id
    @Column(name = "idComment")
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    @Basic
    @Column(name = "Comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "postId")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentModel that = (CommentModel) o;

        if (idComment != that.idComment) return false;
        if (postId != that.postId) return false;
        if (userId != that.userId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + postId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "idUser", nullable = false, insertable = false, updatable = false)
    public AccountModel getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountModel accountByUserId) {
        this.accountByUserId = accountByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "postId", referencedColumnName = "idPost", nullable = false, insertable = false, updatable = false)
    public PostModel getPostByPostId() {
        return postByPostId;
    }

    public void setPostByPostId(PostModel postByPostId) {
        this.postByPostId = postByPostId;
    }
}
