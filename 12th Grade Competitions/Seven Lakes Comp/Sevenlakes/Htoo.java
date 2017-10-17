
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Htoo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Htoo.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			String line1 = Sf.nextLine();
			String line2 = Sf.nextLine();
			
			line1.replaceAll(" ", "");
		//	line1.replaceAll("(", "");
			//line1.replaceAll(")", "");
			line1.replaceAll(">", "");
			line1.replaceAll(",", "");
			
			line2.replaceAll(" ", "");
			//line2.replaceAll("(", "");
			//line2.replaceAll(")", "");
			line2.replaceAll(">", "");
			line2.replaceAll(",", "");
			double x1 = Double.parseDouble(line1.substring(1,2));
			double y1 = Double.parseDouble(line1.substring(4,5));
			double x2 = Double.parseDouble(line1.substring(10,11));
			double y2 = Double.parseDouble(line1.substring(13,14));
			
			double m1 = (y2-y1)/(x2-x1);
			double b1 = y1 - (m1 * x1);
			
			double x3 = Double.parseDouble(line2.substring(1,2));
			double y3 = Double.parseDouble(line2.substring(4,5));
			double x4 = Double.parseDouble(line2.substring(10,11));
			double y4 = Double.parseDouble(line2.substring(13,14));
			
			double m2 = (y4-y3)/(x4-x3);
			double b2 = y3 - (m2 * x3);
			
			
			if ((m1 == m2) && (b1 != b2))
			{
				System.out.println("NO INTERSECTION");
			}			
			// !(  (xintersect >= Math.min(x1, x2)) && xintersect <= Math.max(x1,x2) ) ||   !(  (xintersect >= Math.min(x3, x4)) && xintersect <= Math.max(x3,x4) )
			else{
				double xintersect = ((-1* (b1 - b2)) /(m1-m2));
				
				if ( (xintersect >= Math.min(x1, x2) && xintersect <= Math.max(x1,x2)  == true)
						&&
						(xintersect >= Math.min(x3, x4) && xintersect <= Math.max(x3,x4)  == true)
						){
					System.out.println("INTERSECT");
				}
				else{
					System.out.println("NO INTERSECTION");
				}
			}
		}
	}
	

}