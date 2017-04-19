import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JPanel;

public class JDice extends JPanel {
		private int value;
		private Random r = new Random();
		private int SIDE = 29;
		private boolean selected = false;
		private Color color = Color.BLACK;
		
		JDice() {
		    roll();
		    addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent me) {
	                set();
	                repaint();
	            }
	        });
		  }
		
		public void set()
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
		
		public boolean isSelected()
		{
			return selected;
		}
		
		public void roll()
		{
			value = getValue();
		    repaint();
		    
		}
		
		public String value()
		{
			return Integer.toString(value);
		}
		
		
		private int getValue()
		{
			return r.nextInt(6) + 1;
		}
		public void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    g.setColor(color);
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
                int values[] = new int[6];
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
                }

                boolean Three = false;

                for(int i = 1; i <= 7; i++)
                {
                        if(values[i] == 3)
                        {
                                Three = true;
                        }
                }

                return Three;
        }

        public static boolean FourOfAKind(String s) 
        {
                int values[] = new int[6];
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
                }

                boolean Four = false; 

                for(int i = 1; i <= 7; i++)
                {
                        if(values[i] == 4)
                        {
                                Four = true;
                        }    
                }

                return Four;
        }

        public static boolean Yaht(String s)        
        {
                int values[] = new int[6];
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
                }

                boolean Five = false; 

                for(int i = 1; i <= 7; i++)
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
                Integer values[] = new Integer[6];
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
                }

                boolean Three = false;
                boolean Two = false;

                for(int i = 1; i <= 7; i++)
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
