import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pay {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("pay.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			double money = Sf.nextDouble() * 100; Sf.nextLine();
			int total = 0;
			for (int i = 0; i < 8; i++){
				
			}
			
			double pen = Sf.nextDouble();
			total += pen;
			double nick = Sf.nextDouble() * 5;
			total += nick;
			double dime = Sf.nextDouble() * 10;
			total += nick;
			double quarter = Sf.nextDouble() * 25;
			total += quarter;
			double d = Sf.nextDouble() * 100;
			total += d;
			double f = Sf.nextDouble() * 500;
			total += f;
			double ten = Sf.nextDouble() * 1000;
			total += ten;
			double twe = Sf.nextDouble() * 2000;
			total += twe;
			
			
		}
	}
}