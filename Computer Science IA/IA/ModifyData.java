//Duncan Rowe 12/14/16, class that holds options for users to modify data

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModifyData extends Title {

	//Variables
	public static JPanel modifyPanel;

	public static void Modify(){
		
		//Creates the modify panel
		modifyPanel = new JPanel(new GridBagLayout());
		GridBagConstraints GB = new GridBagConstraints();
		JButton b1 = new JButton("Add/Remove Students");
		JButton b2 = new JButton("Update Excuses");
		JButton b3 = new JButton("Add/Remove Dates");
		JButton b4 = new JButton("Change Attendance");
		JButton b5 = new JButton("Back");
		JButton b6 = new JButton("Change Referral");


		
		//Button 1
		GB.gridx=0;
		GB.gridy=2;
		modifyPanel.add(b1, GB);
		
		//Button 2
		GB.gridx=0;
		GB.gridy=3;
		modifyPanel.add(b2, GB);
		
		//Button 3
		GB.gridx=1;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		modifyPanel.add(b3, GB);
		
		//Button 4
		GB.gridx=2;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		modifyPanel.add(b4, GB);
		
		//Button 5
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
		modifyPanel.add(b5, GB);
		
		//Button 6
		GB.gridx=2;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		modifyPanel.add(b6, GB);
		
		//Icon
		ImageIcon image = new ImageIcon("Setting.png");
		JLabel label = new JLabel(image);
		
		GB.gridx=1;
		GB.gridy=1;
		modifyPanel.add(label,GB);
		
		
		modifyPanel.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(modifyPanel,GB);
		
		//Add or Remove Student Listener
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	modifyPanel.setVisible(false);
            	try {
					StudentWindow.StudentWindows();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            }
        });      
	
		//Change Excuses Listener
		b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	modifyPanel.setVisible(false);
	        	try {
					UpdateExcuses.ChangeE();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        }
	    });      
		//Change Dates Listener
		b3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	modifyPanel.setVisible(false);
	        	try {
					ChangeDates.ChangeD();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	    }); 
		//Change Attendance Listener
		b4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	modifyPanel.setVisible(false);
	        	try {
					ChangeAttendance.ChangeA();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	    }); 
		//Back Listener
		b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	modifyPanel.setVisible(false);
	        	buttonPanel.setVisible(true);
	        }
	    }); 
		//Change Referrals Listener
		b6.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	modifyPanel.setVisible(false);
	        	try {
					ChangeReferrals.ChangeR();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	    }); 
		
	}

}
