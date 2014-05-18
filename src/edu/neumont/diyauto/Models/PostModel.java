package edu.neumont.diyauto.Models;

public class PostModel 
{
	private int PostID;
	private int UserID;
	private String Description;
	private Comments comments;
	public PostModel(int PostID, int UserID, String Description)
	{
		this.PostID = PostID;
		this.UserID = UserID;
		this.Description = Description;
		comments = new Comments();
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPostID() {
		return PostID;
	}
	public int getUserID() {
		return UserID;
	}
	public Comments getComments() {
		return comments;
	}
	
}
