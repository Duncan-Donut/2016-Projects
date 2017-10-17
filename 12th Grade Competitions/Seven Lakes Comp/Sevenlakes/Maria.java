
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maria {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Maria.dat"));
		
		while(Sf.hasNext()){
		
			int y = Sf.nextInt();
			
			if(y == 1){
				System.out.println("---");
				System.out.println("-*-");
				System.out.println("---");
			}
			else if(y == 2){
				System.out.println("*--");
				System.out.println("---");
				System.out.println("--*");
			}
			else if(y == 3){
				System.out.println("*--");
				System.out.println("-*-");
				System.out.println("--*");
			}
			else if(y == 4){
				System.out.println("*-*");
				System.out.println("---");
				System.out.println("*-*");
			}
			else if(y == 5){
				System.out.println("*-*");
				System.out.println("-*-");
				System.out.println("*-*");
			}
			else if(y == 6){
				System.out.println("*-*");
				System.out.println("*-*");
				System.out.println("*-*");
			}

			System.out.println("");
			
			
		}
	}

}