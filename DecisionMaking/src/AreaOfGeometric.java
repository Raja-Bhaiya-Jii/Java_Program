
public class AreaOfGeometric {

	public static void main(String[] args) {
		        String shape = "rectangle"; // Options: "circle", "square", "rectangle", "triangle"

		        switch (shape.toLowerCase()) {
		            case "circle":
		                double radius = 4.0;
		                System.out.println("Circle Area: " + (Math.PI * radius * radius));
		                break;
		            case "square":
		                double side = 5.0;
		                System.out.println("Square Area: " + (side * side));
		                break;
		            case "rectangle":
		                double length = 6.0, width = 4.0;
		                System.out.println("Rectangle Area: " + (length * width));
		                break;
		            case "triangle":
		                double base = 5.0, height = 8.0;
		                System.out.println("Triangle Area: " + (0.5 * base * height));
		                break;
		            default:
		                System.out.println("Unknown shape shape selection.");
		        }
		    }
	
}
