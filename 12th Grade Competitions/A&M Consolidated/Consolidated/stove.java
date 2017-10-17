import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class stove {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("stove.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			String number = Sf.next();
			char[] time = number.toCharArray();
			
			for(int y = 0;y<time.length;y++){
				String a = time[y];
				
				if(a.equals("0")){
					System.out.println("")
					System.out.println("")
					System.out.println("")
					System.out.println("")
					System.out.println("")
				}
				
				
				
			}
			
		}
	}
}
