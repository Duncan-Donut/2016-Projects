
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Patricia {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(new File("Patricia.dat"));
		int num = Sf.nextInt(); Sf.nextLine();
		for(int x = 0; x<num;x++){
			int draws = Sf.nextInt();
			int redp = Sf.nextInt();
			int greenp = Sf.nextInt();
			int replace = 0;
			if (draws==2) {
				String remplace = Sf.next();
				
				if(remplace.equals("Y"))
						replace=0;
				if(remplace.equals("N"))
						replace=1;
			}
			if (draws==1) {
				String draw1=Sf.next();
				if(draw1.equals("R"))
						System.out.println(redp+"/"+(redp+greenp));
				if(draw1.equals("G"))
						System.out.println(greenp+"/"+(redp+greenp));
			}
			if (draws==2) {
				String draw1=Sf.next();
				String draw2=Sf.next();
				int d1r = 0;
				int d1g = 0;
				int d2r = 0;
				int d2g = 0; 
				int same = 0;
				if(draw1.equals("R"))
					d1r = 1;
				else
					d1r = 0;
				if(draw1.equals("G"))
					d1g = 1;
				else
					d1g = 0;
				if(draw2.equals("R"))
					d2r = 1;
				else
					d2r = 0;
				if(draw2.equals("G"))
					d2g = 1;
				else
					d2g = 0;
				if(d1r==d2r)
					same=1;
				System.out.println((redp*d1r+greenp*d1g)*(redp*d2r+greenp*d2g-same)+"/"+(redp+greenp)*(redp+greenp-replace));
			}
		}
	}

}