import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Abdul {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Abdul.dat"));

		while(Sf.hasNext()){
			int x= Sf.nextInt();
			System.out.println(x*x);
		}
		
	}

}