//QueueTest
//Duncan, 1/22/17
//Tests the Queue for Arrays
import java.util.Scanner;
public class QueueTest{
	
	//Variables
	public static QueuesforArray queue;
	public static QueuesforArrayLists queues;
	public static QueuesforLinkedLists queueLinked;
	public static String value;


	public static void main(String[] args){
		//QueueArrayTest();
		//QueueListTest();
		QueueLinkedTest();
	}
	
	public static void QueueArrayTest(){
		//Constructs object
		queue = new QueuesforArray(5);
		
		//Adds objects
		queue.push("A");
		queue.push("B");
		queue.push("C");
		queue.print();
		
		//Removes an object
		System.out.println("Popped");
		queue.pop();
		
		System.out.println("Print");	
		queue.print();
		
		//Shows last object
		System.out.println("Peek");
		queue.peek();
		
		//Checks if Array is empty
		System.out.println("Empty?");
		queue.isEmpty();
		//Prints size of Array
		System.out.println("Size");
		queue.size();
			
	}
	
	public static void QueueListTest(){
		//Constructs object
		queues = new QueuesforArrayLists();
		
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
				case 1:queues.push(value);System.out.println("Pushed");break;
				case 2:queues.pop();System.out.println("Popped");break;
				case 3:queues.peek();System.out.println("Peeked");break;
				case 4:queues.isEmpty();System.out.println("Checked");break;
				case 5:queues.size();System.out.println("Sized");break;
				case 6:queues.print();System.out.println("Printed");break;
				case 7:break;	
			}
			
			input = scan.nextInt();
		}
	}
	public static void QueueLinkedTest(){
		//Constructs object
		queueLinked = new QueuesforLinkedLists();
		
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
				case 1:queueLinked.push(value);System.out.println("Pushed");break;
				case 2:queueLinked.pop();System.out.println("Popped");break;
				case 3:queueLinked.peek();System.out.println("Peeked");break;
				case 4:queueLinked.isEmpty();System.out.println("Checked");break;
				case 5:queueLinked.size();System.out.println("Sized");break;
				case 6:queueLinked.print();System.out.println("Printed");break;
				case 7:break;	
			}
			
			input = scan.nextInt();
		}
	}
	
	
}