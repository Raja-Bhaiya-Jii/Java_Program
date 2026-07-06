
public class Big3ByNested {

	public static void main(String[] args) {
		       int x = 14, y = 22, z = 19;

		        if (x >= y) {
		            if (x >= z) {
		                System.out.println(x + " is the largest.");
		            } else {
		                System.out.println(z + " is the largest.");
		            }
		        } else {
		            if (y >= z) {
		                System.out.println(y + " is the largest.");
		            } else {
		                System.out.println(z + " is the largest.");
		            }
		        }
		    }
		

}
