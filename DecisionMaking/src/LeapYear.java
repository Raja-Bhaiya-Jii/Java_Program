
public class LeapYear {

	public static void main(String[] args) {
		       int year = 2024;

		        // A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }
		    }
		

}
