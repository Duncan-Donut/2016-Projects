public class ShowStudent{
	
	public static void main(String[] args){
	
		Student name = new Student();
		
		name.setcreditHours(20);
		name.setpoints(40);
		
		int credit = name.getcreditHours();
		int points = name.getpoints();
		
		name.GPA(points,credit);
		
		double GPA = name.getGPA();
		
		System.out.println(GPA);
		
		ShowStudent2 Ji = new ShowStudent2();
		
		System.out.println(Ji.idNumber);
		System.out.println(Ji.points);
		System.out.println(Ji.creditHours);
		
	}
	
	
}