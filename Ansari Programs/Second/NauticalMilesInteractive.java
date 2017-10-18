//NauticalMilesInteractive
//Duncan, 9/5/16
//Converts a user inputed Nautical Miles into miles and km
import java.util.Scanner;

public class NauticalMilesInteractive{

	public static void main(String[] args){
		
		//constant variables
		final double KILOMETER = 1.852;
		final double MILES = 1.150779;
		
		//user input
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please enter your nautical miles");
		int nauticalmiles = Sf.nextInt();
		
		//calculations
		double knm = nauticalmiles * KILOMETER;
		double mnm = nauticalmiles * MILES;
		
		//output
		System.out.println(nauticalmiles + " nautical miles equals " + knm + " in kilometers");
		System.out.println(nauticalmiles + " nautical miles equals " + mnm + " in miles");

		
	}
	
}