import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Danna {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stu
		ArrayList<String> data = new ArrayList<>();
		Scanner Sf = new Scanner(new File("Danna.dat"));
		while(Sf.hasNext()){
			double height= Sf.nextDouble();
			double weight = Sf.nextDouble();
			
			System.out.print((int)height + " ");
			System.out.print((int)weight + " ");
			
			height = (height * 0.0254);
			weight = (weight * 0.453592);
			
			double bmi = weight/(height*height);
			System.out.printf("%.2f", bmi);
			System.out.print(" ");
			
			if (bmi < 18.5)
			{
				System.out.print("underweight");
				data.add("underweight");
			}
			if(bmi > 18.5 && bmi <24.9)
			{
				System.out.print("normal");
				data.add("normal");
			}
			if(bmi > 25.0 && bmi < 29.9)
			{
				System.out.print("overweight");
				data.add("overweight");
			}
			if(bmi > 30.0)
			{
				data.add("obese");
				System.out.print("obese");
			}
			System.out.println("");
			
			
		}
		System.out.println(data.size() + " total students surveyed");
		
		double percentageUW =0.0;
		double percentageNormal = 0.0;
		double percentageOW = 0.0;
		double percentageOB = 0.0;
		for (int x= 0; x<data.size(); x++)
		{
			if (data.get(x).equals("underweight"))
				percentageUW += 1.0;
			if (data.get(x).equals("normal"))
				percentageNormal += 1.0;
			if (data.get(x).equals("overweight"))
				percentageOW += 1.0;
			if (data.get(x).equals("obese"))
				percentageOB += 1.0;
			
		}
		
		percentageUW = (percentageUW / (data.size() + 0.0)) * 100.0;
		percentageNormal = (percentageNormal / (data.size() + 0.0)) * 100.0;
		percentageOW = (percentageOW / (data.size() + 0.0)) * 100.0;
		percentageOB = (percentageOB / (data.size() + 0.0)) * 100.0;
		
		System.out.printf("%.2f", percentageUW);
		System.out.print("% underweight\n");
		System.out.printf("%.2f", percentageNormal);
		System.out.print("% normal\n");
		System.out.printf("%.2f", percentageOW);
		System.out.print("% overweight\n");
		System.out.printf("%.2f", percentageOB);
		System.out.print("% obese");
		
		
		
	}


}