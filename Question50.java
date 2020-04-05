import java.util.Scanner;
public class Question50 {
public static void main(String[] args) {


	Scanner word = new Scanner(System.in);
	
	String madeword; 
	madeword = word.next();
	
	for (int i = 0; i < madeword.length(); i++) {
		System.out.print(madeword.charAt(i) + " ");
		
	}
}
}
