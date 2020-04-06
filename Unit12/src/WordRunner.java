//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> list = new ArrayList<Word>();
		
		for (int i = 0; i<size; i++)
		{
			list.add(new Word(file.nextLine()));
		}
		
		ArrayList<Word> orderedList = new ArrayList<Word>();
		Word tester = list.get(0);
		while (list.size() > 0)
		{
			tester = list.get(0);
			for (Word i : list)
			{
				if (tester.compareTo(i)>0)
				{
					tester = i;
				}
			}
			orderedList.add(tester);
			list.remove(tester);
		}
		list = orderedList;
		for (int i = 0; i<list.size();i++)
		{
			out.println(list.get(i));
		}
	}
}