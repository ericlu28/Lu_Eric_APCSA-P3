//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
	
public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(0);
	}

	public void setLetter(char c)
	{
		letter = c;
		
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i<amount; i++)
		{
			for (int a = 0; a<amount; a++)
			{
				for (int b = 0; b<amount; b++)
				{
					
				}
			}
		}
		return output;
	}
}