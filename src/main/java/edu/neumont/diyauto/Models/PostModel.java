package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "Post", schema = "diyauto")
public class PostModel {
    private int idPost;
    private int userId;
    private String description;
    private String title;
    private int threadId;
    private AccountModel accountByUserId;
    private ThreadsModel threadsByThreadId;
    private Collection<CommentModel> commentsByIdPost;

    @Id
    @Column(name = "idPost")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

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
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "threadId")
    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostModel postModel = (PostModel) o;

        if (idPost != postModel.idPost) return false;
        if (threadId != postModel.threadId) return false;
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
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + threadId;
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
    @JoinColumn(name = "threadId", referencedColumnName = "idThreads", nullable = false, insertable = false, updatable = false)
    public ThreadsModel getThreadsByThreadId() {
        return threadsByThreadId;
    }

    public void setThreadsByThreadId(ThreadsModel threadsByThreadId) {
        this.threadsByThreadId = threadsByThreadId;
    }

    @OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "postByPostId")
    public Collection<CommentModel> getCommentsByIdPost() {
        return commentsByIdPost;
    }

    public void setCommentsByIdPost(Collection<CommentModel> commentsByIdPost) {
        this.commentsByIdPost = commentsByIdPost;
    }
}
