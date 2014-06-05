package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/5/14.
 */
@Entity
@Table(name = "Post", schema = "", catalog = "diyauto")
public class PostModel {
    private int idPost;
    private int userId;
    private String description;
    private int commentId;
    private String title;
    private AccountModel accountByUserId;
    private CommentModel commentByCommentId;
    private Collection<ThreadsModel> threadsesByIdPost;

    @Id
    @Column(name = "idPost")
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
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
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "CommentID")
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostModel postModel = (PostModel) o;

        if (commentId != postModel.commentId) return false;
        if (idPost != postModel.idPost) return false;
        if (userId != postModel.userId) return false;
        if (description != null ? !description.equals(postModel.description) : postModel.description != null)
            return false;
        if (title != null ? !title.equals(postModel.title) : postModel.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPost;
        result = 31 * result + userId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + commentId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "idUser", nullable = false)
    public AccountModel getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountModel accountByUserId) {
        this.accountByUserId = accountByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "CommentID", referencedColumnName = "idComment", nullable = false)
    public CommentModel getCommentByCommentId() {
        return commentByCommentId;
    }

    public void setCommentByCommentId(CommentModel commentByCommentId) {
        this.commentByCommentId = commentByCommentId;
    }

    @OneToMany(mappedBy = "postByPostId")
    public Collection<ThreadsModel> getThreadsesByIdPost() {
        return threadsesByIdPost;
    }

    public void setThreadsesByIdPost(Collection<ThreadsModel> threadsesByIdPost) {
        this.threadsesByIdPost = threadsesByIdPost;
    }
}
