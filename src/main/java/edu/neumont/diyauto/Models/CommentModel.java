package edu.neumont.diyauto.Models;

public class CommentModel 
{
	private int ID;
	private Account user;
	private String comment = "";
	
	public CommentModel(int ID, Account user, String comment)
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
	public Account getUser() {
		return user;
	}
	
}
