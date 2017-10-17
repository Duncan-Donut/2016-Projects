import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class servings {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("servings.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			int numIng = Sf.nextInt();
			int[] ing = new int[numIng];
			int[] reqing = new int[numIng];
			int[] smallest = new int[numIng];
			
			for(int y = 0; y<numIng; y++)
			{
				ing[y] = Sf.nextInt();
			}
			for(int y = 0; y<numIng; y++)
			{
				reqing[y] = Sf.nextInt();
			}
			
			for(int y = 0; y<numIng; y++)
			{
				try
				{
					smallest[y] = ing[y] / reqing[y];
				}
				catch(Exception e)
				{
					smallest[y] = 100000000;					
				}
			}
			
			Arrays.sort(smallest);
			System.out.println(smallest[0]);
		}
	}
}
