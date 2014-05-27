package edu.neumont.diyauto.Models;

import java.util.HashMap;

public class Threads 
{
	
	HashMap<Integer, ThreadModel> ThreadMap;
	public Threads()
	{
		ThreadMap = new HashMap<Integer, ThreadModel>();
	}
	public void AddPost(ThreadModel thread)
	{
		ThreadMap.put(thread.getThreadID(), thread);
	}
	public ThreadModel getThread(int ID)
	{
		return (ThreadModel) ThreadMap.get(ID);
	}
	public void RemoveComment(int ID)
	{
		ThreadMap.remove(ID);
	}
}
