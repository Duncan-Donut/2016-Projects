import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Decoder {

	static ArrayList<String> original = new ArrayList<String>();
	static ArrayList<String> encrypt = new ArrayList<String>();
	static ArrayList<Integer> random = new ArrayList<Integer>();
	static ArrayList<Integer> diffe = new ArrayList<Integer>();
	
	public static void Setters() throws FileNotFoundException{
		
		Scanner Sf = new Scanner(new File("encryption.txt"));
		
		while(Sf.hasNext()){
			encrypt.add(Sf.next());
		}
		
		Scanner Sr = new Scanner(new File("random.txt"));

		while(Sr.hasNext()){
			random.add(Sr.nextInt());
		}
		
		Scanner Sd = new Scanner(new File("difference.txt"));
		
		while(Sd.hasNext()){
			diffe.add(Sd.nextInt());
		}
		
		
	}
	
	public static void Decoder(ArrayList<String> a){
		
		String word = "";
		int y = 0;
		int x = 0;
		int z = 0;
		
		for(String temp: encrypt){

			String[] diff = temp.split("(?!^)");
			
				z += temp.length();
			
				for(x = y; x < z; x++){
					int first = random.get(x);
					int second = diffe.get(x);
					int real = (first*first*7) - second;
					word += encryption(real);
				}
				
				y += temp.length();
				
				
				word += " ";
		}
		
		original.add(word);

	}
	public static Character encryption(int b){
		
		switch(b){
		
		case 0: return '~';
		case 1: return 'a';
		case 2: return 'b';
		case 3: return 'c';
		case 4: return 'd';
		case 5: return 'e';
		case 6: return 'f';
		case 7: return 'g';
		case 8: return 'h';
		case 9: return 'i';
		case 10: return 'j';
		case 11: return 'k';
		case 12: return 'l';
		case 13: return 'm';
		case 14: return 'n';
		case 15: return 'o';
		case 16: return 'p';
		case 17: return 'q';
		case 18: return 'r';
		case 19: return 's';
		case 20: return 't';
		case 21: return 'u';
		case 22: return 'v';
		case 23: return 'w';
		case 24: return 'x';
		case 25: return 'y';
		case 26: return 'z';
		case 27: return 'A';
		case 28: return 'B';
		case 29: return 'C';
		case 30: return 'D';
		case 31: return 'E';
		case 32: return 'F';
		case 33: return 'G';
		case 34: return 'H';
		case 35: return 'I';
		case 36: return 'J';
		case 37: return 'K';
		case 38: return 'L';
		case 39: return 'M';
		case 40: return 'N';
		case 41: return 'O';
		case 42: return 'P';
		case 43: return 'Q';
		case 44: return 'R';
		case 45: return 'S';
		case 46: return 'T';
		case 47: return 'U';
		case 48: return 'V';
		case 49: return 'W';
		case 50: return 'X';
		case 51: return 'Y';
		case 52: return 'Z';
		case 53: return '!'; 
		case 54: return '@'; 
		case 55: return '#';
		case 56: return '$'; 
		case 57: return '%'; 
		case 58: return '^'; 
		case 59: return '&'; 
		case 60: return '*'; 
		case 61: return '+'; 
		case 62: return '='; 
		case 63: return '|'; 
		case 64: return '0';
		case 65: return '1';
		case 66: return '2';
		case 67: return '3';
		case 68: return '4';
		case 69: return '5'; 
		case 70: return '6'; 
		case 71: return '7';
		case 72: return '8'; 
		case 73: return '9'; 
		case 74: return '.';
		case 75: return ';';
		
		
		}
		return null;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Setters();
	
		System.out.println("Here is your phrase");
		ArrayList<String> a = encrypt;
		Decoder(a);
		for(String x : original){
			System.out.print(x);
		}
		
	
		
	}

}
