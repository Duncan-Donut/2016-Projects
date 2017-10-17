import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomGuess{

	public static void main(String[] args){	
		
		Scanner Sf = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Please think of a number between 1 and 10");
		
		int guess = Sf.nextInt();
		
		
		int random = (int) (Math.random() * 10);
		
		if(guess == random){
			System.out.println("Wow your lucky punk");
			JOptionPane.showMessageDialog(null, "The number is " + random);
		}
		else{
			System.out.println("Sorry, your luck is out");
			JOptionPane.showMessageDialog(null, "The number is " + random);
			
        }
	
	}
}