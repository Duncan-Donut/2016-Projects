//CScourse	
//Duncan, 1/10/17
//CScourse, prints out the information 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class CScourse{

	//Creates 3 students
	public static Students student1;
	public static Students student2;
	public static Students student3;

	
	public static void main(String[] args){
		
		//Sets 3 students
		student1 = new Students("Duncan",1);
		
		student2 = new Students("Peter",2);
		
		student3 = new Students("Anti",3);
		
		//Adds the students to the array
		Registration.addStudent(student1);
		Registration.addStudent(student2);
		Registration.addStudent(student3);
		
		ArrayList<Students> course = Registration.getCourse();

		//For each loop printer
		for(Students stu : course){
			System.out.println(stu.getName());
			System.out.println(stu.getIDnumber());
		}
		
		//Iterator printer
		Iterator iterator = course.iterator();
		
		while(iterator.hasNext()){
			Students student = (Students) iterator.next();
			System.out.println(student.getName());
			System.out.println(student.getIDnumber());
		}

		
		
		
		
		
	}
	
	
}