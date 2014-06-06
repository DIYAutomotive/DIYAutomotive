package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.CommentModel;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Blepoidevin on 6/5/2014.
 */
public interface PostsService
{
    public Collection<PostModel> getAll(int ThreadID);
    public PostModel getPost(int postID);
    public void deleteComment (int threadID, int PostID, int CommentID);
    public void updateComment(int PostID, CommentModel comment);
}
