package edu.neumont.diyauto.Models;

import javax.persistence.*;

@Entity
@Table(name="Comment")
public class CommentModel 
{
    @Id
    @Column(name="idComment")
    @SequenceGenerator(name="account_seq", sequenceName="account_seq", initialValue=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="account_seq")
	int ID;

    @Column(name="USerID", nullable = false)
	int userID;

    @Column(name="Comment", nullable = false)
	String comment = "";

	private UserModel user;

	
	public CommentModel(int ID, UserModel user, String comment)
	{
		this.ID = ID;
		this.user = user;
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getID() {
		return ID;
	}
	public UserModel getUser() {
		return user;
	}
	
}
