//Duncan
//10/2/16 Rental Class - has the setters and getters for RentalDemo

import java.util.Scanner;

public class Rental{
	//Variables
	public final static int HOURS = 60;
	public final static int PRICE_PER_HOUR = 40;
	private String contractNum;
	private int numberOfHours;
	private int leftOverMinutes;
	private int price;
	
	//Setters
	public void setContractNum(){
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please your contract number");
		contractNum = Sf.next();
	}
	public void setHoursAndMinutes(int number){
		numberOfHours = number/HOURS;
		leftOverMinutes = number % HOURS;
		price = (PRICE_PER_HOUR * numberOfHours) + leftOverMinutes;
	}
	
	//Getters
	public String getContractNum(){
		return contractNum;
	}
	public int getNumberOfHours(){
		return numberOfHours;
	}
	public int getLeftOverMinutes(){
		return leftOverMinutes;
	}
	public int getPrice(){
		return price;
	}
	
}