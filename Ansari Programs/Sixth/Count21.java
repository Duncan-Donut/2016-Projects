//Duncan Rowe
//10/11/16 Game where the first to get above 21 loses
import java.util.Scanner;

public class Count21{

	public static void main(String[] args){	
		
		//variables
		int userInput;
		int total = 1;
		int machine = 0;
		
		//Input
		Scanner Sf = new Scanner(System.in);
		System.out.println("I will start with 1");
	
		while(total < 22){
			System.out.println("Please enter a value between 1 and 3");
			userInput = Sf.nextInt();
			
			while(userInput > 3 || userInput < 1){
				System.out.println("Please reenter your value");
				userInput = Sf.nextInt();
			}
			total += userInput;
			
			//Switch
			switch(total){
				case 2: machine=3;break;
				case 3: machine=2;break;	
				case 4: machine=1;break;	
				case 6: machine=3;break;	
				case 7: machine=2;break;
				case 8: machine=1;break;	
				case 10: machine=3;break;
				case 11: machine=2;break;
				case 12: machine=1;break;
				case 14: machine=3;break;		
				case 15: machine=2;break;	
				case 16: machine=1;break;
				case 18: machine=3;break;
				case 19: machine=2;break;
				case 20: machine=1;break;
			}
			
			//Output
			total+=machine;
			System.out.println("The machine enters " + machine);
			System.out.println("The total is now " + total);
		}
		System.out.println("THE MACHINE WINS! as the total now equals " + total);		
	}
	
}