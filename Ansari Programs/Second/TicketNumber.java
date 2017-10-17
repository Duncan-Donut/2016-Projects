//TicketNumber
//Duncan, 9/5/16
//Checks if a ticket number is true or not
import java.util.Scanner;
public class TicketNumber{

	public static void main(String[] args){
		
        //user input
		Scanner Sf = new Scanner(System.in);
		System.out.println("Please enter ticket number");
		int number = Sf.nextInt();
		
		//calculations
		int first = number /10;
		int second = number%10;
		int remain =first % 7; 
		
		//output
		if( remain == second){
		 System.out.println("True");	
		}
		else{
		System.out.println("False");	
		}
	}
	
}