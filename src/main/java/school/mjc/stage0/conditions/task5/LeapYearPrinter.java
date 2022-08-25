package school.mjc.stage0.conditions.task5;

import java.util.logging.Logger;

public class LeapYearPrinter {
	Logger log = Logger.getLogger(LeapYearPrinter.class.getName());
    public void isLeapYear(int year) {
    	if (year%4==0) {
    		if (year%100==0) {
    			if (year%400==0) {
    				// year is century and leap
    				log.info("leap");
    			} else {
    				// the year is century and not leap
    				log.info("not leap");
    			}
    		} else
    			// the year is not century and leap 
    			log.info("leap");
    		
    	} else {
    		log.info("not leap");
    	}
    }
  
}

