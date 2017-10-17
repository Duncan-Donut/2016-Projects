// Duncan Rowe 12/14/16, class for changing excuses
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeExcuses extends ChangeAttendance{
	
	//Variables
	public static JPanel excusePanel;
	public static GridBagConstraints GB;
	
	
	public static void ExcuseRe(String thedate, String thename){	
		
		//Local Variables
		String date = thedate;
		String name = thename;
	
		//Creates Panel
		excusePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		JLabel labelName = new JLabel("What is the excuse?");
		JTextField namefield = new JTextField(20);
		JButton confirm = new JButton("Confirm");
		JButton b5 = new JButton("Back");

		//LabelName
		GB.gridx=0;
		GB.gridy=1;
		excusePanel.add(labelName,GB);
		
		//Namefield
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=1;
		excusePanel.add(namefield,GB);
		
		//Confirms
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=5;
		excusePanel.add(confirm,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		excusePanel.add(b5, GB);
		
		excusePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(excusePanel,GB);
		
		//Confirm listener 
		confirm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				try {
					//Filter for Excuses field
					String excuse = namefield.getText();
					
					if(excuse.matches("[A-Z a-z]+")){
						MySQLAccess.excused(date,name,excuse);
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
				excusePanel.setVisible(false);
				changePanel.setVisible(true);
			}
		});
		//Back Listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	excusePanel.setVisible(false);
	        	changePanel.setVisible(true);
	        	
	        }
	    }); 
	}
}