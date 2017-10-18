import java.util.Scanner;

public class DataDemo{
	
	public static void main(String[] args){
		
		double Naut = read();
		double Miles = calcMiles(Naut);
		double Kilometer = calcKilometers(Naut);
		output(Naut,Kilometer, Miles);
	
	}
	
	public static double read(){
		
		System.out.println("Please insert the nautical miles you wish to change");
		Scanner Sf = new Scanner(System.in);
		double Naut = Sf.nextDouble();
		return Naut;
	}
	
	public static double calcMiles(double Naut){
		
		final double KILOMETERS = 1.852;
		return KILOMETERS * Naut;

	}
	public static double calcKilometers(double Naut){
		
		final double MILES = 1.150779;
		return MILES * Naut; 
	
	}
	public static void output(double Naut, double Kilometer, double Miles){
		
		System.out.println(Naut + " the amounnt of nautical miles");
		System.out.println(Kilometer + " the nautical miles in kilometers");
		System.out.println(Miles + " the nautical miles in miles");

		
	}

}

		
	
.
.0.0..