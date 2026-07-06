
public class VowlConsonant {

	public static void main(String[] args) {
		        char ch = 'e';
		        // Make it lowercase to simplify conditions
		        char lowerCh = Character.toLowerCase(ch);

		        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
		            System.out.println(ch + " is a vowel.");
		        } else if (lowerCh >= 'a' && lowerCh <= 'z') {
		            System.out.println(ch + " is a consonant.");
		        } else {
		            System.out.println(ch + " is not a valid alphabet letter.");
		        }
		    }
		
}
