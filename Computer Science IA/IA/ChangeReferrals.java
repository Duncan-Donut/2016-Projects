//Duncan Rowe 12/14/16, class for changing the referrals 
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

public class ChangeReferrals extends ModifyData {
	
	//Variables
	public static JPanel referralPanel;
	public static GridBagConstraints GB;
	static JComboBox comboName;
    static JComboBox comboReferral;
    private static String studentName;
    private static String referralName;

	public static void ChangeR() throws Exception{
		
		//Creates Panel
		referralPanel =  new JPanel(new GridBagLayout());
		GB = new GridBagConstraints(); 
		comboName = new JComboBox<String>();
		comboReferral = new JComboBox<String>();
		JLabel name = new JLabel("Students Name");
		JLabel referral = new JLabel("Referral");
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
    	
    	//Adds the names
    	for(String x : names){
    		comboName.addItem(x);
    	}
    	
    	GB.gridx=1;
    	GB.gridy=0;
    	GB.insets = new Insets(10,10,10,10);
		
		referralPanel.add(comboName,GB);
		
		//Name
		GB.gridx=0;
		GB.gridy=0;
		referralPanel.add(name,GB);
		
		//Referral
		GB.gridx=0;
		GB.gridy=2;
		referralPanel.add(referral,GB);

		//Referral combobox listener
		comboReferral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            	Object contents = comboReferral.getSelectedItem();
            	referralName = contents.toString();            	
            }
        });
    	
		comboReferral.addItem(0);
		comboReferral.addItem(1);
		comboReferral.addItem(2);
		
		GB.gridx=1;
    	GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		referralPanel.add(comboReferral,GB);
		
		//Update
		GB.insets = new Insets(10,10,10,10);
		GB.gridx=1;
		GB.gridy=3;
		referralPanel.add(Update,GB);
		
		//Back
		GB.gridx=4;
		GB.gridy=4;
		GB.insets = new Insets(10,10,10,10);
		referralPanel.add(b5, GB);
		
		referralPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(referralPanel,GB);
	
		//Update listener
		Update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
		
			try {
			      	MySQLAccess.changeReferral(studentName,referralName);
			      	referralPanel.setVisible(false);
					modifyPanel.setVisible(true);
				
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
	        	referralPanel.setVisible(false);
				modifyPanel.setVisible(true);
	        	
	        }
	    }); 
		
		
		
	}
}
