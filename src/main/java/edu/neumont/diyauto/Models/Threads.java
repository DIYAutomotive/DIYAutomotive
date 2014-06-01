package edu.neumont.diyauto.Models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Threads 
{
	
	HashMap<Integer, ThreadModel> ThreadMap;
	public Threads()
	{
		ThreadMap = new HashMap<Integer, ThreadModel>();
	}
    public HashSet<ThreadModel> getAll()
    {
       HashSet<ThreadModel> allThreads = new HashSet<>();
        for (ThreadModel value : ThreadMap.values())
        {
            allThreads.add(value);
        }
       return allThreads;
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
