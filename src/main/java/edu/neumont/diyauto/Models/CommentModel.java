package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by jjensen on 6/5/14.
 */
@Entity
@Table(name = "Comment", schema = "", catalog = "diyauto")
public class CommentModel {
    private int idComment;
    private String comment;
    private int userId;
    private AccountModel accountByUserId;
    private PostModel postsByIdComment;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentModel that = (CommentModel) o;

        if (idComment != that.idComment) return false;
        if (userId != that.userId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + userId;
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
    @JoinColumn(name = "idComment", referencedColumnName = "CommentID", nullable = false , insertable = false, updatable = false)
    public PostModel getPostsByIdComment() {
        return postsByIdComment;
    }

    public void setPostsByIdComment(PostModel postsByIdComment) {
        this.postsByIdComment = postsByIdComment;
    }
}
