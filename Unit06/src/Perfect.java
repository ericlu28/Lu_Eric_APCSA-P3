//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() 
   {
	   setNums(0);
   }
   public Perfect(int a)
   {
	  setNums(0);
   }
   public void setNums(int a)
   {
	   number = a;
   }

	public boolean isPerfect()
	{
		int total = 0;
		for (int i = 0; i < number; i++) 
		{
			if (number % i == 0)
			{
				total = total + i;
			}
			else
			{
			
			}	
		}
		if (total == number)
			return true;
		else
			return false;
		
	}

	public String toString()
	{
		if (isPerfect() == true)
		{
			String output = number + " is perfect.";
			return output;
		}
			String output = number + " is not perfect.";
			return output;
	}
	
}