//LinkedLists
//Duncan, 1/22/17
//Creates a Stack for LinkedList class

import java.util.Scanner;
import java.util.LinkedList;

public class StacksforLinkedLists{
	
	public LinkedLists Stack;
	
	//Constructor
	public StacksforLinkedLists(){
		Stack = new LinkedLists();
	}

	//Method for adding a value
	public void push(String value){
		Stack.add(value);
	}

	//Method for removing a value
	public void pop(){
		Stack.delete();
	}
	
	//Method for looking at the last value
	public void peek(){
		Stack.speek();
	}
	
	//Method for testing if it is empty
	public boolean isEmpty(){
		System.out.println(Stack.isEmpty());
		return Stack.isEmpty();
		
	}
	
	//Method for showing size
	public int size(){
		System.out.println(Stack.size());
		return Stack.size();
	}
	//Method for printing the LinkedLists
	public void print(){
		Stack.iterator();
	}
	
	
}

