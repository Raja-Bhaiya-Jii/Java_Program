public class Reverse {
public static void main(String[] args) {
	  java.util.Scanner sc = new java.util.Scanner(System.in);
	  System.out.print("Enter Digit: ");
	   int n = sc.nextInt();
	   int rev = 0;
	   while (n > 0) {
		   rev = rev*10+(n%10);
		   n /= 10;
	   }
	   System.out.println(rev);
}
}
