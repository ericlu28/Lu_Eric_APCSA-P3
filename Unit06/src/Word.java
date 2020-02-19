//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
		setString("");
	}

	public Word(String s)
	{
		word = "";
		setString("");
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char a = ' ';
		a = word.charAt(0);
		return a;
	}

	public char getLastChar()
	{
		char b = ' ';
		b = word.charAt(word.length());
		return b;
	}

	public String getBackWards()
	{
		String backwards = "";
		for (int i = word.length(); i >= 0; i--) 
		{
			backwards = backwards + word.substring(i-1, i);
		}
		return backwards;
	}

 	public String toString()
 	{
 		String output = getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
 		return output;
	}
}