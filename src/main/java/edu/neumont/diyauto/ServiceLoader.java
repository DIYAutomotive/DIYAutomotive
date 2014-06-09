package edu.neumont.diyauto;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServiceLoader implements ServletContextListener 
{
	public static DbContext context;
	public static int threadID;
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		context = new Results();
		threadID = 0001;

		
		Result r1 = new Result("brake", "Common brake problems are often caused by not replacing brake pads when needed or having warped rotors. Brake pads are roughly a $30 fix and will keep from warping your rotors.");
		Result r2 = new Result("brake", "Warped rotors can be either shaved down so that they are smooth again or replaced for roughly $80.");
		Result r3 = new Result("start", "Bad starting is normally caused by a low, or near dead, battery. ");
		Result r4 = new Result("start", "Loud screeching while starting up might be an indication that your starter is dying.");
		Result r5 = new Result("clutch", "If a clutch is slipping or not engaging when it's supposed to, then your clutch is on its way out.");
		Result r6 = new Result("clutch", "If you have an automatic transmission and the clutch is slipping, try adding more transmission fluid or flushing the transmission then filling it up.");
		Result r7 = new Result("engine", "If you're experiencing loud knocking or abnormal engine behavior, you may have a thrown connecting rod and bent intake valves or exhaust valves.");
		Result r8 = new Result("idle", "If you have abnormal idling or the car repeatedly raises then falls in RPM's, then you may have a vacuum leak in your intake system.");
		
		context.addResult("brakes", r1);
		context.addResult("brakes", r2);
		context.addResult("start", r3);
		context.addResult("start", r4);
		context.addResult("clutch", r5);
		context.addResult("clutch", r6);
		context.addResult("engine", r7);
		context.addResult("idle", r8);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub	
	}
}
