

import java.util.Random;
import java.util.Scanner;
class GuessingGame{
	public static void main (String[]args){
		Random rand = new Random();
		int numberToGuess= rand.nextInt(10);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;
		while(win==false){
			System.out.println("Guess a number between 1 and 10");
			guess = input.nextInt();
			numberOfTries++;
			if(guess==numberToGuess){
				win=true;
			} else if(guess<numberToGuess){
				System.out.println("Your Guess is too low");
			} else if (guess>numberToGuess){
				System.out.println("Your guess is too high");
			}
		}
		System.out.println("You win");
		System.out.println("the number was "+numberToGuess);
		System.out.println("and it took you "+numberOfTries+" tries");
	}
}