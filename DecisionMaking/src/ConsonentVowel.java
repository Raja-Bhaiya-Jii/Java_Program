
public class ConsonentVowel {

	public static void main(String[] args) {
		     char ch = 'A';

		        // Check if it is an alphabet letter
		        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		            System.out.println(ch + " is an alphabet.");
		            
		            char lower = Character.toLowerCase(ch);
		            // Nested check for vowel
		            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
		                System.out.println("It is also a vowel.");
		            } else {
		                System.out.println("It is a consonant.");
		            }
		        } else {
		            System.out.println(ch + " is not an alphabet.");
		        }
		    }
	
}
