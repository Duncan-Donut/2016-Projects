import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class slice {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("slice.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			double number = Sf.nextDouble();
			number = number / (2*Math.PI);
			
			number = number / (1.0/8.0);
		
			System.out.printf("%.2f", number);
			System.out.println();
		}
	}
}
