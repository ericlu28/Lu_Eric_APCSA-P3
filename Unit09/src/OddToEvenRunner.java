import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven test = new ListOddToEven();
		ArrayList <Integer> list = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(test.go(list));
		ArrayList <Integer> list1 = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(test.go(list1));
		ArrayList <Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		System.out.println(test.go(list2));
		ArrayList <Integer> list3 = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
		System.out.println(test.go(list3));
		ArrayList <Integer> list4 = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
		System.out.println(test.go(list4));
		ArrayList <Integer> list5 = new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
		System.out.println(test.go(list5));
		ArrayList <Integer> list6 = new ArrayList<Integer>(Arrays.asList(9,11,11,11,7,100,3,2));
		System.out.println(test.go(list6));
		ArrayList <Integer> list7 = new ArrayList<Integer>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
		System.out.println(test.go(list7));
		ArrayList <Integer> list8 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,8));
	}
}