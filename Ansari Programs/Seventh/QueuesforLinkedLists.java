//LinkedLists
//Duncan, 1/22/17
//Creates a Queue for LinkedList class

import java.util.Scanner;
import java.util.LinkedList;

public class QueuesforLinkedLists{
	
	public LinkedLists Queue;
	
	//Constructor
	public QueuesforLinkedLists(){
		Queue = new LinkedLists();
	}

	//Method for adding a value
	public void push(String value){
		Queue.add(value);
	}

	//Method for removing a value
	public void pop(){
		if(Queue.next() == true){
			Queue.deleteBeginning();
		}
	}
	
	//Method for looking at the last value
	public void peek(){
		Queue.qpeek();
	}
	
	//Method for testing if it is empty
	public boolean isEmpty(){
		System.out.println(Queue.isEmpty());	
		return Queue.isEmpty();	
	}
	
	//Method for showing size
	public int size(){
		System.out.println(Queue.size());
		return Queue.size();
	}
	//Method for printing the LinkedLists
	public void print(){
		Queue.iterator();
	}
	
	
}

