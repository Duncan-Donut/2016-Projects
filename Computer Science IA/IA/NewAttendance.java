//Duncan Rowe 12/14/16, class that puts dates for new attendance
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewAttendance extends Title {
	
	//Variables
	public static JPanel attendancePanel;
	public static GridBagConstraints GB;
	static JComboBox comboDate;
	static JComboBox comboMonth;
	static JComboBox comboYear;
	public static String month;
	public static String day;
	private static String date;
	private static String year;

	public static void Attendance(){
		
		//Creates Attendance Panel
		attendancePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		comboDate = new JComboBox<String>();
		comboMonth = new JComboBox<String>();
		comboYear = new JComboBox<String>();
		JLabel date = new JLabel("What is the date? (Month/Day/Year)");
		JButton confirm = new JButton("Confirm");
		JButton b5 = new JButton("Back");


		//Date
		GB.gridx=0;
		GB.gridy=1;
		attendancePanel.add(date,GB);
		
		//Date combobox listener
		comboDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboDate.getSelectedItem();
                day = contents.toString();
            	
            }
        });
		
		//Adds dates to combobox
    	for(int x = 1 ; x<=31;x++){
    		comboDate.addItem(x);
    	}
    	
    	GB.gridx=2;
    	GB.gridy=1;
    	GB.insets = new Insets(10,10,10,10);
		
		attendancePanel.add(comboDate,GB);
		
		//Month combobox listener
		comboMonth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboMonth.getSelectedItem();
                month = contents.toString();
            	
            }
        });
    	
		//Adds months to combobox
    	for(int x = 1 ; x<=12;x++){
    		comboMonth.addItem(x);
    	}

    	GB.gridx=1;
    	GB.gridy=1;
    	GB.insets = new Insets(10,10,10,10);
		
		attendancePanel.add(comboMonth,GB);
		
		//Year combobox listener
		comboYear.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e)
	            {
	            	Object contents = comboYear.getSelectedItem();
		            year = contents.toString();
		           	
		        }
		        });
		    	
		//Adds years to combobox
		    	
		    comboYear.addItem(2016);
		    comboYear.addItem(2017);

		    GB.gridx=3;
		    GB.gridy=1;
		    GB.insets = new Insets(10,10,10,10);
			
		attendancePanel.add(comboYear,GB);
		
		//Confirm
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=4;
		attendancePanel.add(confirm,GB);
		
		//Back
		GB.gridx=3;
		GB.gridy=4;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(b5, GB);
		
		//Icon
		ImageIcon image = new ImageIcon("Student.png");
		JLabel label = new JLabel(image);
		
		GB.gridx=1;
		GB.gridy=0;
		GB.insets = new Insets(10,10,10,10);
		attendancePanel.add(label,GB);
		
		
		attendancePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(attendancePanel,GB);
		
		//Confirm listener
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			try {
				
				String input = month + "/" + day + "/" + year;
				
				//Checks if date is already used
				if(MySQLAccess.Checker(input) == false){
					setDate(input);
					MySQLAccess.newAttendanceSQL(day,month,year);
					buttonPanel.setVisible(false);
					attendancePanel.setVisible(false);
					try {
						StudentAttendance.Viewer();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else{
					JOptionPane.showMessageDialog(frame, "Date already used");
				}
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
			}
		});
		//Back Listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	attendancePanel.setVisible(false);
	        	buttonPanel.setVisible(true);
	        }
	    }); 
		
		
	}
	
	//Get and Set Methods for Date
	public static String getDate() {
		return date;
	}

	public static void setDate(String date) {
		NewAttendance.date = date;
	}
	
	

}
