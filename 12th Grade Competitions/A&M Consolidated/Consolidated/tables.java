import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tables {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("tables.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			System.out.println("I like " + Sf.next() + ".");
		}
	}
}
