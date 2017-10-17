//NauticalMiles
//Duncan, 9/5/16
//Converts NauticalMiles into miles and kilometers

public class NauticalMiles{

	public static void main(String[] args){
		
		//constant variables
		final double KILOMETERS = 1.852;
		final double MILES = 1.150779;
		final int NAUTICAL_MILES = 10;
		
		//calculations
		double knm = NAUTICAL_MILES * KILOMETERS;
		double mnm = NAUTICAL_MILES * MILES;
		
		//output
		System.out.println(NAUTICAL_MILES + " nautical miles equals " + knm + " in kilometers");
		System.out.println(NAUTICAL_MILES + " nautical miles equals " + mnm + " in miles");

		
	}
	
}