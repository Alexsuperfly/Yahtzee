//Bret Owens - bto14
//Alex Sumner - acs14k


//Imports for Dice
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JPanel;

public class JDice extends JPanel {	//Will draw a single dice
		private int value;	//Number of dice
		private Random r = new Random();	//For random number
		private int SIDE;
		private boolean selected = false;	//Selected to be rerolled
		private Color color = Color.BLACK;	//Default color
		
		JDice() {	//Assigns value and adds listener
		    roll();
		    addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent me) {
	                set();
	                repaint();
	            }
	        });
		  }
		public void setSIDE()	//Set size of circles
		{
			SIDE = (int)(getWidth() / 7);
		}
		public void set()	//set selected or un-selected
		{
			if(selected)
			{
				selected = false;
				color = Color.BLACK;
			}
			
			else
			{
				selected = true;
				color = Color.RED;
			}
		}
		
		public boolean isSelected()	//check to see if selected
		{
			return selected;
		}
		
		public void roll()	//assigns new value
		{
			value = getValue();
		    repaint();
		    
		}
		
		public String value()	//string of dice value
		{
			return Integer.toString(value);
		}
		
		
		private int getValue()	//assigns new dice value
		{
			return r.nextInt(6) + 1;
		}
		
		//Paints circles on dice
		public void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    g.setColor(color);
		    setSIDE();
		    switch (value) {
		    case 1:
		      g.fillOval(3 * SIDE, 3 * SIDE, SIDE, SIDE);
		      break;
		    case 2:
		      g.fillOval(5 * SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(SIDE, 5 * SIDE, SIDE, SIDE);
		      break;
		    case 3:
		      g.fillOval(5 * SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(SIDE, 5 * SIDE, SIDE, SIDE);
		      g.fillOval(3 * SIDE, 3 * SIDE, SIDE, SIDE);
		      break;
		    case 4:
		      g.fillOval(SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, 5 * SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(SIDE, 5 * SIDE, SIDE, SIDE);
		      break;
		    case 5:
		      g.fillOval(SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, 5 * SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(SIDE, 5 * SIDE, SIDE, SIDE);
		      g.fillOval(3 * SIDE, 3 * SIDE, SIDE, SIDE);
		      break;
		    case 6:
		      g.fillOval(SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, 5 * SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, SIDE, SIDE, SIDE);
		      g.fillOval(SIDE, 5 * SIDE, SIDE, SIDE);
		      g.fillOval(SIDE, 3 * SIDE, SIDE, SIDE);
		      g.fillOval(5 * SIDE, 3 * SIDE, SIDE, SIDE);
		      break;
		    }
	}
		//Beginning of checks for if valid for combo
		public static boolean Aces(String s)
        {
                if(s.contains("1"))
                {
                        return true;
                }

                return false;
        }

		public static boolean Twos(String s)
        {
                if(s.contains("2"))
                {
                        return true;
                }

                return false;
        }

        public static boolean Threes(String s)
        {
                if(s.contains("3"))
                {
                        return true;
                }

                return false;
        }

        public static boolean Fours(String s)
        {
                if(s.contains("4"))
                {
                        return true;
                }

                return false;
        }

        public static boolean Fives(String s)
        {
                if(s.contains("5"))
                {
                        return true;
                }

                return false;
        }

        public static boolean Sixes(String s)
        {
                if(s.contains("6"))
                {
                        return true;
                }

                return false;
        }

        public static boolean ThreeOfAKind(String s)
        {
                int values[] = new int[7];
                values[0] = 0;
                for(int i = 0; i < s.length(); i++)
                {
                	if(s.charAt(i) == '1')
                    {
                    	values[1]++;
                    }
                    else if(s.charAt(i) == '2')
                    {
                    	values[2]++;
                    }
                    else if(s.charAt(i) == '3')
                    {
                    	values[3]++;
                    }
                    else if(s.charAt(i) == '4')
                    {
                    	values[4]++;
                    }
                    else if(s.charAt(i) == '5')
                    {
                    	values[5]++;
                    }
                    else if(s.charAt(i) == '6')
                    {
                    	values[6]++;
                    }
                }

                boolean Three = false;

                for(int i = 1; i < 7; i++)
                {
                        if(values[i] >= 3)
                        {
                                Three = true;
                        }
                }

                return Three;
        }

        public static boolean FourOfAKind(String s) 
        {
                int values[] = new int[7];
                values[0] = 0;
                for(int i = 0; i < s.length(); i++)
                {
                	if(s.charAt(i) == '1')
                    {
                    	values[1]++;
                    }
                    else if(s.charAt(i) == '2')
                    {
                    	values[2]++;
                    }
                    else if(s.charAt(i) == '3')
                    {
                    	values[3]++;
                    }
                    else if(s.charAt(i) == '4')
                    {
                    	values[4]++;
                    }
                    else if(s.charAt(i) == '5')
                    {
                    	values[5]++;
                    }
                    else if(s.charAt(i) == '6')
                    {
                    	values[6]++;
                    }
                }

                boolean Four = false; 

                for(int i = 1; i < 7; i++)
                {
                        if(values[i] >= 4)
                        {
                                Four = true;
                        }    
                }

                return Four;
        }

        public static boolean Yaht(String s)        
        {
                int values[] = new int[7];
                values[0] = 0;
                for(int i = 0; i < s.length(); i++)
                {
                	if(s.charAt(i) == '1')
                    {
                    	values[1]++;
                    }
                    else if(s.charAt(i) == '2')
                    {
                    	values[2]++;
                    }
                    else if(s.charAt(i) == '3')
                    {
                    	values[3]++;
                    }
                    else if(s.charAt(i) == '4')
                    {
                    	values[4]++;
                    }
                    else if(s.charAt(i) == '5')
                    {
                    	values[5]++;
                    }
                    else if(s.charAt(i) == '6')
                    {
                    	values[6]++;
                    }
                }

                boolean Five = false; 

                for(int i = 1; i < 7; i++)
                {
                        if(values[i] == 5)
                        {
                                Five = true;
                        }    
                }

                return Five;
        }

        public static boolean FullHouse(String s)
        {
                int values[] = new int[7];
                values[0] = 0;
                for(int i = 0; i < s.length(); i++)
                {
                        if(s.charAt(i) == '1')
                        {
                        	values[1]++;
                        }
                        else if(s.charAt(i) == '2')
                        {
                        	values[2]++;
                        }
                        else if(s.charAt(i) == '3')
                        {
                        	values[3]++;
                        }
                        else if(s.charAt(i) == '4')
                        {
                        	values[4]++;
                        }
                        else if(s.charAt(i) == '5')
                        {
                        	values[5]++;
                        }
                        else if(s.charAt(i) == '6')
                        {
                        	values[6]++;
                        }
                }

                boolean Three = false;
                boolean Two = false;

                for(int i = 1; i < 7; i++)
                {
                        if(values[i] == 3)
                        {
                                Three = true;
                        }

                        if(values[i] == 2)
                        {
                                Two = true;
                        }
                }

                return (Three && Two);
        }
        
        public static boolean SmallStraight(String s)
        {
                if(s.contains("1") && s.contains("2") && s.contains("3") && s.contains("4"))
                {
                        return true;
                }

                else if(s.contains("2") && s.contains("3") && s.contains("4") && s.contains("5"))
                {
                        return true;
                }

                else if(s.contains("3") && s.contains("4") && s.contains("5") && s.contains("6"))
                {
                        return true;
                }

                return false;
        }

        public static boolean LargeStraight(String s)
        {
                if(s.contains("1") && s.contains("2") && s.contains("3") && s.contains("4") && s.contains("5"))
                {
                        return true;
                }

                else if(s.contains("2") && s.contains("3") && s.contains("4") && s.contains("5") && s.contains("6"))
                {
                        return true;
                }

                return false;
        }

	
}
