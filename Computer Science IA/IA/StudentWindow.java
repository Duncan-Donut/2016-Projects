//Duncan Rowe 12/14/16, class that holds options for modifying students

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

public class StudentWindow extends ModifyData{
	
	public static JPanel studentWindowPanel;
	public static GridBagConstraints GB;

	public static void StudentWindows() throws Exception{
		
		//Creates Student Panel 
		studentWindowPanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		JButton Add = new JButton("Add");
		JButton Delete = new JButton("Delete");
		JButton b5 = new JButton("Back");

		
		//Add
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=0;
		GB.gridy=2;
		studentWindowPanel.add(Add,GB);
		
		//Delete 
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=2;
		studentWindowPanel.add(Delete,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		studentWindowPanel.add(b5, GB);
		
		studentWindowPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(studentWindowPanel,GB);
		
		//Add listener
		Add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					AddStudent.AddStudents();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			studentWindowPanel.setVisible(false);
			}
		});
		//Delete Listener
		Delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					DeleteStudent.DeleteStudents();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			studentWindowPanel.setVisible(false);
			}
		});
		//Back Listener
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			studentWindowPanel.setVisible(false);
			modifyPanel.setVisible(true);
			}
		});
		
		
		
		
		
	}
}
