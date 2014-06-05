package edu.neumont.diyauto.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="AccountRole")
public class AccountRole {
	@Id
	@Column(name="id")
	@SequenceGenerator(name="account_role_seq", sequenceName="account_role_seq", initialValue=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="account_role_seq")
	private Long id;
	
	@OneToMany
	//@JoinColumn(name="UserId")
	private Set<Account> accounts;
	
	@Column(name="Role")
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    public AccountRole() {
        accounts = new HashSet<>();
    }

/*
	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}
*/

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
