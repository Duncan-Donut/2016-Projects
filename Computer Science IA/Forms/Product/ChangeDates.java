// Duncan Rowe 12/14/16, intermediate panel for changing the dates
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

public class ChangeDates extends ModifyData {
	
	//Variables
	public static JPanel datePanel;
	public static GridBagConstraints GB;
	private static String dateName;
	 
	public static void ChangeD() throws Exception{
		
		//Creates Panel
		datePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		JButton Add = new JButton("Add");
		JButton Delete = new JButton("Delete");
		JButton b5 = new JButton("Back");

		
		//Add
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=0;
		GB.gridy=2;
		datePanel.add(Add,GB);
		
		//Delete
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=2;
		datePanel.add(Delete,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		datePanel.add(b5, GB);
		
		datePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=2;
		frame.add(datePanel,GB);
		
		//Listener for add
		Add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			try {
				AddDate.AddDate();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			datePanel.setVisible(false);
			}
		});
		//Listener for delete
		Delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			
				try {
					DeleteDate.DeleteDate();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			datePanel.setVisible(false);
			}
		});
		//Back listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	datePanel.setVisible(false);
	        	modifyPanel.setVisible(true);
	        	
	        }
	    }); 
		
		
	}
}
