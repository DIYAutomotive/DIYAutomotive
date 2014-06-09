package edu.neumont.diyauto.Framework;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by jjensen on 6/6/14.
 */
//@WebListener
public class RequestServletInjectingServletListener implements ServletRequestListener {
        private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<>();

        @Override
        public void requestDestroyed(ServletRequestEvent arg0) {
            requestHolder.remove();
        }

        @Override
        public void requestInitialized(ServletRequestEvent arg0) {
            requestHolder.set((HttpServletRequest)arg0.getServletRequest());
        }

//        @Produces @Named("innerRequest")
//        @RequestScoped
//        public HttpServletRequest getInstance() {
//            return requestHolder.get();
//        }
}
