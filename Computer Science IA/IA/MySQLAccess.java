
//Duncan Rowe 12/14/16, main class for all SQL 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class MySQLAccess extends StudentGovernmentAttendance {
        
	//Constants
  final private static String HOST = "127.0.0.1";
  final private static String USER = "root";
  final private static String PASSWD = "";
	
   //Variables
  private static Connection connect = null;
  private static Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private static ResultSet resultSet = null;

  
  //Connection to DataBase
  public static void Connect() throws SQLException, ClassNotFoundException{
	  
	  Class.forName("com.mysql.jdbc.Driver");
      
      connect = DriverManager.getConnection("jdbc:mysql://" + HOST + "/test?"
              + "user=" + USER + "&password=" + PASSWD + "&useSSL=false");
      
      statement = connect.createStatement();
	  
  }
  
 
  //Used by new attendance, adds columns to Student Table and adds dates to the Date Table
  public static void newAttendanceSQL(String day, String month, String year) throws SQLException, ClassNotFoundException{
	 
	  String input = month + "/" + day + "/" + year;
	  
	  Connect();
	  
	  PreparedStatement ps = connect
	          .prepareStatement("ALTER TABLE Students ADD `" + input  + "` int");
	  
	  ps.executeUpdate();
	 
	  ps = connect
	          .prepareStatement("ALTER TABLE Students ADD `Excuses " + input  + "` varchar(255)");
	  ps.executeUpdate();
	  
	  ps = connect
	          .prepareStatement("INSERT INTO Dates (date) VALUES('" + input + "')");
	  ps.executeUpdate();
  }
  
  //Used by Change Attendance, Change Referrals, View Specific Screen and Update Excuses 
  //Gets names from Students
  public static ArrayList<String> studentAttendanceSQL() throws SQLException, ClassNotFoundException{
		 
	  Connect();
	  
	  ArrayList<String> names = new ArrayList<String>();
	  resultSet = statement.executeQuery("SELECT Name from Students");
	  
	  while (resultSet.next()) {
	       names.add(resultSet.getString("Name"));
	  }
	  
	return names;
	  
  }
  
  //Used by Change Attendance and Student Attendance
  //Updates the students attendance status
  public static void present(String date, String name) throws SQLException, ClassNotFoundException{
	  
	  PreparedStatement ps = connect
	          .prepareStatement("UPDATE Students SET `" + date + "`='1' WHERE Name= '" + name + "'");
	  ps.executeUpdate();

	  ps = connect
	          .prepareStatement("UPDATE Students SET `Excuses " + date + "`= '" + "N/A" + "' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
	  
  }
  //Used by Change Attendance and Student Attendance
  //Updates the students attendance status
  public static void late(String date, String name) throws SQLException, ClassNotFoundException{

	  PreparedStatement ps = connect
	          .prepareStatement("UPDATE Students SET `" + date + "`='2' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
	  ps = connect
	          .prepareStatement("UPDATE Students SET `Excuses " + date + "`= '" + "N/A" + "' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
	  
  }
  //Used by Change Attendance, Student Attendance and Change Excuses
  //Updates the students attendance status

  public static void excused(String date, String name,String excuse) throws SQLException, ClassNotFoundException{
		 
	  PreparedStatement ps = connect
	          .prepareStatement("UPDATE Students SET `" + date + "`='3' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
	  ps = connect
	          .prepareStatement("UPDATE Students SET `Excuses " + date + "`= '" + excuse + "' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
  }
  //Used by Change Attendance and Student Attendance
  //Updates the students attendance status

  public static void absent(String date, String name) throws SQLException, ClassNotFoundException{
	  
	  PreparedStatement ps = connect
	          .prepareStatement("UPDATE Students SET `" + date + "`='4' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
	  
	  ps = connect
	          .prepareStatement("UPDATE Students SET `Excuses " + date + "`= '" + "N/A" + "' WHERE Name= '" + name + "'");
	  ps.executeUpdate();
	  
  }
  
  //Used by AddStudent, adds student name to Students
  public static void addName (String input) throws SQLException, ClassNotFoundException{
	  
	  Connect();
	  
	  PreparedStatement ps = connect
	          .prepareStatement("INSERT INTO Students (Name,Referral) VALUES('" + input + "','0')");
	  ps.executeUpdate();
	  
  }
  //Used by delete student, deletes student name from Students
  public static void deleteName (String input) throws SQLException, ClassNotFoundException{
	  
	  
	  PreparedStatement ps = connect
	          .prepareStatement("DELETE FROM Students WHERE Name = '" + input + "'");
	  ps.executeUpdate();
	  
  }

  //Used by Update Excuses, updates the students excuses
	public static void EUpdate(String date, String name, String excuse) throws SQLException, ClassNotFoundException{
	
		
		  PreparedStatement ps = connect
		          .prepareStatement("UPDATE Students SET `Excuses " + date + "`='" + excuse + "' WHERE Name= '" + name + "'");
		  ps.executeUpdate();
		  
	
	}
	
	//Used by Change Dates and Delete Date, drops columns from Students and values from Date
	public static void deleteDate(String date) throws SQLException, ClassNotFoundException{
		
		  PreparedStatement ps = connect
		          .prepareStatement("ALTER TABLE Students DROP `" + date + "`");
		  ps.executeUpdate();
		  
		  ps = connect
		          .prepareStatement("ALTER TABLE Students DROP `Excuses " + date + "`");
		  ps.executeUpdate();
		  
		  ps = connect
		          .prepareStatement("DELETE FROM Dates WHERE date = '" + date + "'");
		  ps.executeUpdate();
		  
	}
	//Used by View Table, View Specific and View Referral Table, gets the data for the table
	public static MyResult theTable() throws SQLException, ClassNotFoundException{
		
		 Connect();
		
		 //Variables
		 ArrayList<String> columnNames = new ArrayList<String>();
	     ArrayList<Object> data = new ArrayList<Object>();
	     MyResult result;

	     
	         String sql = "SELECT * FROM Students";

	         statement = connect.createStatement();
	         ResultSet rs = statement.executeQuery(sql);
	     
	         ResultSetMetaData md = rs.getMetaData();
	         int columns = md.getColumnCount();

	         //  Get column names
	         for (int i = 1; i <= columns; i++)
	         {
	             columnNames.add( md.getColumnName(i) );
	         }

	         //  Get row data
	         while (rs.next())
	         {
	             ArrayList row = new ArrayList(columns);

	             for (int i = 1; i <= columns; i++)
	             {
	                 row.add( rs.getObject(i) );
	             }

	             data.add( row );
	         }
		    
	       //Can't return two array lists so I used a constructor
	       result = new MyResult(columnNames, data);
	         
	     return result;

	}
	//Used by referral table, gets the data from the table
	public static MyResult theRefferalTable() throws SQLException, ClassNotFoundException{
		
		 Connect();
		
		 //Variables
		 ArrayList<String> columnNames = new ArrayList<String>();
	     ArrayList<Object> data = new ArrayList<Object>();
	     MyResult result;

	         String sql = "SELECT * FROM Students WHERE Referral = '1' or Referral = '2'";

	         statement = connect.createStatement();
	         ResultSet rs = statement.executeQuery(sql);
	     
	         ResultSetMetaData md = rs.getMetaData();
	         int columns = md.getColumnCount();

	         //  Get column names
	         for (int i = 1; i <= columns; i++)
	         {
	             columnNames.add( md.getColumnName(i) );
	         }

	         //  Get row data
	         while (rs.next())
	         {
	             ArrayList row = new ArrayList(columns);

	             for (int i = 1; i <= columns; i++)
	             {
	                 row.add( rs.getObject(i) );
	             }

	             data.add( row );
	         }
	         
	         result = new MyResult(columnNames, data);
	         //Can't return two array lists so I used a constructor

	     return result;

	}
	//Used by Delete Date and Update Excuses, gets the dates
	public static ArrayList<String> getDates() throws SQLException, ClassNotFoundException{
		
		 Connect();  
		
		  ArrayList<String> date = new ArrayList<String>();
		  resultSet = statement.executeQuery("SELECT date from Dates");
		  
		  while (resultSet.next()) {
		       date.add(resultSet.getString("date"));
		  }
		  
		return date;
	}
	
	//Used by Calculating Referrals, gets specific dates 
	public static Integer decideReferral(String date, String name) throws SQLException, ClassNotFoundException{
		
		 Connect();
		 int aNumber =0;
		  
		  resultSet = statement.executeQuery("SELECT `" + date + "` FROM Students WHERE Name = '" + name + "'");

		  while (resultSet.next()) {
			  aNumber = resultSet.getInt(date);
		  }
		
		  return aNumber;
	}
	//Used by Calculating Referrals, updates referral 
	 public static void setWatch(String name) throws SQLException, ClassNotFoundException{
		 
		  
		  PreparedStatement ps = connect
		          .prepareStatement("UPDATE Students SET Referral ='1' WHERE Name= '" + name + "'");
		  ps.executeUpdate();
		  
	  }
		//Used by Calculating Referrals, update referral
	 public static void setReferral(String name) throws SQLException, ClassNotFoundException{
		
		  PreparedStatement ps = connect
		          .prepareStatement("UPDATE Students SET Referral ='2' WHERE Name= '" + name + "'");
		  ps.executeUpdate();
		  
	  }
		//Used by Calculating Referrals, gets the referrals
	 public static Integer ReferralCheck(String name) throws SQLException, ClassNotFoundException{
		 
		  int aNumber =0;
		  
		  resultSet = statement.executeQuery("SELECT Referral FROM Students WHERE Name = '" + name + "'");

		  while (resultSet.next()) {
			  aNumber = resultSet.getInt("Referral");
		  }
		
		  return aNumber;
	  }
	 
	 //Used by view specific table, used to get data
	 public static MyResult SpecificTable(String name) throws SQLException, ClassNotFoundException{
		 

		 	 //Variables
		     ArrayList<String> columnNames = new ArrayList<String>();
		     ArrayList<Object> data = new ArrayList<Object>();
		     MyResult result;


		         String sql = "SELECT * FROM Students WHERE Name = '" + name + "'";

		         statement = connect.createStatement();
		         ResultSet rs = statement.executeQuery(sql);
		     
		         ResultSetMetaData md = rs.getMetaData();
		         int columns = md.getColumnCount();

		         for (int i = 1; i <= columns; i++)
		         {
		             columnNames.add( md.getColumnName(i) );
		         }

		         while (rs.next())
		         {
		             ArrayList row = new ArrayList(columns);

		             for (int i = 1; i <= columns; i++)
		             {
		                 row.add( rs.getObject(i) );
		             }

		             data.add( row );
		         }
		         
		         result = new MyResult(columnNames, data);
		         //Can't return two array lists so I used a constructor

		     return result;
	  }
	 
	 //Used by Add Date and New Attendance, gets date from Dates
	 public static boolean Checker(String date) throws SQLException, ClassNotFoundException{
			
		  Connect();  
		  resultSet = statement.executeQuery("SELECT date FROM Dates WHERE date = '" + date + "'");

		  while(resultSet.next()){
		      String x = resultSet.getString("date");

		      if(x.equals(date)){
		    	  return true;
		      }
		  }
		
		  return false;
	}
	 //Used by Change Referrals, updates Referrals
	 public static void changeReferral(String name, String referral) throws SQLException, ClassNotFoundException{
			
		  PreparedStatement ps = connect
		          .prepareStatement("Update Students SET `Referral` = '" + referral + "' WHERE Name= '" + name + "'");
		  ps.executeUpdate();

	}
	
	 

	
  
}
