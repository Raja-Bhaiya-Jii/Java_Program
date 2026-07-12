public class Pattern1{
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       System.out.println("Pattern 1 :- ");

       int n = sc.nextInt();

       for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
       }
       
       System.out.println("Pattern 2 :- ");

       int n1 = sc.nextInt();
       int k = 1;
       for (int i = n1; i <= 1; i--){
          System.out.print(" ");
            for (int j = 1; j <= k; j++){
                System.out.print("*");
                k += 1;
            }
            System.out.println();
       }
    }
}