
public class DoWhile {
     public static void main(String[] args) {
    	 System.out.println("Pattern");
    	 
		for (int i = 1; i <= 5; i++) {
			for(int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
