//CScourse	
//Duncan, 1/10/17
//LinkedList Class that has methods to alter the list
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample{

	//Variables
	private Node head;
	Node position = new Node();
	Node iterator = new Node();
	
	//Constructor
	public LinkedListExample(){
		head = null;	
	}
	
	//Beginning
	public void addBeginning(String input){
	
		//Checks if head is null
		if(head == null){
			head = new Node(input,head);
			position.link = head;
			iterator.link = head;
		}
		else{
			Node second = new Node(head.item,head.link);
			head.item = input;
			head.link = second;
			iterator.link = head;
		}
	}
	
	//Deletes an item from the end if the head is not null
	public boolean delete(){
		if(head != null){
			head = head.link;
			iterator.link = head;
			return true;
		}
			return false;
	}
	//Adds an item to the end
	public void add(String input){
		Node newNode = new Node(input,null);
		Node temp;
		
		temp = position.link;
		temp.link = newNode;
		position.link = newNode;
	
	}
	
	//Inserts into the list, iterators through to the position wanted
	public void insert(int position, String input){
		
	Node newNode = new Node (input,null);	
	Node temp;
	
	for(int i =0; i < ( position-1); i++){
	   next();
	}
		temp = iterator.link;
		newNode.link = temp.link;
		temp.link = newNode;
		resetIterator();
	}
	//Prints out the item at the point
	public void printer(){
		Node temp;
		temp = iterator.link;
		
		System.out.println(temp.item);
	}
	
	
	//Runs to the next item in the list
	public void next(){
		Node temp = iterator.link;
		if(temp.link != null){
			iterator.link = temp.link;	
		}
		else{
			System.out.println("End of list");
		}
	}
	//Checks if there is another item in the list
	public boolean hasNext(){
		Node temp = iterator.link;
		
		if(temp.link == null){
			return false;	
		}
		else{
			return true;
		}
	}
	//Moves the iterator back to the head position
	public void resetIterator(){
		iterator.link = head;
	}
	
	//Runs through the entire list and prints out the values
	public void iterator(){
		while(hasNext()){
			printer();
			next();
		}
		if(hasNext() == false){
			printer();
			System.out.println("Finished");
			resetIterator();
		}
	}
	
	//Node class that is used to create the list
	private class Node{
		
		//Variables
		private String item;
		private Node link;
		
		//Empty constructor 
		public Node(){
			item = null;
			link = null;
		}
		
		//Assigns values to the node
		public Node(String input, Node linkValue){
			item = input;
			link = linkValue;
			
		}
	}
	


	
	
}