import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fengge {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Fengge.dat"));
		while(Sf.hasNext()){
			int height= Sf.nextInt();
			int width = Sf.nextInt();
			String character = Sf.next();
			for (int x = 1; x<=2; x++)
			{
				for (int y = 1; y<=width; y++)
				{
					System.out.print(character);
				}
				System.out.println("");
			}
			for (int x=1; x<= (height-4); x++)
			{
				System.out.print(character);
				System.out.print(character);
				for(int y = 1; y<=width-4; y++)
				{
					System.out.print(" ");
				}
				System.out.print(character);
				System.out.print(character);
				System.out.println("");
			}
			for (int x = 1; x<=2; x++)
			{
				for (int y = 1; y<=width; y++)
				{
					System.out.print(character);
				}
				System.out.println("");
			}
			System.out.println("");	
		}
		
	}


}