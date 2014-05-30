package edu.neumont.diyauto;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import edu.neumont.diyauto.Models.Threads;


@WebListener
public class ServiceLoader implements ServletContextListener 
{
	public static DbContext context;
	public static Threads threads;
	public static int threadID;
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		context = new Results();
		threadID = 0001;
		
		Result r1 = new Result("brakes", "Common brake problems are often caused by not replacing brake pads when needed or having warped rotors. Brake pads are roughly a $30 fix and will keep from warping your rotors.");
		Result r2 = new Result("brakes", "Warped rotors can be either shaved down so that they are smooth again or replaced for roughly $80.");
		
		context.addResult("brakes", r1);
		context.addResult("brakes", r2);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub	
	}
}
