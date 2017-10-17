import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Evelyn {

	public static String add(String n_2, String n_1)
	{
		if(n_2.equals("&") && n_1.equals("&"))
			return "&";
		if(n_2.equals("&") && n_1.equals("'"))
			return "'";
		if(n_2.equals("'") && n_1.equals("&"))
			return "'";
		if(n_2.equals("&") && n_1.equals("("))
			return "(";
		if(n_2.equals("(") && n_1.equals("&"))
			return "(";
		if(n_2.equals("'") && n_1.equals("'"))
			return "(";
		
		if(n_2.equals("'") && n_1.equals("("))
			return ")";
		
		if(n_2.equals("(") && n_1.equals("'"))
			return ")";
		
		if(n_2.equals("'") && n_1.equals(")"))
			return "*";
		
		if(n_2.equals(")") && n_1.equals("'"))
			return "*";
		
		if(n_2.equals("'") && n_1.equals("*"))
			return "+";
		
		if(n_2.equals("*") && n_1.equals("'"))
			return "+";
		
		
		
		if(n_2.equals("'") && n_1.equals("+"))
			return ",";
		
		if(n_2.equals("+") && n_1.equals("'"))
			return ",";
		
		
		if(n_2.equals("'") && n_1.equals(","))
			return "-";
		
		if(n_2.equals(",") && n_1.equals("'"))
			return "-";
		
		if(n_2.equals("'") && n_1.equals("-"))
			return ".";
		
		if(n_2.equals("-") && n_1.equals("'"))
			return ".";
		
		if(n_2.equals("'") && n_1.equals("."))
			return "/";
		
		if(n_2.equals(".") && n_1.equals("'"))
			return "/";
		
		if(n_2.equals("'") && n_1.equals("/"))
			return "'&";
		
		if(n_2.equals("/") && n_1.equals("'"))
			return "'&";
		
		if(n_2.equals("/") && n_1.equals("/"))
			return "'.";
		
		
		if(n_2.equals("*") && n_1.equals("+"))
			return "''";
		
		if(n_2.equals("+") && n_1.equals("*"))
			return "''";
		return "134435";
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Evelyn.dat"));

		while(Sf.hasNext()){
			int x= Sf.nextInt();
			if (x  == 0)
			{
				System.out.print("'");
			}
			else if (x == 1)
			{
				System.out.print("' '");
			}
			else
			{
				String n__2 = "'";
				String n__1 = "'";
				
				System.out.print("' ' ");
				
				String n = add(n__2, n__1);
				
				for(int y = 2; y<=x; y++)
				{
					System.out.print(n + " ");
					n__2 = n__1;
					n__1 = n;
					n = add(n__2, n__1);
				}
				
						
			}
			System.out.println("");
			
		}
		
	}


}