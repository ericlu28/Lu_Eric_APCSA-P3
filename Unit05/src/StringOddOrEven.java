//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString("");
		word= "";
	}

	public StringOddOrEven(String s)
	{
		setString("");
		word= "";
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if (word.length() % 2 == 1) 
			return true;
		else 
			return false;
	}

 	public String toString()
 	{
 		if (isEven() == true)
 		{
 			String output= word + " is odd.";
 			return output;
 		}
 		
 		String output= word + " is even.";
 		return output;
	}
}