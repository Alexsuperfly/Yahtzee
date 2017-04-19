import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

public class Yahtzee extends JFrame{
	private JDesktopPane Pane;
	
	public Yahtzee()
	{
		JMenuBar menu = new JMenuBar();
		JMenu add = new JMenu("Quit (Alt - q)");
		add.setMnemonic('q');
		JMenuItem item = new JMenuItem("Exit Program (Alt - x)");
		item.setMnemonic('x');
		
		add.add(item);
		menu.add(add);
		
		item.addActionListener(
			new ActionListener() // anonymous inner class
		    {  
		      	 public void actionPerformed( ActionEvent event ) 
		         {
		       		 System.exit(0);
		    	 }				
		     });
		
		setJMenuBar(menu);
		Pane = new  JDesktopPane();
		
		setTitle("Yahtzee");
		
		
		getContentPane().add(Pane);
	}
	
	
	
}
