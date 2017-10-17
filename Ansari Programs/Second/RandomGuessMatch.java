//RandomGuessMatch
//Duncan, 9/5/16
//A game where the player guesses the number

import java.util.Scanner;

public class RandomGuessMatch{

	public static void main(String[] args){
        //variables
        final int MAX = 5;
		
		//user input
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please enter your guess of a number between 1 and 5");
		int number = Sf.nextInt();
		
		//calculations
		int random = (int) (Math.random() * MAX) + 1;
		int remain = Math.abs(random - number);
		
		//output
		System.out.println("The difference between your numbers is " + remain);
		if( random == number){
		 System.out.println("The number is " + random + " therefore your statement is True");	
		}
		else{
		System.out.println("The number is " + random + " therefore your statement is False");	
		}
	}
	
}