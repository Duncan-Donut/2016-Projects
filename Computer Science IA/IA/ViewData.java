//Duncan Rowe 12/14/16, class that holds options for viewing students

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewData extends Title{
	
	//Variables
	static JPanel viewPanel;

	public static void Data(){
		
		//Creates Panel
		viewPanel = new JPanel(new GridBagLayout());
		GridBagConstraints GB = new GridBagConstraints();
		JButton b1 = new JButton("View all Students");
		JButton b2 = new JButton("View Referral Students");
		JButton b4 = new JButton("View Specific Students");
		JButton b5 = new JButton("Back");

		
		//Button 1
		GB.gridx=0;
		GB.gridy=1;
		GB.insets = new Insets(10,10,10,10);
		viewPanel.add(b1, GB);
		
		//Button 2
		GB.gridx=0;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		viewPanel.add(b2, GB);
		
		//Button 4
		GB.gridx=0;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		viewPanel.add(b4, GB);
		
		//Button 5
		GB.gridx=4;
		GB.gridy=4;
		GB.insets = new Insets(10,10,10,10);
		viewPanel.add(b5, GB);

		ImageIcon image = new ImageIcon("Table.png");
		JLabel label = new JLabel(image);
		
		GB.gridx=0;
		GB.gridy=0;
		GB.insets = new Insets(10,10,10,10);
		viewPanel.add(label,GB);
		
		viewPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(viewPanel,GB);
		
		//Listener to view all
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	viewPanel.setVisible(false);
            	try {
					ViewTable.Table();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            }
        });      
	
		//Listener to view students with referrals
		b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	viewPanel.setVisible(false);
	        	try {
					ViewReferralTable.Table();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        }
	    });      
		
		//Listener to view specific
		b4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	viewPanel.setVisible(false);
				try {
					ViewSpecificScreen.ViewSpecificScreens();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	    }); 
		
		//Back listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	viewPanel.setVisible(false);
	        	buttonPanel.setVisible(true);
	        }
	    }); 
		
		
	}
}
