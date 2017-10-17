//Duncan Rowe 12/14/16, class for deleting dates
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

public class DeleteDate extends ChangeDates {
	
	//Variables
	public static JPanel deleteDatePanel;
	public static GridBagConstraints GB;
	static JComboBox comboDate;
	private static String dateName;
	 
	public static void DeleteDate() throws Exception{
		
		comboDate = new JComboBox<String>();
		JLabel Date = new JLabel("Date");
		JButton Delete = new JButton("Delete");
		JButton b5 = new JButton("Back");

		
		//Creates Panel
		deleteDatePanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		
		//Date combobox listener
		comboDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Object contents = comboDate.getSelectedItem();
            	if(contents == null){
            		deleteDatePanel.setVisible(false);
					modifyPanel.setVisible(true);		
            	}
            	else{
            		dateName = contents.toString();
            	}
            	
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
		
		deleteDatePanel.add(comboDate,GB);
		
		//Date
		GB.gridx=0;
		GB.gridy=1;
		deleteDatePanel.add(Date,GB);
		
		//Delete
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=2;
		deleteDatePanel.add(Delete,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		deleteDatePanel.add(b5, GB);
		
		deleteDatePanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(deleteDatePanel,GB);
		
		
		//Delete Listener
		Delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			try {
				MySQLAccess.deleteDate(dateName);
				if(comboDate.getItemCount() == 0){
					deleteDatePanel.setVisible(false);
					modifyPanel.setVisible(true);		
				}
				Object contents = comboDate.getSelectedItem();
				comboDate.removeItem(contents.toString());
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
	        	deleteDatePanel.setVisible(false);
	        	modifyPanel.setVisible(true);
	        	
	        }
	    }); 
		
		
	}
}
