//CScourse	
//Duncan, 1/10/17
//LinkedList Class that has methods to alter the list
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedLists{

	//Variables
	private Node head;
	Node position = new Node();
	Node iterator = new Node();
	
	//Constructor
	public LinkedLists(){
		head = null;	
	}
	//Deletes from the beginning
	public boolean deleteBeginning(){
		if(head != null){
			next();
			head = iterator.link;
			return true;
		}
			return false;
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
		
		if(head == null){
		head = new Node(input,head);
			position.link = head;
			iterator.link = head;
		}
		else{
		Node newNode = new Node(input,null);
		Node temp;
		
		temp = position.link;
		temp.link = newNode;
		position.link = newNode;
		}
	
	}
	
	//Printers the last value
	public void speek(){
		while(hasNext()){
			next();	
		}
		printer();
		
	}
	//Printers the last value
	public void qpeek(){
		if(head != null){
			printer();
		}
	}
	
	public boolean isEmpty(){
		resetIterator();

		if(iterator.link != null){
			return false;	
		}
		return true;
	}
	
		//Runs through the entire list and prints out the values
	public Integer size(){
		resetIterator();
		int x = 0;
		while(hasNext()){
			x++;
			next();
		}
		return ++x;
	}
	
	//Prints out the item at the point
	public void printer(){
		Node temp;
		temp = iterator.link;
		
		System.out.println(temp.item);
	}
	
	
	//Runs to the next item in the list
	public boolean next(){
		Node temp = iterator.link;
		if(temp.link != null){
			iterator.link = temp.link;
			return true;
		}
		else{
			return false;
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