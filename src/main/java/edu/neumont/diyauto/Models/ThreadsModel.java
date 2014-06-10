package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "Threads")
/*@NamedQueries({
        @NamedQuery(name="byId", query="SELECT a FROM Threads a WHERE a.idThreads = :idThreads")
})*/
public class ThreadsModel {
    private int idThreads;
    private String name;
    private String description;
    private Collection<PostModel> postsByIdThreads;

    @Id
    @Column(name = "idThreads")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThreadsModel that = (ThreadsModel) o;

        if (idThreads != that.idThreads) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idThreads;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "threadsByThreadId")
    public Collection<PostModel> getPostsByIdThreads() {
        return postsByIdThreads;
    }

    public void setPostsByIdThreads(Collection<PostModel> postsByIdThreads) {
        this.postsByIdThreads = postsByIdThreads;
    }
}
