package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;

import java.util.List;

/**
 * Created by Blepoidevin on 6/5/2014.
 */
public interface ThreadsService
{
    public List<ThreadsModel> getAll();
    public void updateThread (ThreadsModel thread);
    public ThreadsModel getThread(int ID);
    public void deleteThread (int ID);
    public int updatePost(int ID, PostModel post);
    public void deletePost(int threadID, PostModel post);
    public int newUpdatePost(int ID, PostModel post);
}
