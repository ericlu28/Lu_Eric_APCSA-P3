//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore(String toys )
	{
		toyList = new ArrayList <Toy>();
		loadToys("");
	}

	public void loadToys( String toys )
	{
		Scanner scan = new Scanner(toys);
		while(scan.hasNext())
		{
			String t = scan.next();
			Toy newToy = getThatToy(t);
			if(newToy == null) 
			{
				Toy n = new Toy(t);
				toyList.add(n);
			}
			else
			{
				newToy.setCount(newToy.getCount()+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy i : toyList)
  		{
  			if(i.getName().equals(nm)) 
  			{
  				return i;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = toyList.get(0).getCount();
  		Toy max2 = toyList.get(0);
  		for(Toy i : toyList)
  		{
  			if (i.getCount() > max) 
  			{
  				max = i.getCount();
  				max2 = toyList.get(i);
  			}
  		}
  		return max2;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> temp = new ArrayList<Toy>();
  		while(toyList.size() > 0)
  		{
  			temp.add(getMostFrequentToy());
  			toyList.remove(getMostFrequentToy());
  		}
  		return temp;
  	}  
  	  
	public String toString()
	{
	   return getMostFrequentToy() + "== the max" ;
	}
}