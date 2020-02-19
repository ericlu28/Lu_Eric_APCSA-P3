//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
		setWord("");
	}

	public TriangleOne(String s)
	{
		word="";
		setWord("");
	}

	public void setWord(String s)
	{
		word = s;
	}
	public void print( )
	{
		for (int i = 0; i < word.length(); i++)
		{
		System.out.println(word.substring(0,i));
		}
	}
}