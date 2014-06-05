package edu.neumont.diyauto.Models;

import javax.persistence.*;

/**
 * Created by jjensen on 6/5/14.
 */
@Entity
@Table(name = "Threads", schema = "", catalog = "diyauto")
public class ThreadsModel {
    private int idThreads;
    private String name;
    private String description;
    private int postId;
    private PostModel postByPostId;

    @Id
    @Column(name = "idThreads")
    public int getIdThreads() {
        return idThreads;
    }

    public void setIdThreads(int idThreads) {
        this.idThreads = idThreads;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        ThreadsModel that = (ThreadsModel) o;

        if (idThreads != that.idThreads) return false;
        if (postId != that.postId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idThreads;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + postId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "postId", referencedColumnName = "idPost", nullable = false)
    public PostModel getPostByPostId() {
        return postByPostId;
    }

    public void setPostByPostId(PostModel postByPostId) {
        this.postByPostId = postByPostId;
    }
}
