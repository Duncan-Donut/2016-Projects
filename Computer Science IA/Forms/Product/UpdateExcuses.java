//Duncan Rowe 12/14/16, class that is used to update excuses when modifying

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

public class UpdateExcuses extends ModifyData {
	//Variables
	public static JPanel changeExcusesPanel;
	public static GridBagConstraints GB;
	static JComboBox comboName;
    static JComboBox comboDate;
    private static String studentName;
    private static String dateName;

	public static void ChangeE() throws Exception{
		
		//Creates new Panel
		changeExcusesPanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		comboName = new JComboBox<String>();
		comboDate = new JComboBox<String>();
		JLabel Date = new JLabel("Date");
		JLabel name = new JLabel("Students Name");
		JLabel excuse = new JLabel("Excuse");
		JTextField excuseField = new JTextField(20);
		JButton Update = new JButton("Update");
		JButton b5 = new JButton("Back");

		
		//Name combobox listener
		comboName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboName.getSelectedItem();
                studentName = contents.toString();            	
            }
        });

    	ArrayList<String> names = MySQLAccess.studentAttendanceSQL();
    	
    	//Adds names to combobox
    	for(String x : names){
    		comboName.addItem(x);
    	}
    	
    	GB.gridx=1;
    	GB.gridy=2;
    	GB.insets = new Insets(10,10,10,10);
		
		changeExcusesPanel.add(comboName,GB);
		
		//Date combobox listener
		comboDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	Object contents = comboDate.getSelectedItem();
            	dateName = contents.toString();            	
            }
        });
		
		ArrayList<String> Dates = MySQLAccess.getDates();
    	
		//Adds dates to combobox
    	for(String x : Dates){
    		comboDate.addItem(x);
    	}
    	
    	GB.gridx=1;
    	GB.gridy=1;
    	GB.insets = new Insets(10,10,10,10);
		
		changeExcusesPanel.add(comboDate,GB);
		
		//Date
		GB.gridx=0;
		GB.gridy=1;
		changeExcusesPanel.add(Date,GB);
		
		//Name
		GB.gridx=0;
		GB.gridy=2;
		changeExcusesPanel.add(name,GB);
		
		//Excuse
		GB.gridx=0;
		GB.gridy=3;
		changeExcusesPanel.add(excuse,GB);
		
		//Excusefield
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=3;
		changeExcusesPanel.add(excuseField,GB);
		
		//Update
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=4;
		changeExcusesPanel.add(Update,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		changeExcusesPanel.add(b5, GB);
		
		changeExcusesPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(changeExcusesPanel,GB);
	
		// Update LIstener
		Update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String input = excuseField.getText();
		
			try {	
				//Filter for input
				if(input.matches("[A-Z a-z]+")){
						MySQLAccess.EUpdate(dateName,studentName,input);
						if(comboName.getItemCount() == 0){
							changeExcusesPanel.setVisible(false);
							modifyPanel.setVisible(true);
						}
				}
						
				else{
					JOptionPane.showMessageDialog(frame, "Name has an invalid character");
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
		//Back Listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	changeExcusesPanel.setVisible(false);
				modifyPanel.setVisible(true);
	        	
	        }
	    }); 
		
		
		
	}
}
