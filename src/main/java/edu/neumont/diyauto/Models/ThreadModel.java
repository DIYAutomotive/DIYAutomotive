package edu.neumont.diyauto.Models;

import javax.persistence.*;

@Entity
@Table(name="Threads")
public class ThreadModel 
{
    @Id
    @Column(name="idThread")
    @SequenceGenerator(name="account_role_seq", sequenceName="account_role_seq", initialValue=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="account_role_seq")
	private int ThreadID;

    @Column(name="Name", nullable = false)
	private String Name;

    @Column(name="postId",nullable = false)
    @OneToMany
	private Posts posts;

    @Column(name="Description",nullable = false)
	private String Description;

	public ThreadModel(int ThreadID, String Name)
	{
		this.ThreadID = ThreadID;
		this.Name = Name;
		this.posts = new Posts();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getThreadID() {
		return ThreadID;
	}
	public Posts getPosts() {
		return posts;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
