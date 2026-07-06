
public class BigFour {
            public static void main(String[] args) {
				java.util.Scanner sc = new java.util.Scanner(System.in);
				
				System.out.print("Enter 1st digit: ");
				int a1 = sc.nextInt();
				System.out.print("Enter 2nd digit: ");
				int a2 = sc.nextInt();
				System.out.print("Enter 3rd digit: ");
				int a3 = sc.nextInt();
				System.out.print("Enter 4rd digit: ");
				int a4 = sc.nextInt();
				
				if (a1 > a2)
				{  if (a1 > a2) System.out.println("Greater is " + a1); 
				   else System.out.println("Greater is " + a3);
				}else if (a2 > a3) {
					if (a2 > a4) System.out.println("Greater is " + a2);
					else System.out.println("Greater is " + a4);
				}
				else if (a3 > a4) System.out.println("Greater is " + a3);
				else System.out.println("Greater is " + a4);
			}
}
