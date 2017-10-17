//Array
//Duncan, 1/22/17
//Creates a Stack for Array class

import java.util.Scanner;

public class StacksforArray{
	
	public String[] Stack;
	
	//Constructor
	public StacksforArray(int x){
		Stack = new String[x];
	}

	//Method for adding a value
	public void push(String value){
		for(int x =0;x < Stack.length;x++){	
			if(Stack[x] == null){
				Stack[x] = value;
				break;
			}
		}
	}
	//Method for removing a value
	public void pop(){
		for(int x =0;x < Stack.length;x++){	
			if(Stack[x] == null){
				System.out.println(Stack[x-1]);
				Stack[x-1] = null;
				break;
			}
		}
	}
	//Method for looking at the last value
	public void peek(){
		for(int x =0;x < Stack.length;x++){	
			if(Stack[x] == null){
				System.out.println(Stack[x-1]);
				break;
			}
		}
	}
	//Method for testing if it is empty
	public boolean isEmpty(){
		for(int x =0;x < Stack.length;x++){	
			if(Stack[x] != null){
				System.out.println("false");
				return false;
			}
		}
		System.out.println("True");
		return true;
	}
	//Method for showing size
	public int size(){
		System.out.println(Stack.length);
		return Stack.length;
	}
	//Method for printing the arraylists
	public void print(){
		for(int x =0; x< Stack.length;x++){	
			System.out.println(Stack[x]);
		}
	}
	
	
}

