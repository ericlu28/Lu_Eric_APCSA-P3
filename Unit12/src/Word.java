//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	private int sizeWord;

	public Word( String s )
	{
		word = s;
		sizeWord = s.length();
	}

	public int compareTo( Word rhs )
	{		
		int sizerhs = rhs.word.length();
		if (sizeWord > sizerhs)
		{
			return 1;
		}
		else if (sizeWord < sizerhs)
		{
			return -1;
		}
		else
			return word.compareTo(rhs.word);
	}

	public String toString()
	{
		return word;
	}
}