package edu.neumont.diyauto.Models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Threads 
{
	
	private Set<ThreadModel> ThreadMap;

    public Threads()
	{
		ThreadMap = new HashSet<ThreadModel>();
	}

    public Set<ThreadModel> getAll()
    {

       return ThreadMap;
    }

	public void AddPost(ThreadModel thread)
	{
        ThreadMap.add(thread);


	}

	public ThreadModel getThread(int ID)
	{
        for(ThreadModel thread : ThreadMap) {
            if(thread.getThreadID() == ID) {
                return thread;
            }
        }

		return null;
	}

	public void RemoveComment(int ID)
	{
		ThreadMap.remove(ID);
	}
}
