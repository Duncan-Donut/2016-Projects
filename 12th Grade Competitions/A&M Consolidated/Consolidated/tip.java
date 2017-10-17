import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;

public class tip {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("tip.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			int range = Sf.nextInt();
			double money = Sf.nextDouble();
			double tipAmount = 0;
			
			if(range == 1){
				tipAmount = money;
			}
			if(range == 2){
				tipAmount = (money * .08) + money;
			}
			if(range == 3){
				tipAmount = (money * .12) + money;
			}
			if(range == 4){
				tipAmount = (money * .15) + money;

			}
			if(range == 5){
				tipAmount = (money * .20) + money;

			}
			System.out.print("$");
			System.out.printf("%.2f", tipAmount);
			System.out.println();
			
		}
	}
}
