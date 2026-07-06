
public class PerfectSquare {

	public static void main(String[] args) {
		        int number = 49;

		        double sqrtValue = Math.sqrt(number);
		        
		        // If the truncated integer part squared matches the number, it's a perfect square
		        int intPart = (int) sqrtValue;

		        if (intPart * intPart == number) {
		            System.out.println(number + " is a perfect square.");
		        } else {
		            System.out.println(number + " is not a perfect square.");
		        }
		    }
	
}
