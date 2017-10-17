
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Samantha {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Samantha.dat"));

		while(Sf.hasNext()){
			ArrayList<Integer> numbers = new ArrayList<>();
			int X = Sf.nextInt();
			int num = Sf.nextInt();
			int sum = 0;
			
			for(int x = 0; x<num; x++){
				numbers.add(Sf.nextInt());
				sum += numbers.get(x);
			}
			Collections.sort(numbers);
			
			
			int mean = sum / numbers.size();
			System.out.print(mean + " ");
			
			int median = 0;
			if(numbers.size() % 2 != 0)
			{
				median = numbers.get(numbers.size()/2);
			}
			else
			{
				median = (numbers.get(numbers.size()/2) +  numbers.get(numbers.size()/2 - 1))/2;
			}
			System.out.print(median + " ");
			
			int LS = 0;
			int HS = 0;
			for(int x = 0; x<numbers.size(); x++)
			{
				if(numbers.get(x) > mean)
				{
					HS += numbers.get(x);
				}
				if(numbers.get(x) < mean)
				{
					LS += numbers.get(x);
				}
			}
			
			System.out.print( (int)(((.06 + X * .07) * LS) + (4*X*.0789 * HS)));
			System.out.println();
			
		}
		}
		


}
