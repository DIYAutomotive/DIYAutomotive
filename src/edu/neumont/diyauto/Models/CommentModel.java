package edu.neumont.diyauto.Models;

public class CommentModel 
{
	int ID;
	int userID;
	String comment = "";
	
	public CommentModel(int ID, int userID, String comment)
	{
		this.ID = ID;
		this.userID = userID;
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
	public int getUserID() {
		return userID;
	}
	
}
