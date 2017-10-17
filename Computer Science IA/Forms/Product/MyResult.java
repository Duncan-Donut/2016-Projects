//Duncan Rowe 12/14/16, class for transporting two arraylists
import java.util.ArrayList;

public class MyResult {
		
		//Variables
	    private final ArrayList<String> first;
	    private final ArrayList<Object> second;

	    //Constructor
	    public MyResult(ArrayList<String> columnNames, ArrayList<Object> data) {
	        this.first = columnNames;
	        this.second = data;
	    }

	    //Methods for getting the two arraylists
	    public ArrayList<String> getFirst() {
	        return first;
	    }

	    public ArrayList<Object> getSecond() {
	        return second;
	    }
}
