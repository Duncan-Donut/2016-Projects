// Duncan Rowe 12/14/16, allows the user to modify the attendance 
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeAttendance extends ModifyData {
	

	//Variables
	public static JPanel changePanel;
	public static GridBagConstraints GB;
	static String thedate;
    static String thename;
    static JComboBox comboName;
    static JComboBox comboDate;
    private static String studentName;
    private static String dateName;
 
	public static void ChangeA() throws Exception{
		
		//Creates the Panel	
		changePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		comboName = new JComboBox<String>();
		comboDate = new JComboBox<String>();
		JLabel Date = new JLabel("Date");
		JLabel name = new JLabel("Students Name");
		JButton b1 = new JButton("Present");
		JButton b2 = new JButton("Late");
		JButton b3 = new JButton("Excused");
		JButton b4 = new JButton("Absent");
		JButton b5 = new JButton("Back");
		
		
		
    	ArrayList<String> names = MySQLAccess.studentAttendanceSQL();
    	
    	//Adds the names to the combobox 
    	for(String x : names){
    		comboName.addItem(x);
    	}
    	
    	GB.gridx=1;
    	GB.gridy=2;
    	GB.insets = new Insets(10,10,10,10);
		
		changePanel.add(comboName,GB);
 

    	ArrayList<String> Dates = MySQLAccess.getDates();
    	
    	//Adds the dates to the combobox
    	for(String x : Dates){
    		comboDate.addItem(x);
    	}
    	
    	GB.gridx=1;
    	GB.gridy=1;
    	GB.insets = new Insets(10,10,10,10);
		
		changePanel.add(comboDate,GB);
		
		//Date
		GB.gridx=0;
		GB.gridy=1;
		changePanel.add(Date,GB);
	
		//Name
		GB.gridx=0;
		GB.gridy=2;
		changePanel.add(name,GB);
		
		//Present
		GB.gridx=0;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		changePanel.add(b1, GB);
		
		//Late
		GB.gridx=1;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		changePanel.add(b2, GB);
		
		//Excused
		GB.gridx=0;
		GB.gridy=4;
		GB.insets = new Insets(10,10,10,10);
		changePanel.add(b3, GB);
		
		//Absent
		GB.gridx=1;
		GB.gridy=4;
		GB.insets = new Insets(10,10,10,10);
		changePanel.add(b4, GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		changePanel.add(b5, GB);
		
		changePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(changePanel,GB);
		
		//Listener for making a user present
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	
            	try {
            		Object contents = comboName.getSelectedItem();
            		setStudentName(contents.toString());
            		contents = comboDate.getSelectedItem();
            		setDateName(contents.toString());

					MySQLAccess.present(getDateName(),getStudentName());
					
					if(comboName.getItemCount() == 0){
						changePanel.setVisible(false);
			        	buttonPanel.setVisible(true);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });      
		//Listener for making the user late 
		b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	     
            	try {
            		
            		Object contents = comboName.getSelectedItem();
            		setStudentName(contents.toString());
            		contents = comboDate.getSelectedItem();
            		setDateName(contents.toString());
            		MySQLAccess.late(getDateName(),getStudentName());
					
            		if(comboName.getItemCount() == 0){
						changePanel.setVisible(false);
			        	buttonPanel.setVisible(true);
					}
	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
	        }
	    });      
		//Listener for making the users excuses
		b3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	Object contents = comboName.getSelectedItem();
        		setStudentName(contents.toString());
        		contents = comboDate.getSelectedItem();
        		setDateName(contents.toString());
	    		changePanel.setVisible(false);
	    		ChangeExcuses.ExcuseRe(getDateName(),getStudentName());
	    		
				if(comboName.getItemCount() == 0){
					changePanel.setVisible(false);
		        	buttonPanel.setVisible(true);
				}
	        }
	    }); 
		//Listener for making the user absent
		b4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
            	try {
            		setStudentName(thename);
            		setDateName(dateName);
            		MySQLAccess.absent(getDateName(),getStudentName());
					if(comboName.getItemCount() == 0){
						changePanel.setVisible(false);
			        	buttonPanel.setVisible(true);
					}

	
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        }
	    }); 
		//Back listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	changePanel.setVisible(false);
				modifyPanel.setVisible(true);
	        	
	        }
	    }); 
		
	}
	public static String getStudentName() {
		return studentName;
	}

	public static void setStudentName(String studentName) {
		ChangeAttendance.studentName = studentName;
	}

	public static String getDateName() {
		return dateName;
	}

	public static void setDateName(String dateName) {
		ChangeAttendance.dateName = dateName;
	}
	

}
