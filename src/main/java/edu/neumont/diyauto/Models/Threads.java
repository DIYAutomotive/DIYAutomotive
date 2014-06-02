package edu.neumont.diyauto.Models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Threads 
{
	
	private Set<ThreadModel> threadMap;

    public Threads()
	{
		threadMap = new HashSet<ThreadModel>();
	}

    public Set<ThreadModel> getAll()
    {

       return threadMap;
    }

	public void AddThread(ThreadModel thread)
	{
        threadMap.add(thread);


	}

	public ThreadModel getThread(int ID)
	{
        for(ThreadModel thread : threadMap) {
            if(thread.getThreadID() == ID) {
                return thread;
            }
        }

		return null;
	}

	public void RemoveComment(int ID)
	{
		threadMap.remove(ID);
	}
}
