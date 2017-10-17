public class IfStatements{

	public static void main(String[] args){
		
		System.out.println(IfStatements.isEven(6));
		
		
	}
	
	public static boolean isEven(int value){

		if(value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
}