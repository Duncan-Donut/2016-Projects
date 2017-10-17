//Student
//Duncan, 1/10/17
//Creates a student class

import java.util.Scanner;

public class Students{

	//Variables
	private  String name;
	private  int idNumber;
	
	//Constructor
	public Students(String input, int numberInput){
		name = input;
		idNumber = numberInput;
	}
	//Getters
	public String getName(){
		return name;
	}
	public int getIDnumber(){
		return idNumber;	
	}
	
}