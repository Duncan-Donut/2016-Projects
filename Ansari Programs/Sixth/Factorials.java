import java.util.Scanner;

public class Factorials{
	
	public static void main(String[] args){
		int total = 1;
		
		for(int x=1; x<=10;x++){
			for(int y=x; y>0;y--){
				total *=y;
			}
			System.out.println("The factorial of " + x + " is " + total);
			total=1;
			
		}
		
		
	}
	
}