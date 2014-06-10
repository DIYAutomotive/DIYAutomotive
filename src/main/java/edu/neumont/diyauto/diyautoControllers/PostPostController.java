package edu.neumont.diyauto.diyautoControllers;

import edu.neumont.diyauto.Models.*;
import edu.neumont.diyauto.ServiceLoader;
import edu.neumont.diyauto.Services.PostsService;
import edu.neumont.diyauto.Services.ThreadsService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@RequestScoped
public class PostPostController
{
    @Inject ThreadsService threadsService;
    @Inject PostsService postsService;
    @Inject HttpServletRequest request;

//    public PostPostController(HttpServletRequest request, HttpServletResponse response)
//    {
//        this.request = request;
//        this.response = response;
//    }
    public ModelAndView createPost(int threadID)
    {

        String title = request.getParameter("title");
        String body = request.getParameter("postBody");
        //String tags = request.getParameter()
        PostModel post = new PostModel();
        post.setDescription(body);
        post.setTitle(title);
        post.setUserId(1);
        post.setThreadId(threadID);

        int postId = threadsService.updatePost(threadID, post);

        ModelAndView MAV = new ModelAndView(null, "/threads/" + threadID+"/post/" + postId );

        return MAV;
    }
    public ModelAndView addComment(int threadID, int postID)
    {
        ThreadsModel thread = threadsService.getThread(threadID);
        PostModel post = postsService.getPost(postID);
        String comment = request.getParameter("comment");
        CommentModel Comment = new CommentModel();
        Comment.setComment(comment);
        //post.setCommentId(Comment.getIdComment());
        ModelAndView MAV = new ModelAndView(null, "/threads/" + threadID+"/post/" + postID);
        return MAV;
    }
}
