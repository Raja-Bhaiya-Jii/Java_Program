
public class Switch {
          public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.print("Enter 1st digit: ");
			int num1 = sc.nextInt();
			System.out.print("Enter 2nd digit: ");
			int num2 = sc.nextInt();
			System.out.print("Enter Operation: ");
			char opr = sc.next().charAt(0);
			
			switch (opr) {
				case '+' :
					System.out.println("Answer is -> " + (num1 + num2));
					break;
				case '-' :
					System.out.println("Answer is -> " + (num1 - num2));
					break;
				case '*' :
					System.out.println("Answer is -> " + (num1 * num2));
					break;
				case '/' :
					System.out.println("Answer is -> " + (num1 / num2));
					break;
				case '%' :
					System.out.println("Answer is -> " + (num1 % num2));
					break;
				default :
					System.out.println("Invalid operator !");
					break;
			}
		}
}
