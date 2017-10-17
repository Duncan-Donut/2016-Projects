
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Daniel {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Daniel.dat"));
		
		while(Sf.hasNextLine()){
			String x = Sf.nextLine();
			String[] test  = x.split(" ");
			
			for(int y = 0; y< test.length;y++){
				
				String answer="";
				
				while(answer.length() <= 30){
					
					answer += test[y];
					
				}
			
				
				
				
			}
			
			
			
		}
	}

}
