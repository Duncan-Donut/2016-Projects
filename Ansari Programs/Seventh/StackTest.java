//StackTest
//Duncan, 1/22/17
//Tests the Stacks for Arrays,Arraylists and LinkedLists
import java.util.Scanner;

public class StackTest{
	
	//Variables
	public static StacksforArray Stack;
	public static StacksforArrayLists stacks;
	public static StacksforLinkedLists stackLinked;
	public static String value;


	public static void main(String[] args){
		//StackArrayTest();
		//StackArrayListTest();
		StackLinkedTest();
	}
	
	public static void StackArrayTest(){
		//Constructs object
		Stack = new StacksforArray(5);
		
		//Adds objects
		Stack.push("A");
		Stack.push("B");
		Stack.push("C");
		Stack.print();
		
		//Removes an object
		System.out.println("Popped");
		Stack.pop();
		
		System.out.println("Print");	
		Stack.print();
		
		//Shows last object
		System.out.println("Peek");
		Stack.peek();
		
		//Checks if Array is empty
		System.out.println("Empty?");
		Stack.isEmpty();
		//Prints size of Array
		System.out.println("Size");
		Stack.size();
			
	}
	
	public static void StackArrayListTest(){
		//Constructs object
		stacks = new StacksforArrayLists();
		
	    //Tells user how it functions
		Scanner scan = new Scanner(System.in);
		System.out.println("1: To add");
		System.out.println("2: To remove");
		System.out.println("3. To check next value");
		System.out.println("4: To check if empty");
		System.out.println("5: To check size");
		System.out.println("6: To print");
		System.out.println("7: To exit");
		
		//Asks for input
		int input = scan.nextInt();

		//Creates a l oop
		while(input !=7){		
			
			if(input == 1){
				value = scan.next();	
			}
			//Uses appropriate method
			switch(input){
				case 1:stacks.push(value);System.out.println("Pushed");break;
				case 2:stacks.pop();System.out.println("Popped");break;
				case 3:stacks.peek();System.out.println("Peeked");break;
				case 4:stacks.isEmpty();System.out.println("Checked");break;
				case 5:stacks.size();System.out.println("Sized");break;
				case 6:stacks.print();System.out.println("Printed");break;
				case 7:break;	
			}
			
			input = scan.nextInt();
		}
		
	}
	public static void StackLinkedTest(){
		//Constructs object
		stackLinked = new StacksforLinkedLists();
		
	    //Tells user how it functions
		Scanner scan = new Scanner(System.in);
		System.out.println("1: To add");
		System.out.println("2: To remove");
		System.out.println("3. To check next value");
		System.out.println("4: To check if empty");
		System.out.println("5: To check size");
		System.out.println("6: To print");
		System.out.println("7: To exit");
		
		//Asks for input
		int input = scan.nextInt();

		//Creates a loop
		while(input !=7){		
			
			if(input == 1){
				value = scan.next();	
			}
			//Uses appropriate method
			switch(input){
				case 1:stackLinked.push(value);System.out.println("Pushed");break;
				case 2:stackLinked.pop();System.out.println("Popped");break;
				case 3:stackLinked.peek();System.out.println("Peeked");break;
				case 4:stackLinked.isEmpty();System.out.println("Checked");break;
				case 5:stackLinked.size();System.out.println("Sized");break;
				case 6:stackLinked.print();System.out.println("Printed");break;
				case 7:break;	
			}
			
			input = scan.nextInt();
		}
	}
	
	
}