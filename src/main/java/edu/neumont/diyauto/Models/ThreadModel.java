package edu.neumont.diyauto.Models;

public class ThreadModel 
{
	private int ThreadID;
	private String Name;
	private Posts posts;
	private String Description;
	public ThreadModel(int ThreadID, String Name)
	{
		this.ThreadID = ThreadID;
		this.Name = Name;
		this.posts = new Posts();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getThreadID() {
		return ThreadID;
	}
	public Posts getPosts() {
		return posts;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
