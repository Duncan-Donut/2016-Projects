//Duncan
//10/2/16 Creates the die class, assigned a random value to the die

public class Die{

	//Variables
	private int randomValue;
	final int HIGHEST_DIE_VALUE=6;
	final int LOWEST_DIE_VALUE=1;
	
	//constructor
	public Die(){
		randomValue = ((int)(Math.random()*100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}
	
	//Getter
	public int getRandomValue(){
		return randomValue;		
	}
	
	
	
}