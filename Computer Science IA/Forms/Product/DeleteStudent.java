//Duncan Rowe 12/14/16, class for deleting students
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

public class DeleteStudent extends StudentWindow{
	
	//Variables
	public static JPanel studentPanel;
	public static GridBagConstraints GB;
	static JComboBox comboName;
	private static String studentName;

	public static void DeleteStudents() throws Exception{
		
		//Creates new Panel
		studentPanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		comboName = new JComboBox<String>();
		JLabel name = new JLabel("Students Name");
		JButton Delete = new JButton("Delete");
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
    	GB.gridy=1;
    	GB.insets = new Insets(10,10,10,10);
		
		studentPanel.add(comboName,GB);
		
		//Name
		GB.gridx=0;
		GB.gridy=1;
		studentPanel.add(name,GB);
		
		//Delete
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=2;
		studentPanel.add(Delete,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		studentPanel.add(b5, GB);
		
		studentPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(studentPanel,GB);
		
		//Delete listener
		Delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			try {
				MySQLAccess.deleteName(studentName);
				if(comboName.getItemCount() == 0){
					studentPanel.setVisible(false);
					studentWindowPanel.setVisible(true);		
				}
				Object contents = comboName.getSelectedItem();
				comboName.removeItem(contents.toString());
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			}
		});
		//Back listener
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			studentPanel.setVisible(false);
			studentWindowPanel.setVisible(true);
			}
		});
		
		
		
		
		
	}
}
