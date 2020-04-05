import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
public static void main(String[] args) {

int guess=0;
int lives = 9;
	
System.out.println("Guess a number between 0-100 but you only have 10 lives: ");
	Scanner guessed = new Scanner(System.in);
	
	
	 Random randomnumber = new Random();
	 int number = randomnumber.nextInt(101);
	 
	for (int counter=0; counter<=lives; counter++) {
		
		guess = guessed.nextInt();
	
	if (guess > number) {
		
		System.out.println("Number guessed is too high");
	
	} else if (guess<number) {
		
		System.out.println("Number guessed is too low");
		
	}else {
		System.out.println ("Number guessed is CORRECT CONGRATULATIONS! Would you like to play again?");
		
		break;
	}
	}
	if (guess != number) {
		
		System.out.println("Try Again");
		
		
	}
}
}