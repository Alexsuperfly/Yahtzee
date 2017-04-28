//Bret Owens - bto14
//Alex Sumner - acs14k



import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Yahtzee extends JFrame{	//Setup for basic frame of game
	private JDesktopPane Pane;
	
	public Yahtzee()
	{
		JMenuBar menu = new JMenuBar();	//Creates menu for main frame
		JMenu add = new JMenu("Quit (Alt - q)");
		add.setMnemonic('q');
		JMenuItem item = new JMenuItem("Exit Program (Alt - x)");
		item.setMnemonic('x');
		
		add.add(item);
		menu.add(add);
		
		item.addActionListener(	//Action listener for quit
			new ActionListener() // anonymous inner class
		    {  
		      	 public void actionPerformed( ActionEvent event ) 
		         {
		       		 System.exit(0);
		    	 }				
		     });
		
		setJMenuBar(menu);
		Pane = new  JDesktopPane();	//Main pane for game
		
		setTitle("Yahtzee");
		Pane.setBackground(Color.white);
		getContentPane().add(Pane);
	}
	
	
	
}
