//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> list = new ArrayList<Integer>();
    	int sum = 0;
    	for(int k[] : m) {
    		for(int i : k) {
    			sum+= i;
    		}
    		list.add(sum);
    		sum = 0;
    	}
		return list;
    }
}
