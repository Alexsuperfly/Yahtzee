//Bret Owens - bto14
//Alex Sumner - acs14k


//imports for functionality
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
import java.util.ArrayList;

public class FinalP {
	
	public static int x;	//Number of players
	public static int roll;	//Number of rolls per turn
	public static Player temp;	//temp player var 
	
	public static void main( String args[] )	
	{ 
		Yahtzee yFrame = new Yahtzee();	//Main frame for game
		try	//Input for number of players
		{String s = JOptionPane.showInputDialog("WARNING: GAME MAY LAG A BIT\nInput number of players.");
		x = Integer.parseInt(s);
		}
		catch(Exception e)	//Exception for invalid input for num of players
		{
			JOptionPane.showMessageDialog(yFrame, "Invalid input for number of players!");
			   System.exit(0);
		}
		Player [] players = new Player[x];	//Array of players
		for(int i = 0; i < x; i++)
		{
			players[i] = new Player(i);
		}
		
		
		roll = 1;	//current roll	
		int z = 0;	//current turn
		temp = players[z];	//temp player
		int turns = x * 14;	//Number of turns in game
	   
	   yFrame.setTitle("Yahtzee - Player " + temp.PLnum );	//changes for each players turn
	   yFrame.setSize( 1200, 750 );
	   JPanel top_bar = new JPanel();	//holds the GUI for all dice
	   top_bar.setPreferredSize(new Dimension(yFrame.getWidth(), (int)(yFrame.getWidth() / 6)));
	   GridLayout experimentLayout = new GridLayout(1,5);
	   experimentLayout.setVgap(50);	//gap between di
	   experimentLayout.setHgap(50);
	   top_bar.setLayout(experimentLayout);
	   
	   
	   
	   JDice [] DI = new JDice [5];	//Array of di
	   
	   
	   
	   for(int i = 0; i < 5; i++)
	   {
		   DI[i] = new JDice();
		   DI[i].setBackground(Color.WHITE);
		   DI[i].setBorder(BorderFactory.createLineBorder(Color.black));
		   
		   top_bar.add(DI[i]);
		   
	   }
	   temp.check(DI[0].value() + DI[1].value() + DI[2].value() + DI[3].value() + DI[4].value());	//checks to see what combo is valid
	   yFrame.add(top_bar, BorderLayout.NORTH);
	   for(int i = x - 1; i  >= 0; i--)
		{
		   yFrame.add(players[i].chart, BorderLayout.CENTER);	//Chart for every player
		   players[i].chart.setVisible(false);	//All set to invisible
		}
	   
	   temp.chart.setVisible(true);	//Sets first players chart to visible
	   
	   
	   JButton b1 = new JButton("Reroll Dice");	//Button for rerolling dice
	   b1.addActionListener(new ActionListener(){
   	    public void actionPerformed(ActionEvent e) {
   	    	boolean rolled = false;
   	    	for(int i = 0; i < 5; i++)//Rerolls selected di
   		   {
   	    		if(DI[i].isSelected())
   	    			{DI[i].roll();
   	    				DI[i].set();
   	    				rolled = true;
   	    			}
   			   	
   		   }
   	    	if(rolled)
   	    	{
   	    		roll++;
   	    	}
   	    	temp.check(DI[0].value() + DI[1].value() + DI[2].value() + DI[3].value() + DI[4].value());
   	    	}
   		}); 
	   
	   
	   yFrame.add(b1, BorderLayout.SOUTH);	//Add button to frame
	   
	   yFrame.setResizable(false);	//Make frame a set size
	   yFrame.setBackground(Color.WHITE);
	   
	   yFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   yFrame.setVisible( true );
	    // set frame size
	    // display frame
	   
	   int y = 0;
	   
	   while( y < turns)	//loop for turns between users
	   {
		   System.out.print(roll);
		   if(roll == 3)	//If current player is out of rolls
		   {
			   b1.setEnabled(false);
		   }
		   
		   else if( roll == 4 && z < players.length - 1)//if current players turn ended and not at end of player array
		   {
			   temp.chart.setVisible(false);	//set current chart to invisible
			   z++;	//increment counter to player array
			   temp = players[z];	//temp is new player
			   yFrame.add(temp.chart, BorderLayout.CENTER);
			   temp.chart.setVisible(true);
			   yFrame.setTitle("Yahtzee - Player " + temp.PLnum );
			   for(int i = 0; i <5; i++)
			   {
				   DI[i].roll();
			   }
			   temp.check(DI[0].value() + DI[1].value() + DI[2].value() + DI[3].value() + DI[4].value());
			   roll = 1;
			   y++;
			   b1.setEnabled(true);
		   }
		   
		   else if(roll == 4 && z == players.length - 1)	//If at end of array go to beginning
		   {
			   temp.chart.setVisible(false);
			   z = 0;
			   temp = players[z];
			   temp.chart.setVisible(true);
			   yFrame.setTitle("Yahtzee - Player " + temp.PLnum );
			   for(int i = 0; i <5; i++)
			   {
				   DI[i].roll();
			   }
			   temp.check(DI[0].value() + DI[1].value() + DI[2].value() + DI[3].value() + DI[4].value());
			   roll = 1;
			   y++;
			   b1.setEnabled(true);
		   }

	   }
	   
	   for(int i = x - 1; i  >= 0; i--)	//disable GUI
		{
		   players[i].chart.setVisible(false);
		}
	   
	   b1.setVisible(false);
	   top_bar.setVisible(false);
	   
	   
	   //Start calculating Winner
	   int calc = 0;
	   int num = 0;
	   ArrayList<Integer> play = new ArrayList<Integer>();
	   ArrayList<Integer> play2 = new ArrayList<Integer>();
	   players[0].calc_final();
	   calc = players[0].FScore;
	   num = players[0].PLnum;
	   play.add(calc);
	   play2.add(num);
	   for(int i = 1; i < x; i++)
	   {
		   players[i].calc_final();
		   if(players[i].FScore > calc)
		   {
			   calc = players[i].FScore;
			   play.clear();
			   play2.clear();
			   play.add(calc);
			   play2.add(num);
		   }
		   
		   else if(players[i].FScore == calc)
		   {
			   play.add(calc);
			   play2.add(num);
		   }
	   }
	   
	   
	   //Display winner(s)
	   if(play.size() == 1)
	   {
		   JOptionPane.showMessageDialog(yFrame, "Player " + play2.get(0) + " wins with a score of " + play.get(0) + "!");
		   System.exit(0);
	   }
	   
	   else if(play.size() > 1)
	   {
		   String text = "It is a ties between:\n";
		   for(int i = 0; i < play.size(); i++)
		   {
			   text += "Player " + play2.get(i) + " with a score of " + play.get(i);
		   }
		   JOptionPane.showMessageDialog(yFrame, text);
		   System.exit(0);
	   }
	   
	}

}
