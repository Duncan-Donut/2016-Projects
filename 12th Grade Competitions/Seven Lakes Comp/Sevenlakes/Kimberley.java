
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kimberley {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Kimberley.dat"));
		while(Sf.hasNext())
		{
			
			int positions = Sf.nextInt();
			int numOfBirds = Sf.nextInt();
			ArrayList<Integer> allPositions = new ArrayList<Integer>();
			
			for(int y = 0; y<numOfBirds; y++)
			{
				allPositions.add(Sf.nextInt());
			}
			int cycle = Sf.nextInt();
			
			for (int y = 0; y<cycle; y++)
			{
				for(int z = 0; z<numOfBirds;z++)
				{
					if(allPositions.get(z) == positions && allPositions.contains(1) == false)
					{
						allPositions.set(z, 1);
					}
				}
				
				for(int z = 0; z<numOfBirds; z++)
				{
					if(allPositions.get(z) + 1 <= positions && allPositions.contains(allPositions.get(z) + 1) == false)
					{
						allPositions.set(z, allPositions.get(z) + 1);
					}
				}
			}
		System.out.println(allPositions);
		allPositions.clear();
		}
	}

}