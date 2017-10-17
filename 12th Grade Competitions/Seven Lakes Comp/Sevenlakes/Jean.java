
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Jean {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Jean.dat"));
		
		int num = Sf.nextInt();
		
		for (int x = 0; x<num; x++){
			
			int num1 = Sf.nextInt();
			
			ArrayList<String> defecit = new ArrayList<String>();
			ArrayList<String> surplus = new ArrayList<String>();
			
		for (int y=0; y<num1; y++){
			String[] bikes = Sf.nextLine().split(" ");
			for(int j = 0;j<bikes.length;j++){
				if (j==0)
					defecit.add(bikes[j]);
				else
					surplus.add(bikes[j]);
			}
			defecit.remove("NONE");
			defecit.remove("->");
			surplus.remove("NONE");
			surplus.remove("->");
			ArrayList<String> sources = surplus;
			ArrayList<String> sinks = defecit;
			sources.removeAll(defecit);
			sinks.removeAll(surplus);
			System.out.print("Sources: ");
			if (sources.size()==0)
				System.out.println("NONE");
			else {
				for (String bike : sources)
				System.out.print(bike+" ");
				System.out.println();
			}
			System.out.print("Sinks: ");
			if (sinks.size()==0)
				System.out.println("NONE");
			else {
				for (String bike : sinks)
					System.out.print(bike+" ");
					System.out.println();
				}
		}
		}
	}

}