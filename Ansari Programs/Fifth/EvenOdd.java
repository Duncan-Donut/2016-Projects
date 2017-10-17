import java.util.Scanner;

public class EvenOdd{

	
	
	public static void main(String[] args){
		EvenOdd.isEven();
		
	}
	
	public static boolean isEven(){
		
		int number;
		
		System.out.println("Please enter an integer");
		Scanner Sf = new Scanner(System.in);
		number = Sf.nextInt();
		
		if(number % 2 ==0){
			return true;
		}
		else{
			return false; 
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}