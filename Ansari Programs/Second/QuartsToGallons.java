//QuartsToGallons
//Duncan, 9/5/16
//Converts from Quarts to Gallons

public class QuartsToGallons{
	
	public static void main(String[] args){
		
		//constant
		final int QUARTS = 4;
		final int QUARTS_FOR_JOB = 18;
		
		//Calculations
		int gallons = QUARTS_FOR_JOB / QUARTS;
		int leftover = QUARTS_FOR_JOB % QUARTS;
		
		//output
		System.out.println("A job that needs " + QUARTS_FOR_JOB + " quarts requires " + gallons + " gallons plus " + leftover + " quarts." );
		
		
	}
}