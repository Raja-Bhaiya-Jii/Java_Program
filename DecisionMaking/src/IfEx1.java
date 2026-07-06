
public class IfEx1 {
         public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			
			if(age < 0 || age > 120) {
				System.out.println("Invalid Age!");
			}else if(age <= 4) {
				System.out.println("You're Infant.");
			}else if (age <= 12){
				System.out.println("You're  Child.");
			}else if (age <= 19){
				System.out.println("You're  Teen.");
			}else if (age <= 50){
				System.out.println("You're Adult.");
			}else if (age <= 80){
				System.out.println("You're  Old.");
			}else {
				System.out.println("It's time to merge with infinity.");
			}
//			System.out.println("Thank You!");
		}
}
