import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
public class Player extends JPanel{
	public static Player [] players;
	private int [] Upper = new int[6];
	private int [] Lower = new int[7];
	private int FScore = 0;
	public JPanel chart = new JPanel();
	public ArrayList<JButton> Panels = new ArrayList<JButton>();
	
	public Player()
	{
		for(int i = 0; i < Upper.length; i++)
		{
			Upper[i] = -1;
		}
		for(int i = 0; i < Lower.length; i++)
		{
			Lower[i] = -1;
		}
		for(int i = 0; i < 13; i++)
		{
			Panels.add(new JButton());
		}
		
		GridLayout bob = new GridLayout(13,2);
		chart.setLayout(bob);
		chart.add(new JLabel("Aces"));
		chart.add(Panels.get(0));
		Panels.get(0).setVisible(false);
		chart.add(new JLabel("Twos"));
		chart.add(Panels.get(1));
		chart.add(new JLabel("Threes"));
		chart.add(Panels.get(2));
		chart.add(new JLabel("Fours"));
		chart.add(Panels.get(3));
		chart.add(new JLabel("Fives"));
		chart.add(Panels.get(4));
		chart.add(new JLabel("Sixes"));
		chart.add(Panels.get(5));
		chart.add(new JLabel("Three of a Kind"));
		chart.add(Panels.get(6));
		chart.add(new JLabel("Four of a Kind"));
		chart.add(Panels.get(7));
		chart.add(new JLabel("Yahtzee"));
		chart.add(Panels.get(8));
		chart.add(new JLabel("Full House"));
		chart.add(Panels.get(9));
		chart.add(new JLabel("Small Straight"));
		chart.add(Panels.get(10));
		chart.add(new JLabel("Large Straight"));
		chart.add(Panels.get(11));
		chart.add(new JLabel("Chance"));
		chart.add(Panels.get(12));
		
		chart.setBorder(BorderFactory.createLineBorder(Color.WHITE, 10));
		chart.setVisible(true);
	}
	
	public void check(String s)
	{
		if(JDice.Aces(s))
		{
			Panels.get(0).setText("Points gained: 1");
		}
		else
		{
			Panels.get(0).setText("No points gained");
		}
		if(JDice.Twos(s))
		{
			Panels.get(1).setText("Points gained: 2");
		}
		else
		{
			Panels.get(1).setText("No points gained");
		}
		if(JDice.Threes(s))
		{
			Panels.get(2).setText("Points gained: 3");
		}
		else
		{
			Panels.get(2).setText("No points gained");
		}
		if(JDice.Fours(s))
		{
			Panels.get(3).setText("Points gained: 4");
		}
		else
		{
			Panels.get(3).setText("No points gained");
		}
		if(JDice.Fives(s))
		{
			Panels.get(4).setText("Points gained: 5");
		}
		else
		{
			Panels.get(4).setText("No points gained");
		}
		if(JDice.Sixes(s))
		{
			Panels.get(5).setText("Points gained: 6");
		}
		else
		{
			Panels.get(5).setText("No points gained");
		}
	}
	
}
