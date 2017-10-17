//Duncan Rowe 12/14/16, class that asks for which student to view
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

public class ViewSpecificScreen extends ViewData{
	
	//Variables
	static JPanel viewSpecificPanel;
	static JComboBox comboName;
	static String studentName;


	public static void ViewSpecificScreens() throws Exception{
		
		//Creates specific panel
		viewSpecificPanel = new JPanel(new GridBagLayout());
		GridBagConstraints GB = new GridBagConstraints();
		comboName = new JComboBox<String>();
		JLabel name = new JLabel("Students Name");
		JButton b1 = new JButton("Enter Name");
		JButton b5 = new JButton("Back");

		
		//Name
		GB.gridx=0;
		GB.gridy=1;
		viewSpecificPanel.add(name,GB);
		
		//Name combobox listener
		comboName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboName.getSelectedItem();
            	studentName = contents.toString();
            	
            }
        });
		
		ArrayList<String> names = MySQLAccess.studentAttendanceSQL();
    	
		//Adds information to combobox
    	for(String x : names){
    		comboName.addItem(x);
    	}
    	
    	GB.gridx=1;
    	GB.gridy=1;
		GB.insets = new Insets(10,10,10,10);
		
		viewSpecificPanel.add(comboName,GB);
		
		//Button 1
		GB.gridx=1;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		viewSpecificPanel.add(b1, GB);
		
		//Button 5
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		viewSpecificPanel.add(b5, GB);
		
		viewSpecificPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(viewSpecificPanel,GB);
		
		//Listener for the name 
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	viewSpecificPanel.setVisible(false);
            	try {
					ViewSpecific.ViewSpecifics(studentName);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            }
        });      
		//Back Listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	viewSpecificPanel.setVisible(false);
	        	buttonPanel.setVisible(true);
	        }
	    }); 
		
		
		
	}
}
