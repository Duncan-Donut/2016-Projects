import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Hash {
	
	static ArrayList<String> original = new ArrayList<String>();
	static ArrayList<String> encrypt = new ArrayList<String>();
	static ArrayList<Integer> random = new ArrayList<Integer>();
	static ArrayList<Integer> diffe = new ArrayList<Integer>();
	
	public static ArrayList<String> GenerateHash(String input){
		
		
		String [] words = input.split("\\s+");
	 
		
		//ArrayList containing the original phrase 
		original.addAll(Arrays.asList(words));
		
		
		for(String temp: original){
			
			String edata = "";
			//Splitting the phrase into words
			String[] diff = temp.split("(?!^)");
			
			for(int x = 0; x<temp.length();x++){
					
					//Going through each letter of the word
					//and assigning it a random number
					double a = Math.random();
					int b = (int)(a*74);
					//Random Number is used to get the corresponding letter
					Character pass = encryption(b);
					edata += pass;
					
					//Difference is calculated
					int difference = difference(diff[x]);
					
					random.add(b);
					diffe.add((b*b*7)- difference);
				}
			encrypt.add(edata + " ");
		}
		
		return encrypt;
		
		
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
			
	public static Character difference(String C){
		
		switch(C){
		
		case "~": return 0;
		case "a": return 1;
		case "b": return 2;
		case "c": return 3;
		case "d": return 4;
		case "e": return 5;
		case "f": return 6;
		case "g": return 7;
		case "h": return 8;
		case "i": return 9;
		case "j": return 10;
		case "k": return 11;
		case "l": return 12;
		case "m": return 13;
		case "n": return 14;
		case "o": return 15;
		case "p": return 16;
		case "q": return 17;
		case "r": return 18;
		case "s": return 19;
		case "t": return 20;
		case "u": return 21;
		case "v": return 22;
		case "w": return 23;
		case "x": return 24;
		case "y": return 25;
		case "z": return 26;
		case "A": return 27;
		case "B": return 28;
		case "C": return 29;
		case "D": return 30;
		case "E": return 31;
		case "F": return 32;
		case "G": return 33;
		case "H": return 34;
		case "I": return 35;
		case "J": return 36;
		case "K": return 37;
		case "L": return 38;
		case "M": return 39;
		case "N": return 40;
		case "O": return 41;
		case "P": return 42;
		case "Q": return 43;
		case "R": return 44;
		case "S": return 45;
		case "T": return 46;
		case "U": return 47;
		case "V": return 48;
		case "W": return 49;
		case "X": return 50;
		case "Y": return 51;
		case "Z": return 52;
		case "!": return 53; 
		case "@": return 54; 
		case "#": return 55;
		case "$": return 56; 
		case "%": return 57; 
		case "^": return 58; 
		case "&": return 59; 
		case "*": return 60; 
		case "+": return 61; 
		case "=": return 62; 
		case "|": return 63; 
		case "0": return 64;
		case "1": return 65;
		case "2": return 66;
		case "3": return 67;
		case "4": return 68;
		case "5": return 69; 
		case "6": return 70; 
		case "7": return 71;
		case "8": return 72; 
		case "9": return 73; 
		case ".": return 74;
		case ";": return 75;
		
				
		}
		return null;
	}
	
	
	public static void write() throws IOException{
		
		FileWriter writer = new FileWriter("random.txt"); 
		
		for(Integer ran: random) {
		  writer.write(ran + " ");
		}
		writer.close(); 
		
		FileWriter dwriter = new FileWriter("difference.txt"); 
		for(Integer dif: diffe) {
		  dwriter.write(dif + " ");
		}
		dwriter.close(); 
		
		FileWriter ewriter = new FileWriter("encryption.txt"); 
		for(String di: encrypt) {
		  ewriter.write(di);
		}
		ewriter.close(); 
		
		}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Scanner Sf = new Scanner(System.in);
		
		System.out.println("Please enter what you desire to be encoded");
		
		String input = Sf.nextLine();
		
		System.out.println("");
		System.out.println("Here is your encoded hash");
		ArrayList<String> a = GenerateHash(input);
		System.out.println(a);
		
		System.out.println("");
		System.out.println("Here is your random numbers array");
		System.out.println(random);
		
		System.out.println("");
		System.out.println("Here is your difference numbers array");
		System.out.println(diffe);
		
	
		
		write();
	}


	
	
	
	

}
