//MadLib
//Duncan, 9/5/16
//Write a mad libs with user inputed words
import java.util.Scanner;

public class MadLib{

	public static void main(String[] args){
		
        //user input
		Scanner Sf = new Scanner(System.in);
		System.out.println("Enter first noun");
		String noun = Sf.next();
		
		System.out.println("Enter first verb");
		String verb = Sf.next();
				
		System.out.println("Enter first adjective");
		String adjective = Sf.next();
		
		System.out.println("Enter second verb (present tense)");
		String verb2 = Sf.next();
	
		//output 
		System.out.println(noun + " what are you doing here?");
		System.out.println(noun + " " + verb + " away from the mysterious figure");
		System.out.println("Watch out for his " + adjective + " weapon");
		System.out.println("You should just " + verb2 + " away");

	}
	
}