//CScourse	       
//Duncan, 1/10/17
//LinkedList Class that has methods to alter the list
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDriver{

	public static void main(String[] args){
	
	//Creates the list and adds a value to start it off
	LinkedListExample list = new LinkedListExample();
	list.addBeginning("a");

	//Scanner to gain user input
	Scanner scan = new Scanner(System.in);
	String data;
	int placement;
		
		//Prints out the initial list
		list.iterator();
		
		//Adds to the end of the list
		System.out.println("Add to the end");
		data = scan.next();
		list.add(data);
		list.iterator();
		
		//Adds to the beginning
		System.out.println("Add to the beginning");
		data = scan.next();
		list.addBeginning(data);
		list.iterator();
	
		//Inserts data at any position
		System.out.println("Add anywhere, insert point and then data");
		placement = scan.nextInt();
		data = scan.next();
		list.insert(placement,data);
		list.iterator();
	
		//Deletes some data
		System.out.println("Remove");
		data = scan.next();
		list.delete();
		list.iterator();
	}




	
	
}