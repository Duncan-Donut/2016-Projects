import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kostas {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Kostas.dat"));

		while(Sf.hasNextLine()){
			
			String line = Sf.nextLine();
			
			String[] hello = line.split(" ");
			
			for(int zero = 0; zero<hello.length;zero++){
			
			String hi = hello[zero].toUpperCase();
			
			hi = hi.replaceAll("A", "4");
			hi = hi.replaceAll("B", "8");
			hi = hi.replaceAll("C", "[");
			hi = hi.replaceAll("D", ")");
			hi = hi.replaceAll("E", "3");
			hi = hi.replaceAll("F", "|=");
			hi = hi.replaceAll("G", "6");
			hi = hi.replaceAll("H", "#");
			hi = hi.replaceAll("I", "|");
			hi = hi.replaceAll("J", "]");
			hi = hi.replaceAll("K", "|<");
			hi = hi.replaceAll("L", "1");
			hi = hi.replaceAll("M", "^^");
			hi = hi.replaceAll("N", "^");
			hi = hi.replaceAll("O", "0");
			hi = hi.replaceAll("P", "|o");
			hi = hi.replaceAll("Q", "9");
			hi = hi.replaceAll("R", "2");
			hi = hi.replaceAll("S", "5");
			hi = hi.replaceAll("T", "7");
			hi = hi.replaceAll("U", "(_)");
			hi = hi.replaceAll("V", "\\/");
			hi = hi.replaceAll("W", "vv");
			hi = hi.replaceAll("X", "><");
			hi = hi.replaceAll("Y", "/");
			hi = hi.replaceAll("Z", "%");
			
			int counter = 0;
			
			if(hi.length()>=5){
				if(hi.substring(hi.length()-5,hi.length()).equals("4^^3)")){
					System.out.print(hi.substring(0,hi.length()-5) + "*)");
					counter++;

				}
			}
			if(hi.length() >= 3){
				if(hi.substring(hi.length()-3,hi.length()).equals("4^)")){
					System.out.print(hi.substring(0,hi.length()-3) + "&");
					counter++;

				}
				if(hi.substring(hi.length()-3,hi.length()).equals("4^7")){
					System.out.print(hi.substring(0,hi.length()-3) + "&");
					counter++;

				}
				

			}
			if(hi.length() >= 2){
				if(hi.substring(hi.length()-2,hi.length()).equals("32")){
					System.out.print(hi.substring(0,hi.length()-2) + "XOR");
					counter++;

				}
				if(hi.substring(hi.length()-2,hi.length()).equals("02")){
					System.out.print(hi.substring(0,hi.length()-2) + "ZOR");
					counter++;

				}
				if(hi.substring(hi.length()-2,hi.length()).equals("3)")){
					System.out.print(hi.substring(0,hi.length()-2) + "*D");
					counter++;

				}

			}
			
			
			if(counter == 0 ){
				System.out.print(hi);
				
			}
			
			counter = 0;
			System.out.print(" ");

			}
			System.out.println("");
				
				
			
			
			
		}
		
		
		
	}


}