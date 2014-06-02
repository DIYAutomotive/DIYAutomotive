package edu.neumont.diyauto.Framework;

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
}
