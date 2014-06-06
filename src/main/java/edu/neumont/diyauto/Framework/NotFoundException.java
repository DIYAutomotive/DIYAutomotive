package edu.neumont.diyauto.Framework;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Throw this exception to cause MainServlet to return a 404
 * 
 * @author jcummings
 *
 */
public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(message);
	}

    /**
     * A listener that uses the ThreadLocal pattern to make the request object
     * available for dependency injection.
     *
     * The @Produces annotation is the opposite of the @Inject annotation.
     *
     * @author jcummings
     *
     */
    @WebListener
    public static class RequestInjectingServletRequestListener implements
            ServletRequestListener {
        private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<>();

        @Override
        public void requestDestroyed(ServletRequestEvent arg0) {
            requestHolder.remove();
        }

        @Override
        public void requestInitialized(ServletRequestEvent arg0) {
            requestHolder.set((HttpServletRequest)arg0.getServletRequest());
        }

        @Produces
        @RequestScoped
        public HttpServletRequest getInstance() {
            return requestHolder.get();
        }

    }
}
