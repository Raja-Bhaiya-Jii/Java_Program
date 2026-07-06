
public class Big3ByTernary {

	public static void main(String[] args) {
		      int a = 40, b = 75, c = 52;

		        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

		        System.out.println("The largest number is " + largest);
		    }
	
}
