//Duncan Rowe 12/14/16, class for changing excuses when the user initially takes attendance
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

public class Excuses extends StudentAttendance{

	//Variables
	public static JPanel excusePanel;
	public static GridBagConstraints GB;
	
		
	public static void Excuse(){	
		
		
		//Creates Excuse panel		
		excusePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		JLabel name = new JLabel("What is the excuse?");
		JTextField namefield = new JTextField(20);
		JButton confirm = new JButton("Confirm");
		JButton b5 = new JButton("Back");

	
		//Name
		GB.gridx=0;
		GB.gridy=1;
		excusePanel.add(name,GB);
		
		//Namefield
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=1;
		excusePanel.add(namefield,GB);
		
		//Confirm
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
				
				String date = NewAttendance.getDate();
				String name = StudentAttendance.getName();
				String excuse = namefield.getText();
				
				
				//Removes items after selected 
				Object contents = studentCombo.getSelectedItem();
				studentCombo.removeItem(contents.toString());
				
				try {
					//Filter for input
					if(excuse.matches("[A-Z a-z]+")){
						MySQLAccess.excused(date,name,excuse);
						excusePanel.setVisible(false);
						attendancePanel.setVisible(true);
						
						if(studentCombo.getItemCount() == 0){
							attendancePanel.setVisible(false);
							buttonPanel.setVisible(true);
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
	        	excusePanel.setVisible(false);
	        	attendancePanel.setVisible(true);
	        	
	        }
	    }); 
	}
	
}
