public class Student{
	private int idNumber;
	private int creditHours;
	private int points;
	private int gradeAverage;
	private double GPA;
	
	public Student(){
		 idNumber = 9999;
		 points = 12;
		 creditHours = 3;
	}
	
	public void setidNumber(int value){
		idNumber = value;
	}
	public void setcreditHours(int value){
		creditHours = value;
	}
	public void setpoints(int value){
		points = value;
	}
	public void setgradeAverage(int value){
		gradeAverage = value;
	}
	public void GPA(int points, int creditHours){
		GPA = points/creditHours;
	}
	public double getGPA(){
		return GPA;
	}
	public int getidNumber(){
		return idNumber;
	}
	public int getcreditHours(){
		return creditHours;
	}
	public int getpoints(){
		return points;
	}
	public int getgradeAverage(){
		return gradeAverage;
	}
	
	
	

	
	
	
	
}