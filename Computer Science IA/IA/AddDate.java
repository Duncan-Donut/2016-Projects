// Duncan Rowe 12/14/16, allow user to add date
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDate extends ChangeDates {
	
	//Variables
	public static JPanel addDatePanel;
	public static GridBagConstraints GB;
	private static String dateName;
	static JComboBox comboDate;
	static JComboBox comboMonth;
	static JComboBox comboYear;
	public static String month;
	public static String day;
	public static String year;
	 
	//Methods
	public static void AddDate() throws Exception{
		
		
		//Creates Panel
		addDatePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		JLabel Date = new JLabel("Date and Month");
		comboDate = new JComboBox<String>();
		comboMonth = new JComboBox<String>();
		comboYear = new JComboBox<String>();
		JButton Add = new JButton("Add");
		JButton b5 = new JButton("Back");
		
		//Date
		GB.gridx=0;
		GB.gridy=0;
		addDatePanel.add(Date,GB);
		
		//Creates combobox listener
		comboDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboDate.getSelectedItem();
                day = contents.toString();
            	
            }
        });
		
    	
		//Adds days to Combo
    	for(int x = 1 ; x<=31;x++){
    		comboDate.addItem(x);
    	}
    	
    	GB.gridx=2;
    	GB.gridy=0;
    	GB.insets = new Insets(10,10,10,10);
		
		addDatePanel.add(comboDate,GB);
		
		//Creates month combobox listener
		comboMonth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboMonth.getSelectedItem();
                month = contents.toString();
            	
            }
        });
    	
		//Adds months to the combobox
    	for(int x = 1 ; x<=12;x++){
    		comboMonth.addItem(x);
    	}

    	GB.gridx=1;
    	GB.gridy=0;
    	GB.insets = new Insets(10,10,10,10);
		
		addDatePanel.add(comboMonth,GB);
		
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
				    GB.gridy=0;
				    GB.insets = new Insets(10,10,10,10);
					
					addDatePanel.add(comboYear,GB);
		
		//Add
		GB.insets = new Insets(10,10,10,10);	
		GB.gridx=1;
		GB.gridy=1;
		addDatePanel.add(Add,GB);
		
		//Back button
		GB.gridx=4;
		GB.gridy=4;
		GB.insets = new Insets(10,10,10,10);
		addDatePanel.add(b5, GB);
		
		addDatePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(addDatePanel,GB);
		
		//Creates a listener for the add button
		Add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			try {
				//Combines inputs
				String input = month + "/" + day;
				
				//Checks if the date is already inputted
				if(MySQLAccess.Checker(input) == false ){
					MySQLAccess.newAttendanceSQL(day,month,year);
					addDatePanel.setVisible(false);
					modifyPanel.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(frame, "Date already used");
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			}
		});
		
		//The back listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	addDatePanel.setVisible(false);
	        	datePanel.setVisible(true);
	        	
	        }
	    }); 
	
		
	}
}
