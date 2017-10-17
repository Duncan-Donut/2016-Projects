import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Akio {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Akio.dat"));

		while(Sf.hasNext()){
			int x= Sf.nextInt();
			System.out.println(x*x);
		}
		
	}

}