package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
    	if (year%4==0) {
    		if (year%100==0) {
    			if (year%400==0) {
    				// year is century and leap
    				System.out.println("leap");
    			} else {
    				// the year is century and not leap
    				System.out.println("not leap");
    			}
    		} else
    			// the year is not century and leap 
    			System.out.println("leap");
    		
    	} else {
    		System.out.println("not leap");
    	}
    }
    
    /*
    public static void main(String[] args) {
    	LeapYearPrinter lyp = new LeapYearPrinter();
    	lyp.isLeapYear(2300);
    }
    */
}

