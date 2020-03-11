//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if (ray.size() == 0)
		{
			return -1;
		}
		int total = 0;
		for (int i = 0; i< ray.size(); i++)
		{
			if (ray.get(i) > ray.get(0))
			{
				total += ray.get(i);
			}
		}
		if (total == 0)
		{
			return -1;
		}
		return total;
	}
}