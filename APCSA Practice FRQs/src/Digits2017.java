import java.util.ArrayList;

public class Digits
{
	private ArrayList<Integer> digitList;
	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();		
		if (num == 0)
		{
			digitList.add(0);
		}
		//remember to add 0 case next time
		while (num > 0)
		{
			digitList.add(0, num % 10); 
			//forgot to add 0 in the spot at first
			num /= 10;
		}
	}
	
	public boolean isStrictlyIncreasing()
	{
		for (int i = 1; i<digitList.size(); i++)
		{
			if (digitList.get(i) <= digitList.get(i-1))
			{
				return false;
			}
		}
		return true;
	}
}