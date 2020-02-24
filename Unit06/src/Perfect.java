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
		for (int i = 1; i < number; i++) 
		{
			if (number % i == 0)
			{
				total += i;
				if (total == number) 
				{
					return true;
				}
			}
		}
		return false;
	}

	public String toString()
	{
		if (isPerfect() == true)
		{
			return number + " is perfect.";
		}
			return number + " is not perfect.";

	}
	
}