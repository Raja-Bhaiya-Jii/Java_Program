
public class LeapByTernary {

	public static void main(String[] args) {
	            int year = 2000;

		        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
		                        ? "a leap year" 
		                        : "not a leap year";

		        System.out.println(year + " is " + result);
		    }
	

}
