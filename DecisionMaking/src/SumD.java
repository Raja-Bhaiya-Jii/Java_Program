
public class SumD {
public static void main(String[] args) {
	  java.util.Scanner sc = new java.util.Scanner(System.in);
	   int n = sc.nextInt();
	   int Sum = 0;
	   while (n > 0) {
		   Sum += (n%10);
		   n /= 10;
	   }
	   System.out.println(Sum);
}
}


