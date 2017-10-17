//Array
//Duncan, 1/22/17
//Creates a Queue for Array class

import java.util.Scanner;

public class QueuesforArray{
	
	public String[] Queue;
	
	//Constructor
	public QueuesforArray(int x){
		Queue = new String[x];
	}

	//Method for adding a value
	public void push(String value){
		for(int x =0;x < Queue.length;x++){	
			if(Queue[x] == null){
				Queue[x] = value;
				break;
			}
		}
	}
	//Method for removing a value
	public void pop(){
		if(Queue[0] != null){
			System.out.println(Queue[0]);
			for(int x = 0; x < Queue.length-1;x++){
				Queue[x] = Queue [x+1];	
			}
			
		}
		
	}
	//Method for looking at the last value
	public void peek(){
		System.out.println(Queue[0]);
	}
	//Method for testing if it is empty
	public boolean isEmpty(){
		for(int x =0;x < Queue.length;x++){	
			if(Queue[x] != null){
				System.out.println("false");
				return false;
			}
		}
		System.out.println("True");
		return true;
	}
	//Method for showing size
	public int size(){
		System.out.println(Queue.length);
		return Queue.length;
	}
	//Method for printing the arraylists
	public void print(){
		for(int x =0; x< Queue.length;x++){	
			System.out.println(Queue[x]);
		}
	}
	
	
}

