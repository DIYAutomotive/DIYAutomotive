package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.CommentModel;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;

import java.util.List;

/**
 * Created by Blepoidevin on 6/5/2014.
 */
public interface PostsService
{
    public List<PostModel> getAll(int ThreadID);
    public ThreadsModel getPost(int threadID, int postID);
    public void deleteComment (int threadID, int PostID, int CommentID);
    public void updateComment(int threadID, int PostID, CommentModel comment);
}
