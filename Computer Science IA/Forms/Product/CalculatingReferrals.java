// Duncan Rowe 12/14/16, calculates the referrals

import java.sql.SQLException;
import java.util.ArrayList;

public class CalculatingReferrals extends MySQLAccess {
	
	
	public static void Referrals() throws ClassNotFoundException, SQLException{
		
		
		//Creates 3 ArrayLists
		
		ArrayList<String> date = MySQLAccess.getDates();
		
		ArrayList<String> name = MySQLAccess.studentAttendanceSQL();
		ArrayList<Integer> attendance = new ArrayList<Integer>();
		
		//Runs through each name and then each date
		for(String n:name){
			int count = 0;
			
			for(String d:date){
				attendance.add(MySQLAccess.decideReferral(d,n));
			}
				for(int x = 0; x < attendance.size();x++){
					if(attendance.get(x) == 1){
						count++;
					}
				}
				//Checks if attendance is 70% otherwise it checks the last two meetings
				if(((double) (count / (attendance.size()))) <= .7){
					
					int check = MySQLAccess.ReferralCheck(n);
					
					if(check == 1){
						MySQLAccess.setReferral(n);
						break;
					}
					if(check == 0){
						MySQLAccess.setWatch(n);
						break;
					}
				}
				else{
					if(attendance.size() >= 2){

						int first = attendance.get(attendance.size()-1);
						int second = attendance.get(attendance.size()-2);
					
						if((first != 1) && (second != 1)){
							
							int check = MySQLAccess.ReferralCheck(n);
							
							if(check == 1){
								MySQLAccess.setReferral(n);
								break;
							}
							if(check == 0){
								MySQLAccess.setWatch(n);
								break;
							}
						}
						
					}
				}
			//Clears list 
			attendance.clear();	
			}
		
		}
}
