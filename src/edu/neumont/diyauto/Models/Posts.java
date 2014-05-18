package edu.neumont.diyauto.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Posts 
{
	HashMap postMap;
	public Posts()
	{
		postMap = new HashMap();
	}
	public void AddPost(CommentModel comment)
	{
		postMap.put(comment.getID(), comment);
	}
	public PostModel getComment(int ID)
	{
		return (PostModel) postMap.get(ID);
	}
	public void RemoveComment(int ID)
	{
		postMap.remove(ID);
	}
	public HashMap getPostMap() {
		return postMap;
	}
	
	
	
}
