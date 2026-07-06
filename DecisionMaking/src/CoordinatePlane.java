
public class CoordinatePlane {

	public static void main(String[] args) {
		      int x = 0;
		        int y = 7;

		        if (x == 0 && y == 0) {
		            System.out.println("The point is at the Origin (0,0).");
		        } else if (x == 0) {
		            System.out.println("The point lies on the y-axis.");
		        } else if (y == 0) {
		            System.out.println("The point lies on the x-axis.");
		        } else {
		            System.out.println("The point is in one of the quadrants at (" + x + ", " + y + ").");
		        }
		    }
	
}
