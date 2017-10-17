//Duncan Rowe
//10/11/16 A guessing game between 1 and 10
import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomGuess3{

	public static void main(String[] args){	
		
		//Variables
		int guess;
		int numberOfTrys = 0;
		
		//Input
		Scanner Sf = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10");
		
		//calculations
		int random = (int) (Math.random() * 10);
		
		do{
			guess = Sf.nextInt();
			numberOfTrys++;
			
			if(guess > random ){
				JOptionPane.showMessageDialog(null, "Your guess is too high");				
			}
			if(guess < random){
				JOptionPane.showMessageDialog(null, "Your guess is too low");			}
        }while(guess != random);
        
        JOptionPane.showMessageDialog(null, "The number is " + random + " and you took " + numberOfTrys + " tries");
	
	}
}