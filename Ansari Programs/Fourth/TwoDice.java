//Duncan
//10/2/16 Randomly rolls two dice and displays the values

public class TwoDice{
	
	public static void main(String[] args){
		
		//Two Dice Objects
		Die die1 = new Die();
		Die die2 = new Die();
		
		//Displays Values
		System.out.println(die1.getRandomValue());
		System.out.println(die2.getRandomValue());

	
	}
	
}