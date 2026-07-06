
public class Addt {
            public static void main(String[] args) {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				
				System.out.print("Enter 1st digit: ");
				int a1 = sc.nextInt();
				System.out.print("Enter 2nd digit: ");
				int a2 = sc.nextInt();
				
				if (a1 > a2) System.out.println("Greater is " + a1);
				else System.out.println("Greater is " + a2);
			}
}
