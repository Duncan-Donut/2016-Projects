// Duncan Rowe 12/14/16, allow user to add students
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

public class AddStudent extends StudentWindow{
	
	//Variables
	public static JPanel studentAddPanel;
	public static GridBagConstraints GB;

	public static void AddStudents() throws Exception{
		
		//Creates Panel
		studentAddPanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		JLabel name = new JLabel("Students Name");
		JTextField nameField = new JTextField(20);
		JButton Add = new JButton("Add");
		JButton b5 = new JButton("Back");

		
		//Name
		GB.gridx=0;
		GB.gridy=1;
		studentAddPanel.add(name,GB);
		
		//Namefield
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=1;
		studentAddPanel.add(nameField,GB);
		
		//Add
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=2;
		studentAddPanel.add(Add,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		studentAddPanel.add(b5, GB);
		
		studentAddPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(studentAddPanel,GB);
		
		//Add button listener
		Add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			try {
				//Filter for adding names
				if(nameField.getText().matches("[A-Z a-z]+")){
					MySQLAccess.addName(nameField.getText());
					studentAddPanel.setVisible(false);
					studentWindowPanel.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(frame, "Name has an invalid character");
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
		
		//Back button listener
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				studentAddPanel.setVisible(false);
			studentWindowPanel.setVisible(true);
			}
		});
		
		
		
		
		
	}
}
