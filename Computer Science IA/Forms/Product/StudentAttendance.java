//Duncan Rowe 12/14/16, class that sets attendance for students
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
 

public class StudentAttendance extends NewAttendance {
	
	//Variables
	static JComboBox studentCombo;
	static JPanel attendancePanel;
	private static String name;
	
	public static void Viewer() throws Exception{
		
		//Attendance Panel 
		attendancePanel = new JPanel(new GridBagLayout());
		GridBagConstraints GB = new GridBagConstraints();
		JButton b1 = new JButton("Present");
		JButton b2 = new JButton("Late");
		JButton b3 = new JButton("Excused");
		JButton b4 = new JButton("Absent");
		JButton b5 = new JButton("Finished");
		JButton b6 = new JButton("Back");

		//Adds combobox
		studentCombo = new JComboBox<String>();
    	
		ArrayList<String> names = MySQLAccess.studentAttendanceSQL();
    	
		//Adds names to the combobox
    	for(String x : names){
    		studentCombo.addItem(x);
    	}
    	
		GB.gridx=1;
		GB.gridy=1;
		GB.insets = new Insets(10,10,10,10);
		
		attendancePanel.add(studentCombo,GB);
    	
		//Button 1
		GB.gridx=0;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b1, GB);
		
		//Button 2
		GB.gridx=0;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b2, GB);
		
		//Button 3
		GB.gridx=2;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b3, GB);
		
		//Button 4
		GB.gridx=2;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b4, GB);
		
		//Button 5
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b5, GB);
		
		//Button 6
		GB.gridx=5;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b6, GB);
		
		attendancePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(attendancePanel,GB);
		
		
		//Present Listener
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	String date = NewAttendance.getDate();
            	try {
            		
            		Object contents = studentCombo.getSelectedItem();
            		setName(contents.toString());
					MySQLAccess.present(date, getName());
					if(studentCombo.getItemCount() == 1){
						CalculatingReferrals.Referrals();
						attendancePanel.setVisible(false);
			        	buttonPanel.setVisible(true);
					}
					studentCombo.removeItem(contents.toString());

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });      
	
		//Late Listener
		b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	String date = NewAttendance.getDate();
            	try {
            		Object contents = studentCombo.getSelectedItem();
            		setName(contents.toString());
					MySQLAccess.late(date, getName());
					if(studentCombo.getItemCount() == 1){
						CalculatingReferrals.Referrals();
						attendancePanel.setVisible(false);
			        	buttonPanel.setVisible(true);
					}
					studentCombo.removeItem(contents.toString());

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
	        }
	    });      
		//Excuses Listener
		b3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	Object contents = studentCombo.getSelectedItem();
	    		setName(contents.toString());
	        	
	    		if(studentCombo.getItemCount() == 1){
	        		Excuses.Excuse();
	    			try {
						CalculatingReferrals.Referrals();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	        		attendancePanel.setVisible(false);
				}
	    		else{
	    			Excuses.Excuse();
	    			attendancePanel.setVisible(false);
	    		}	        	
	        }
	    }); 
		//Absent Listener
		b4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	String date = NewAttendance.getDate();
            	try {
            		Object contents = studentCombo.getSelectedItem();
            		setName(contents.toString());
					MySQLAccess.absent(date, getName());
					
					if(studentCombo.getItemCount() == 1){
						CalculatingReferrals.Referrals();
						attendancePanel.setVisible(false);
			        	buttonPanel.setVisible(true);
					}
					
					studentCombo.removeItem(contents.toString());

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        }
	    }); 
		//Finished Listener
		b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	attendancePanel.setVisible(false);
            	buttonPanel.setVisible(true);
            	try {
	    			CalculatingReferrals.Referrals();
	    		} catch (ClassNotFoundException e2) {
	    			// TODO Auto-generated catch block
	    			e2.printStackTrace();
	    		} catch (SQLException e2) {
	    			// TODO Auto-generated catch block
	    			e2.printStackTrace();
	    		}
            }
        });      
	}
	
	//Getters and Setters for Name
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StudentAttendance.name = name;
	}
}