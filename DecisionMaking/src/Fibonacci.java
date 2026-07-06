//Write a program to accept a number from user and print the fibonacci series upto n terms.
public class Fibonacci {
      public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1;
		if(n == 0) System.out.println("0");
		else if ( n == 1) System.out.println("0 1");
		else if (n > 1){
		System.out.print(a + " " + b);
		for(int i = 3; i <= n; i++) {
			int c = a + b;
			System.out.print(" " + c);
			a = b; 
			b = c;
		}
		}
	}
}
