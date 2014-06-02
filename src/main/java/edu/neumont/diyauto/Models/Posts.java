package edu.neumont.diyauto.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Posts 
{
	HashMap<Integer, PostModel> postMap;
	public Posts()
	{
		postMap = new HashMap<Integer, PostModel>();
	}
	public void AddPost(PostModel post)
	{
		postMap.put(post.getPostID(), post);
	}
	public PostModel getPostByID(int ID) {
        return (PostModel) postMap.get(ID);
    }
	public void RemoveComment(int ID)
	{
		postMap.remove(ID);
	}

	
	
}
