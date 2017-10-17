//Duncan Rowe
//10/1/16, creates two characters and displays the attributes

public class TwoCharacters{
	
	public static void main(String[] args){
		
		//Character Whale
		MyCharacter whale = new MyCharacter();
		whale.setRace("Whale");
		whale.setStrength(10);
		whale.setLives(1);
		TwoCharacters.display(whale);
		
		//Character God
		MyCharacter god = new MyCharacter();
		god.setRace("God");
		god.setStrength(100);
		god.setLives(100);
		TwoCharacters.display(god);

	}
	
	//Methods
	public static void display(MyCharacter character){
		System.out.println("The name of this race is " + character.getRace());
		System.out.println("The strenght of this race is " + character.getStrength());
		System.out.println("The number of lives of this race is " + character.getLives());
	}
	
	
	
}