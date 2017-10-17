//Registration	
//Duncan, 1/10/17
//Sets up the arraylist

import java.util.Scanner;
import java.util.ArrayList;

public class Registration{

	//ArrayList
	public static ArrayList<Students> course = new ArrayList<Students>();
	
	//Adds students
	public static void addStudent(Students input){
		course.add(input);
	}
	
	//Returns course
	public static ArrayList<Students> getCourse(){
		return course;
	}
}