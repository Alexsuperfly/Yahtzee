import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;

public class FinalP {
	
	public static int x;
	public static void main( String args[] )
	{ 
		
		
		String s = JOptionPane.showInputDialog("Input number of players.");
		x = Integer.parseInt(s);
		Player [] players = new Player[x];
		for(int i = 0; i < x; i++)
		{
			players[i] = new Player();
		}
		
	   Yahtzee yFrame = new Yahtzee();
	   
	   JPanel top_bar = new JPanel();
	   top_bar.setPreferredSize(new Dimension(1200, 200));
	   GridLayout experimentLayout = new GridLayout(1,5);
	   experimentLayout.setVgap(50);
	   experimentLayout.setHgap(50);
	   top_bar.setLayout(experimentLayout);
	   
	   
	   
	   JDice [] DI = new JDice [5];
	   
	   
	   
	   for(int i = 0; i < 5; i++)
	   {
		   DI[i] = new JDice();
		   DI[i].setBackground(Color.WHITE);
		   DI[i].setBorder(BorderFactory.createLineBorder(Color.black));
		   
		   top_bar.add(DI[i]);
		   	
	   }
	   
	   yFrame.add(top_bar, BorderLayout.PAGE_START);
	   yFrame.add(players[0].chart, BorderLayout.CENTER);
	   JButton b1 = new JButton("Reroll Dice");
	   b1.addActionListener(new ActionListener(){
   	    public void actionPerformed(ActionEvent e) {
   	    	for(int i = 0; i < 5; i++)
   		   {
   	    		if(DI[i].isSelected())
   	    			{DI[i].roll();
   	    				DI[i].set();
   	    			
   	    			}
   			   	
   		   }
   	    	players[0].check(DI[0].value() + DI[1].value() + DI[2].value() + DI[3].value() + DI[4].value());
   	    	}
   		}); 
	   
	   
	   yFrame.add(b1, BorderLayout.SOUTH);
	   
	   yFrame.setResizable(false);
	   yFrame.setBackground(Color.WHITE);
	   yFrame.setSize( 1200, 750 );
	   yFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   yFrame.setVisible( true );
	    // set frame size
	    // display frame
	}

}
