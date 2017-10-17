import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class toppings {
	
	public static int gcd(int x, int y)
	{
		boolean status = true;
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		while(status)
		{
			if(max == 0 || min == 0)
			{
				break;
			}
			int temp = min;
			min = max % min;
			max = temp;
			
			
			
		}
		int answer = Math.max(max, min);
		
		return answer;
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("toppings.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			ArrayList<Integer> numbers = new ArrayList<>();
			
			int numOfIng = Sf.nextInt();
			for(int y = 0; y<numOfIng; y++)
			{
				numbers.add(Sf.nextInt());
			}
			
			int lcm = 0;
			
			if(numbers.size() == 1)
			{
				lcm = numbers.get(0);
			}
			
			else
			{
				int index = 2;
				boolean status = true;
				lcm = numbers.get(0) * numbers.get(1) / gcd(numbers.get(0), numbers.get(1));
				while(status)
				{
					try
					{
						lcm = lcm * numbers.get(index) / gcd(lcm, numbers.get(index));
						index++;
					}
					catch(Exception e)
					{
						break;
					}
				}
				
				
			}
			
			int sum = 0;
			for(int y = 0; y<numbers.size(); y++)
			{
				sum += (lcm/numbers.get(y));
			}
				System.out.println(sum);
			
			
			
		}
	}
}
