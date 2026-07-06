
public class SwitchCalculater {

	public static void main(String[] args) {
		        double num1 = 20.0;
		        double num2 = 5.0;
		        char operator = '*'; 

		        switch (operator) {
		            case '+':
		                System.out.println("Result: " + (num1 + num2));
		                break;
		            case '-':
		                System.out.println("Result: " + (num1 - num2));
		                break;
		            case '*':
		                System.out.println("Result: " + (num1 * num2));
		                break;
		            case '/':
		                if (num2 != 0) {
		                    System.out.println("Result: " + (num1 / num2));
		                } else {
		                    System.out.println("Error: Division by zero.");
		                }
		                break;
		            default:
		                System.out.println("Invalid operator!");
		        }
		    }
	
}
