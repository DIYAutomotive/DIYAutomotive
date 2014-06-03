package edu.neumont.diyauto.Models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import edu.neumont.diyauto.DIYEnums.UserTypes;

@Entity
@Table(name="Account")
@NamedQueries({
	@NamedQuery(name="byUsername", query="SELECT a FROM Account a WHERE a.username = :username")
})
public class Account{
	@Id
	@Column(name="idUser")
	@SequenceGenerator(name="account_role_seq", sequenceName="account_role_seq", initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="account_role_seq")
	private int UserID;
	
	@Column(name="username", unique=true)
	private String username;
	
	@Column(name="PassWord")
	private String password;
		
	@Column(name="Email")
	private String Email;
	
	@Column(name="Avatar")
	private String Avatar;
	
	@Column(name="userType")
	private UserTypes userType;
	
//	@OneToMany(fetch=FetchType.EAGER, mappedBy="account", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
//	private Set<AccountRole> roles = new HashSet<>();
	
	public Account(int UserID, String UserName, Date DateOfBirth, String Email, String Avatar, UserTypes userType){
		this.UserID = UserID;
		this.username = UserName;
		this.Email = Email;
		this.Avatar = Avatar;
		this.userType = userType;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAvatar() {
		return Avatar;
	}
	public void setAvatar(String avatar) {
		Avatar = avatar;
	}
	public UserTypes getUserType() {
		return userType;
	}
	public void setUserType(UserTypes userType) {
		this.userType = userType;
	}
	public int getUserID() {
		return UserID;
	}
	public String getUsername() {
		return username;
	}
//	public Set<AccountRole> getRoles() {
//		return Collections.unmodifiableSet(roles);
//	}
//	
//	public void addRole(Role user) {
//		AccountRole ar = new AccountRole();
//		ar.setRole(user);
//		ar.setUsername(username);
//		roles.add(ar);
//	}

}
