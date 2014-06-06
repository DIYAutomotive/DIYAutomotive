package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.CommentModel;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * Created by Blepoidevin on 6/5/2014.
 */
@Stateless
@LocalBean
@Local(PostsService.class)
public class PostsDBService implements PostsService
{
    @PersistenceContext(name="DIYAutomotive")
    EntityManager em;
    @Override
    public Collection<PostModel> getAll(int ThreadID) {
        ThreadsModel thread = em.find(ThreadsModel.class, ThreadID);
        return thread.getPostByPostId();
    }
    @Override
    public PostModel getPost(int postID) {
        return em.find(PostModel.class, postID);
    }
    @Override
    public void deleteComment(int threadID, int PostID, int CommentID) {

    }
    @Override
    public void updateComment(int PostID, CommentModel comment) {
        PostModel post = em.find(PostModel.class, PostID);
        post.setCommentId(comment.getIdComment());
        em.persist(post);
    }
}
