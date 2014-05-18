package edu.neumont.diyauto.Models;

import java.util.HashMap;

public class Comments 
{
	private HashMap commentsList;
	public Comments()
	{
		commentsList = new HashMap();
	}	
	public HashMap getCommentsList() {
		return commentsList;
	}	
	public void AddComment(CommentModel comment)
	{
		commentsList.put(comment.getID(), comment);
	}
	public CommentModel getComment(int ID)
	{
		return (CommentModel) commentsList.get(ID);
	}
	public void RemoveComment(int ID)
	{
		commentsList.remove(ID);
	}
	
	
}
