//Student
//Duncan, 1/10/17
//Prints out the work hours
import java.util.Scanner;


public class DayofWeek{

	//Enumeration List
	public enum Day {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
	
	public static void main(String[] args){
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Here is a list of days");
		System.out.println("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday");
		
		System.out.println("Please type a day");
		
		//Answer, value the user inputs
		Day answer = Day.valueOf(input.next().toUpperCase());
	
		//Values
		switch(answer){
			case MONDAY:
			case TUESDAY:		
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY: System.out.println("Work hours from 9 to 9");break;
			case SATURDAY: System.out.println("Work hours from 10 to 6");break;
			case SUNDAY: System.out.println("Work hours from 11 to 5");break;
	
			}
		}
	
	
}