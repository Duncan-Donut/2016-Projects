//Duncan
//10/2/16 Rental Demo Class - Initalizes the objects and displays data 
import java.util.Scanner;
public class RentalDemo{
	
	public static void main(String[] args){ 
		//variables
		String contract;
		int time,hours;
		
		//Rental Object
		Rental rent = new Rental();
		
		time = RentalDemo.rentalTime();
		rent.setHoursAndMinutes(time);
		rent.setContractNum();
		
		contract = rent.getContractNum();
		hours = rent.getNumberOfHours();
		
	}

	//Setters
	public static int rentalTime(){
		//Scanner
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please enter the number of minutes you will use the equipment");
		return Sf.nextInt();	
	}
	
	//Display Methods 
	public static void calculations(Rental Object, int number){
		
		Object.getContractNum();	
		
		//Constants
		final int SECONDS = 60;
		final int PRICE_PER_HOUR = 40;

		//Calculations
		int minutes = number % SECONDS;
		int hours = (number / SECONDS);
		int hprice = hours * PRICE_PER_HOUR;
		int price =  minutes + hprice;
		System.out.println(PRICE_PER_HOUR);
		System.out.println("The number of hours is " + hours);
		System.out.println("The number of minutes is " + minutes);
		System.out.println("The total price is " + price);	
		
	}
	public static void showBanner(){
		//Displays Banner
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sammy's makes it fun in the sun S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");	
	}
	
}
