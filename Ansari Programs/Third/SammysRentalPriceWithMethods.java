//Duncan Rowe
//10/2/16 Methods for the SammysRentalPrice

import java.util.Scanner;

public class SammysRentalPriceWithMethods{

	public static void main(String[] args){ 
		//Variable
		int time;
		
		//Methods Calls
		time = SammysRentalPriceWithMethods.rentalTime();
		SammysRentalPriceWithMethods.showBanner();
		SammysRentalPriceWithMethods.calculations(time);
		
		//RentalDemo Call
		RentalDemo.showBanner();
	}
	
	//Methods
	public static int rentalTime(){
		//Scanner
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please enter the number of minutes you will use the equipment");
		return Sf.nextInt();	
	}
	public static void showBanner(){
		//Displays Banner
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy's makes it fun in the sun S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");	
	}
	public static void calculations(int number){
		//Constants
		final int SECONDS = 60;
		final int PRICE_PER_HOUR = 40;

		//Calculations
		int minutes = number % SECONDS;
		int hours = (number / SECONDS);
		int hprice = hours * PRICE_PER_HOUR;
		int price =  minutes + hprice;
	
		System.out.println("The number of hours is " + hours);
		System.out.println("The number of minutes is " + minutes);
		System.out.println("The total price is " + price);	
		
	}
	
}