//ArrayLists
//Duncan, 1/22/17
//Creates a Stack for ArrayList class

import java.util.Scanner;
import java.util.ArrayList;

public class StacksforArrayLists{
	
	public ArrayList<String> stack;
	
	//Constructor
	public StacksforArrayLists(){
		stack = new ArrayList<String>();
	}

	//Method for adding a value
	public void push(String value){
		stack.add(value);
	}

	//Method for removing a value
	public void pop(){
		stack.remove(stack.size() - 1);
	}
	
	//Method for looking at the last value
	public void peek(){
		System.out.println(stack.get(stack.size() - 1));
	}
	
	//Method for testing if it is empty
	public boolean isEmpty(){
		if(stack.isEmpty()){
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
	}
	
	//Method for showing size
	public int size(){
		System.out.println(stack.size());
		return stack.size();
	}
	//Method for printing the arraylists
	public void print(){
		for(String x: stack){	
			System.out.println(x);
		}
	}
	
	
}

