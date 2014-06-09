package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by jjensen on 6/9/14.
 */
@Entity
@Table(name = "Account", schema = "diyauto")
public class AccountModel {
    private int idUser;
    private String passWord;
    private String email;
    private String avatar;
    private String username;
    private Collection<AccountRoleModel> accountRolesByIdUser;
    private Collection<CarsModel> carsesByIdUser;
    private Collection<PostModel> postsByIdUser;
    private Collection<CommentModel> commentsByIdUser;

    @Id
    @Column(name = "idUser")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "PassWord")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountModel that = (AccountModel) o;

        if (idUser != that.idUser) return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (passWord != null ? !passWord.equals(that.passWord) : that.passWord != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "accountByUserId")
    public Collection<AccountRoleModel> getAccountRolesByIdUser() {
        return accountRolesByIdUser;
    }

    public void setAccountRolesByIdUser(Collection<AccountRoleModel> accountRolesByIdUser) {
        this.accountRolesByIdUser = accountRolesByIdUser;
    }

    @OneToMany(mappedBy = "accountByUserId")
    public Collection<CarsModel> getCarsesByIdUser() {
        return carsesByIdUser;
    }

    public void setCarsesByIdUser(Collection<CarsModel> carsesByIdUser) {
        this.carsesByIdUser = carsesByIdUser;
    }

    @OneToMany(mappedBy = "accountByUserId")
    public Collection<PostModel> getPostsByIdUser() {
        return postsByIdUser;
    }

    public void setPostsByIdUser(Collection<PostModel> postsByIdUser) {
        this.postsByIdUser = postsByIdUser;
    }

    @OneToMany(mappedBy = "accountByUserId")
    public Collection<CommentModel> getCommentsByIdUser() {
        return commentsByIdUser;
    }

    public void setCommentsByIdUser(Collection<CommentModel> commentsByIdUser) {
        this.commentsByIdUser = commentsByIdUser;
    }
}
