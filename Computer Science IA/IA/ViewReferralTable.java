
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

	public class ViewReferralTable extends ViewData {
		
		static JPanel referralTable;
		static GridBagConstraints GB = new GridBagConstraints();
		
		
		public static void Table() throws ClassNotFoundException, SQLException{
			
		referralTable = new JPanel(new GridBagLayout());
			
		 
		 MyResult lists = MySQLAccess.theRefferalTable();
		 
		 //Adds lists to the array lists
		 ArrayList<String> columnNames = lists.getFirst();
	     ArrayList<Object> data = lists.getSecond();
	     
	     JLabel legend = new JLabel("1 = Present, 2 = Late, 3 = Excused, 4 = Absent");
	     JButton b5 = new JButton("Back");

			
	     Vector columnNamesVector = new Vector();
	     Vector dataVector = new Vector();

	     //Adds arraylists to vectors and creates columns
	     for (int i = 0; i < data.size(); i++)
	     {
	         ArrayList subArray = (ArrayList)data.get(i);
	         Vector subVector = new Vector();
	         for (int j = 0; j < subArray.size(); j++)
	         {
	             subVector.add(subArray.get(j));
	         }
	         dataVector.add(subVector);
	     }

	     for (int k = 0; k < columnNames.size(); k++ )
	         columnNamesVector.add(columnNames.get(k));
	     
	 
	     // Create table with database data    
	     JTable table = new JTable(dataVector, columnNamesVector);
	    

	     JScrollPane scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	     table.setFillsViewportHeight(true);
	     table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	     table.setPreferredScrollableViewportSize(table.getPreferredSize());


	     //Legend Component
	     	GB.gridx=4;
	     	GB.gridy=6;
	     	referralTable.add(legend,GB);
	    
	     //Back
			GB.gridx=4;
			GB.gridy=5;
			GB.insets = new Insets(10,10,10,10);
	    		     
		//Adds features to the table which is put into a scroll pane
		referralTable.add(b5,GB);
		referralTable.add(scroll);
		 
		referralTable.setBackground(new Color(204, 255, 255));
		GB.gridx=1;
		GB.gridy=1;
		frame.add(referralTable,GB);
	     
	     //Back Listener
	     b5.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e)
		        {
		        	referralTable.setVisible(false);
		        	viewPanel.setVisible(true);
		        }
		    }); 
			}

	

}
