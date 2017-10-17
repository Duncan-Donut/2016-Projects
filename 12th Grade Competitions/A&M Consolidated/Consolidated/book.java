import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class book {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> data = new ArrayList<>();
		Scanner Sf = new Scanner(new File("book.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		
		for(int x = 0; x<num;x++){
			String a = Sf.next();
			
			char[] b = a.toCharArray();
			
			int placement = 0;

			for(int y=0;y<b.length;y++){
				if(b[y] < 90){
					placement = y;
				}
			}
			
			String hello = b[placement] + "";
				if(placement == 0 && hello.matches("[AEIOU]")){
					for(int p = 0;p<b.length-3;p++){
						System.out.print(b[p]);
					}
					System.out.println();
				}
				else{
					for(int p=placement;p<b.length-2;p++){
						System.out.print(b[p]);
						
					}
					for(int o = 0;o<placement;o++){
						System.out.print(b[o]);
					}
					System.out.println();
				}
			}
			
		}
		


}