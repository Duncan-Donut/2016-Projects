//MinutesConversion
//Duncan, 9/5/16
//Converts Minutes to hours and days

import java.util.Scanner;
import java.text.*;

public class MinutesConversion{

	public static void main(String[] args){
		
		//sets double format to three decimal places
		DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Please enter your minutes");
        
        //user input
		Scanner Sf = new Scanner(System.in);
		double minutes = Sf.nextDouble();
		
		final int SECONDS_IN_AN_HOUR = 60;
		final int SECONDS_IN_A_DAY = 1440;
		
		//calculations
		double hours = minutes / SECONDS_IN_AN_HOUR;
		double days = minutes / SECONDS_IN_A_DAY;
		
		//output
		System.out.println(df.format(minutes) + " minutes is equal to " + df.format(hours) + " hours.");
		System.out.println(df.format(minutes) + " minutes is equal to " + df.format(days) + " days.");


		
	}
	
}