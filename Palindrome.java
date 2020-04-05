import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	
	Scanner test = new Scanner(System.in);
	String regular = test.nextLine();
	
	String original = regular.replaceAll("\\W", "").toLowerCase();
	
	String reverse = "";
	
	for (int i = original.length() -1; i >= 0; i--) {
		reverse += original.charAt(i);
	}
	
	System.out.println(reverse);
	
	if (original.contentEquals(reverse)) {
		System.out.println("Is a Palyndrome.");
		
	}
		else if (!original.equals(reverse)) {
			System.out.println("Is not a palyndrome");
		}

}
}
