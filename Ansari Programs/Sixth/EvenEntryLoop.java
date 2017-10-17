import java.util.Scanner;

public class EvenEntryLoop{
	
	public static void main(String[] args){
		int response;
		
		Scanner Sf = new Scanner(System.in);
		
		
		do{
			System.out.println("Please enter a number");
			response = Sf.nextInt();
			if(response == 999){
					
			}
			else if(response%2 == 0){
				System.out.println("Good job!");	
			}
			else{
				System.out.println("ERROR");
				
			}
			
		}while(response!= 999);
			
		
	}
	
}