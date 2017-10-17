//Duncan Rowe
// 11/14/15
//Tests class of Horse and RaceHorse
public class DemoHorses {

	public static void main(String[] args) {
		// Creates both objects of Horse and RaceHorse
		Horse Apollo = new Horse();
		RaceHorse Helios = new RaceHorse();
		
		//Tests qualities of Horse
		Apollo.setName("Apollo");
		Helios.setName("Helios");
		
		Apollo.setBirthYear(1998);
		Helios.setBirthYear(1998);
		
		Apollo.setColor("Brown");
		Helios.setColor("White");
		
		//Tests Qualities of RaceHorse
		Helios.setNumberOfRaces(5);
		
	}

}
