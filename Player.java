//Bret Owens - bto14
//Alex Sumner - acs14k


//imports for Player
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
public class Player extends JPanel{
	private int [] Upper = new int[6];	//scores of upper section
	private int [] Lower = new int[8];	//scores of lower section
	public int FScore = 0;	//Final score
	public JPanel chart = new JPanel();	//chart for displaying scores and combos
	public ArrayList<JButton> Panels = new ArrayList<JButton>();	//AL of buttons for combos
	public ArrayList<JLabel> Points = new ArrayList<JLabel>();	//AL of labels for score received
	public int PLnum;	//player number
	
	//temp values for each 
	private int aceval = 0;
	private int twoval = 0;
	private int threeval = 0;
	private int fourval = 0;
	private int fiveval = 0;
	private int sixval = 0;
	private int TOKval = 0;
	private int FOKval = 0;
	private int YAHval = 0;
	private int SSval = 0;
	private int LSval = 0;
	private int FHval = 0;
	private int CHval = 0;
	private int Ranval = 0;
	
	
	public Player(int x)
	{
		
		PLnum = x + 1;	//assign player number
		for(int i = 0; i < Upper.length; i++)
		{
			Upper[i] = -1;	//values for not-filled upper
		}
		for(int i = 0; i < Lower.length; i++)
		{
			Lower[i] = -1;	//values for not filled lower
		}
		for(int i = 0; i < 14; i++)
		{
			Panels.add(new JButton());
			Points.add(new JLabel(" "));
		}	//Simple adding of new buttons and labels to ALs
		
		GridLayout bob = new GridLayout(15,3);	//Layout for charts
		chart.setLayout(bob);
		chart.add(new JLabel("Combo"));	//Headers
		chart.add(new JLabel("Points Earned"));	
		chart.add(new JLabel("Points possible on current roll"));
		chart.add(new JLabel("Aces"));	//Start of combo and points earned and points possible
		chart.add(Points.get(0));
		chart.add(Panels.get(0));
		chart.add(new JLabel("Twos"));
		chart.add(Points.get(1));
		chart.add(Panels.get(1));
		chart.add(new JLabel("Threes"));
		chart.add(Points.get(2));
		chart.add(Panels.get(2));
		chart.add(new JLabel("Fours"));
		chart.add(Points.get(3));
		chart.add(Panels.get(3));
		chart.add(new JLabel("Fives"));
		chart.add(Points.get(4));
		chart.add(Panels.get(4));
		chart.add(new JLabel("Sixes"));
		chart.add(Points.get(5));
		chart.add(Panels.get(5));
		chart.add(new JLabel("Three of a Kind"));
		chart.add(Points.get(6));
		chart.add(Panels.get(6));
		chart.add(new JLabel("Four of a Kind"));
		chart.add(Points.get(7));
		chart.add(Panels.get(7));
		chart.add(new JLabel("Yahtzee"));
		chart.add(Points.get(8));
		chart.add(Panels.get(8));
		chart.add(new JLabel("Full House"));
		chart.add(Points.get(9));
		chart.add(Panels.get(9));
		chart.add(new JLabel("Small Straight"));
		chart.add(Points.get(10));
		chart.add(Panels.get(10));
		chart.add(new JLabel("Large Straight"));
		chart.add(Points.get(11));
		chart.add(Panels.get(11));
		chart.add(new JLabel("Chance"));
		chart.add(Points.get(12));
		chart.add(Panels.get(12));
		chart.add(new JLabel("Random"));
		chart.add(Points.get(13));
		chart.add(Panels.get(13));
		
		
		//Start of action listeners for buttons
		Panels.get(0).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(0).setText(Integer.toString(aceval));
		    Upper[0] = aceval;
		    Panels.get(0).setEnabled(false);
		    Panels.get(0).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(1).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(1).setText(Integer.toString(twoval));
		    Upper[1] = twoval;
		    Panels.get(1).setEnabled(false);
		    Panels.get(1).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(2).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(2).setText(Integer.toString(threeval));
		    Upper[2] = threeval;
		    Panels.get(2).setEnabled(false);
		    Panels.get(2).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(3).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(3).setText(Integer.toString(fourval));
		    Upper[3] = fourval;
		    Panels.get(3).setEnabled(false);
		    Panels.get(3).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(4).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(4).setText(Integer.toString(fiveval));
		    Upper[4] = fiveval;
		    Panels.get(4).setEnabled(false);
		    Panels.get(4).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(5).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(5).setText(Integer.toString(sixval));
		    Upper[5] = sixval;
		    Panels.get(5).setEnabled(false);
		    Panels.get(5).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(6).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(6).setText(Integer.toString(TOKval));
		    Lower[0] = TOKval;
		    Panels.get(6).setEnabled(false);
		    Panels.get(6).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(7).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(7).setText(Integer.toString(FOKval));
		    Lower[1] = FOKval;
		    Panels.get(7).setEnabled(false);
		    Panels.get(7).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(8).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(8).setText(Integer.toString(YAHval));
		    Lower[2] = YAHval;
		    Panels.get(8).setEnabled(false);
		    Panels.get(8).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(9).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(9).setText(Integer.toString(FHval));
		    Lower[3] = FHval;
		    Panels.get(9).setEnabled(false);
		    Panels.get(9).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(10).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(10).setText(Integer.toString(SSval));
		    Lower[4] = SSval;
		    Panels.get(10).setEnabled(false);
		    Panels.get(10).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(11).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(11).setText(Integer.toString(LSval));
		    Lower[5] = LSval;
		    Panels.get(11).setEnabled(false);
		    Panels.get(11).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(12).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    Points.get(12).setText(Integer.toString(CHval));
		    Lower[6] = CHval;
		    Panels.get(12).setEnabled(false);
		    Panels.get(12).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		Panels.get(13).addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Random rand = new Random();

			  Ranval = rand.nextInt(50) + 1;
		    Points.get(13).setText(Integer.toString(Ranval));
		    Lower[7] = Ranval;
		    Panels.get(13).setEnabled(false);
		    Panels.get(13).setVisible(false);
		    FinalP.roll = 4;
		  }
		});
		
		chart.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
		chart.setVisible(true);
	}
	
	//check to change button labels when valid roll is made
	public void check(String s)
	{
		if(JDice.Aces(s))
		{
			int charCount = 0;
			for( int i = 0; i < s.length( ); i++ )
			{
			    char temp = s.charAt( i );

			    if( temp == '1' )
			        charCount++;
			}
			Panels.get(0).setText("Points gained: " + charCount);
			aceval = charCount;
		}
		else
		{
			Panels.get(0).setText("No points gained");
			aceval = 0;
		}
		if(JDice.Twos(s))
		{
			int charCount = 0;
			for( int i = 0; i < s.length( ); i++ )
			{
			    char temp = s.charAt( i );

			    if( temp == '2' )
			        charCount++;
			}
			Panels.get(1).setText("Points gained: " + (charCount * 2));
			twoval = charCount * 2;
		}
		else
		{
			Panels.get(1).setText("No points gained");
			twoval = 0;
		}
		if(JDice.Threes(s))
		{
			int charCount = 0;
			for( int i = 0; i < s.length( ); i++ )
			{
			    char temp = s.charAt( i );

			    if( temp == '3' )
			        charCount++;
			}
			Panels.get(2).setText("Points gained: " + (charCount * 3));
			threeval = charCount * 3;
		}
		else
		{
			Panels.get(2).setText("No points gained");
			threeval = 0;
		}
		if(JDice.Fours(s))
		{
			int charCount = 0;
			for( int i = 0; i < s.length( ); i++ )
			{
			    char temp = s.charAt( i );

			    if( temp == '4' )
			        charCount++;
			}
			Panels.get(3).setText("Points gained: " + (charCount * 4));
			fourval = charCount * 4;
		}
		else
		{
			Panels.get(3).setText("No points gained");
			fourval = 0;
		}
		if(JDice.Fives(s))
		{
			int charCount = 0;
			for( int i = 0; i < s.length( ); i++ )
			{
			    char temp = s.charAt( i );

			    if( temp == '5' )
			        charCount++;
			}
			Panels.get(4).setText("Points gained: " + (charCount * 5));
			fiveval = charCount * 5;
		}
		else
		{
			Panels.get(4).setText("No points gained");
			fiveval = 0;
		}
		if(JDice.ThreeOfAKind(s))
		{
			int Count = 0;
			String x;
			for( int i = 0; i < s.length( ); i++ )
			{
			    x = "" + s.charAt(i);
			    Count += Integer.parseInt(x);
			}
			Panels.get(6).setText("Points gained: " + (Count));
			TOKval = Count;
		}
		else
		{
			Panels.get(6).setText("No points gained");
			TOKval = 0;
		}
		if(JDice.Sixes(s))
		{
			int charCount = 0;
			for( int i = 0; i < s.length( ); i++ )
			{
			    char temp = s.charAt( i );

			    if( temp == '6' )
			        charCount++;
			}
			Panels.get(5).setText("Points gained: " + (charCount * 6));
			sixval = charCount * 6;
		}
		else
		{
			Panels.get(5).setText("No points gained");
			sixval = 0;
		}
		if(JDice.FourOfAKind(s))
		{
			int Count = 0;
			String x;
			for( int i = 0; i < s.length( ); i++ )
			{
			    x = "" + s.charAt(i);
			    Count += Integer.parseInt(x);
			}
			Panels.get(7).setText("Points gained: " + (Count));
			FOKval = Count;
		}
		else
		{
			Panels.get(7).setText("No points gained");
			FOKval = 0;
		}
		if(JDice.Yaht(s))
		{	
				Panels.get(8).setText("Points gained: 50");
				YAHval = 50;
		}
						
		else
		{
			Panels.get(8).setText("No points gained");
			YAHval = 0;
		}
		if(JDice.SmallStraight(s))
		{
			Panels.get(10).setText("Points gained: 30");
			SSval = 30;
		}
		else
		{
			Panels.get(10).setText("No points gained");
			SSval = 0;
		}
		if(JDice.LargeStraight(s))
		{
			Panels.get(11).setText("Points gained: 40");
			LSval = 40;
		}
		else
		{
			Panels.get(11).setText("No points gained");
			LSval = 0;
		}
		if(JDice.FullHouse(s))
		{
			Panels.get(9).setText("Points gained: 25");
			FHval = 25;
		}
		else
		{
			Panels.get(9).setText("No points gained");
			FHval = 0;
		}
		
		int Count = 0;
		String x;
		for( int i = 0; i < s.length( ); i++ )
		{
		    x = "" + s.charAt(i);
		    Count += Integer.parseInt(x);
		}
		Panels.get(12).setText("Points gained: " + (Count));
		CHval = Count;
		
		Panels.get(13).setText("Random Number!");
	}
	
	
	//calculate final score for a player
	public void calc_final()
	{
		int top = 0;
		for (int i = 0; i < 6; i++)
		{
			top += Upper[i];
		}
		
		if(top >= 63)
		{
			top += 35;
		}
		
		int bottom = 0;
		for (int i = 0; i < 8; i++)
		{
			bottom += Lower[i];
		}
		
		FScore = top + bottom;
	}
	
}
