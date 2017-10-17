//ArrayLists
//Duncan, 1/22/17
//Creates a Queue for ArrayList class

import java.util.Scanner;
import java.util.ArrayList;

public class QueuesforArrayLists{
	
	public ArrayList<String> Queue;
	
	//Constructor
	public QueuesforArrayLists(){
		Queue = new ArrayList<String>();
	}

	//Method for adding a value
	public void push(String value){
		Queue.add(value);
	}

	//Method for removing a value
	public void pop(){
		if(Queue.get(0) != null){
			Queue.remove(0);
			for(int x = 0 ; x< Queue.size()-2;x++){
				Queue.set(x,Queue.get(x+1));
			}
		}
	}
	
	//Method for looking at the last value
	public void peek(){
		System.out.println(Queue.get(0));
	}
	
	//Method for testing if it is empty
	public boolean isEmpty(){
		if(Queue.isEmpty()){
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
	}
	
	//Method for showing size
	public int size(){
		System.out.println(Queue.size());
		return Queue.size();
	}
	//Method for printing the arraylists
	public void print(){
		for(String x: Queue){	
			System.out.println(x);
		}
	}
	
	
}

