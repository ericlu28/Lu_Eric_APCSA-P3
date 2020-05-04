import java.util.ArrayList;

public class RandomStringChooser
{
	private ArrayList<String> list;
	
	public RandomStringChooser(String[] wordArray)
	{
		private list = new ArrayList<String>();
		for (String strings : wordArray)
		{
			list.add(strings);
		}
		
	}
	public String getNext()
	{
		int spot = 0;
		if (list.size == 0)
		{
			return "NONE";
		}
		while (list.size > 0)
		{
				spot = ((int) Math.random() * list.size());
				return list.get(spot);
				list.remove(spot);
		}
	}
}

public class RandomLetterChooser extends RandomStringChooser
{
	private ArrayList<String> charList;
	public RandomLetterChooser(String str)
	{
		charList = new ArrayList<String>();
		charList.add(getSingleLetters(str));
	}
}