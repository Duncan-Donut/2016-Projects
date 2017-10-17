//Duncan Rowe 12/14/16, class that allows specific students to be viewed

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

public class ViewSpecific extends ViewSpecificScreen {
	
	//Variables
	static JPanel tablePanel;
	static GridBagConstraints GB = new GridBagConstraints();
	
	public static void ViewSpecifics(String name) throws ClassNotFoundException, SQLException{
		
	//Creates Panel
	tablePanel = new JPanel(new GridBagLayout());
		
	 
	 MyResult lists = MySQLAccess.SpecificTable(name);
	 
	 //Gets data and adds to arraylists
	 ArrayList<String> columnNames = lists.getFirst();
     ArrayList<Object> data = lists.getSecond();
    
     JLabel legend = new JLabel("1 = Present, 2 = Late, 3 = Excused, 4 = Absent");
     JButton b5 = new JButton("Back");

		
     Vector columnNamesVector = new Vector();
     Vector dataVector = new Vector();

     //Adds data to vectors 
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

     for (int k = 0; k < columnNames.size(); k++ ){
         columnNamesVector.add(columnNames.get(k));
     }
 
     //Creates table with the data
     JTable table = new JTable(dataVector,columnNamesVector);
    
     //Allows for additional features to be added to the table
     JScrollPane scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     table.setFillsViewportHeight(true);
     table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     table.setPreferredScrollableViewportSize(table.getPreferredSize());

     //Legend
  		GB.gridx=4;
  		GB.gridy=6;
  		tablePanel.add(legend,GB);
    
  	//Back
		GB.gridx=4;
		GB.gridy=5;
		GB.insets = new Insets(10,10,10,10);
     
	 tablePanel.add(b5,GB);
	 tablePanel.add(scroll);
	 
	 tablePanel.setBackground(new Color(204, 255, 255));
	 GB.gridx=1;
	 GB.gridy=1;
     frame.add(tablePanel,GB);
     
     //Back Listener
     b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	tablePanel.setVisible(false);
	        	viewPanel.setVisible(true);
	        }
	    }); 
		}

}

