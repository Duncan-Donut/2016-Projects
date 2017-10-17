//CarlysEventPrice
//Duncan, 9/5/16
//Tells the price of of an event and if it a big event or not

import java.util.Scanner;

public class CarlysEventPrice{

	public static void main(String[] args){
		
		//variables
		final int PRICE = 35;
		final int LARGE = 50;
		boolean value = false;
        
		//takes user input
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please enter the number of guests");
		int input = Sf.nextInt();
		
		//calculation
		int price = input * PRICE;
		
		if(input >= LARGE){
			value = true; 
		}
		//output
		System.out.println("**********************************************");
		System.out.println("*Carly's makes the food that makes it a party*");
		System.out.println("**********************************************");
		
		System.out.println("The number of guests is " + input);
		System.out.println("The price per guest is " + 35);
		System.out.println("The total price is " + price);
		System.out.println("Large event : " + value);
	
		
	
		
	}
	
}