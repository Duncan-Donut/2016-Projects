//Duncan Rowe 12/14/16, main class that holds all options

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;


public class Title extends CalculatingReferrals {

	//Variables
	public static JFrame frame;
	
	public static JPanel buttonPanel;
	public static JPanel bannerPanel;

	public static ArrayList<String> Dates = new ArrayList<String>();

	//Main Method that initiates GUI's
	public static void Title(){
		Frame();
		GUI();
	}
  
	//Creates Frame
	public static void Frame(){
		
		GridBagConstraints GB = new GridBagConstraints();
		
		frame = new JFrame ("Main");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500,1000);
		ImageIcon img = new ImageIcon("Viking.jpg");
		frame.setIconImage(img.getImage());
		frame.setLayout(new GridBagLayout());
		frame.getContentPane().setBackground(new Color(204,255,255));
		
	}
	
	//Creates GUI
	public static void GUI (){
		
		//Creatse Button Panel
		buttonPanel = new JPanel(new GridBagLayout());
		GridBagConstraints GB = new GridBagConstraints();
		
		JButton b1 = new JButton("Modify Data");
		JButton b2 = new JButton("Take New Attendance");
		JButton b3 = new JButton("Choose to View Data");
		JButton b4 = new JButton("Exit");
		
		//Button one
		GB.gridx=0;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		buttonPanel.add(b1, GB);
		
		//Button Two
		GB.gridx=1;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		buttonPanel.add(b2, GB);
		

		//Button Three
		GB.gridx=2;
		GB.gridy=2;
		GB.insets = new Insets(10,10,10,10);
		buttonPanel.add(b3, GB);
		
		//Button Four
		GB.gridx=1;
		GB.gridy=3;
		GB.insets = new Insets(10,10,10,10);
		buttonPanel.add(b4, GB);
		
		//Icon
		ImageIcon image = new ImageIcon("Capital.png");
		JLabel label = new JLabel(image);
		
		GB.gridx=1;
		GB.gridy=1;
		buttonPanel.add(label,GB);
		
		//Panel
		GB.gridx=1;
		GB.gridy=1;
		buttonPanel.setBackground(new Color(204, 255, 255));
		frame.add(buttonPanel,GB);
		
		bannerPanel = new JPanel(new GridBagLayout());

		//Icon
		ImageIcon govimage = new ImageIcon("WebBanner.png");
		JLabel upperLabel = new JLabel(govimage);
		GB.gridx=1;
		GB.gridy=0;
		frame.add(upperLabel,GB);
		
		frame.setVisible(true);


		//Listener for Modify data
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	buttonPanel.setVisible(false);
            	ModifyData.Modify();
            	
            }
        });      
	
		//Listener for attendance
		b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	buttonPanel.setVisible(false);
	        	NewAttendance.Attendance();
	        	
	        }
	    });      
		//Listener for View Data
		b3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	buttonPanel.setVisible(false);
	        	ViewData.Data();
	        }
	    }); 
		b4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	System.exit(0);
	        }
	    }); 
		
	}

}
