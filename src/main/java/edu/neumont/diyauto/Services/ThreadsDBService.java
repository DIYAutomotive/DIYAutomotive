package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Blepoidevin on 6/5/2014.
 */
@Stateless
@LocalBean
@Local(ThreadsService.class)
public class ThreadsDBService implements  ThreadsService {
    @PersistenceContext(name="DIYAutomotive")
    EntityManager em;

    @Override
    public List<ThreadsModel> getAll() {
        return em.createQuery("SELECT t FROM ThreadsModel t", ThreadsModel.class).getResultList();
    }

    @Override
    public void updateThread(ThreadsModel thread) {
        em.persist(thread);

    }

    @Override
    public ThreadsModel getThread(int ID) {
        return em.find(ThreadsModel.class, ID);

    }

    @Override
    public void deleteThread(int ID) {
        ThreadsModel thread = em.find(ThreadsModel.class, ID);
        em.remove(thread);
    }

    @Override
    public int updatePost(int ID, PostModel post) {
        ThreadsModel thread = em.find(ThreadsModel.class,ID);
        thread.getPostsByIdThreads().add(post);
        em.persist(post);
        em.persist(thread);
        return post.getIdPost();
    }

    @Override
    public void deletePost(int threadID, PostModel post) {
//        ThreadsModel thread = em.find(ThreadsModel.class, threadID);
//        PostModel post = thread.getPostByPostId()
    }
}
