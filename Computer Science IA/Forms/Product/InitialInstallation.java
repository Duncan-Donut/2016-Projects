import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InitialInstallation{

	 final private static String HOST = "127.0.0.1";
	  final private static String USER = "root";
	  final private static String PASSWD = "Tw1gletdog";
		
	   //Variables
	  private static Connection connect = null;
	  private static Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private static ResultSet resultSet = null;
	  
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connect();
		CreateTable();

	}
	
	 //Connection to DataBase
	  public static void Connect() throws SQLException, ClassNotFoundException{
		  
		  Class.forName("com.mysql.jdbc.Driver");
	      
	      connect = DriverManager.getConnection("jdbc:mysql://" + HOST + "/test?"
	              + "user=" + USER + "&password=" + PASSWD + "&useSSL=false");
	      
	      statement = connect.createStatement();
	      statement.executeUpdate("CREATE DATABASE test");

		  
	  }	
	 //Methods to create a table
	 public static void CreateTable() throws SQLException, ClassNotFoundException{
		  
		  
		  PreparedStatement ps = connect
		          .prepareStatement("CREATE TABLE Students NAME varchar(255) REFERRAL int");
		  ps.executeUpdate();
		  
		  ps = connect
		          .prepareStatement("CREATE TABLE Dates DATE varchar(255)");
		  ps.executeUpdate();
		  
		  
	  }
	 

	  

}
