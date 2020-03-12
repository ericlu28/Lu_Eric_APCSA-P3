import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{		
		ListDown test = new ListDown();
		ArrayList <Integer> list = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(test.go(list));
		ArrayList <Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(test.go(list1));
		ArrayList <Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(test.go(list2));
		ArrayList <Integer> list3 = new ArrayList<Integer>(Arrays.asList(32767));
		System.out.println(test.go(list3));
		ArrayList <Integer> list4 = new ArrayList<Integer>(Arrays.asList(255,255));
		System.out.println(test.go(list4));
		ArrayList <Integer> list5 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
		System.out.println(test.go(list5));
		ArrayList <Integer> list6 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
		System.out.println(test.go(list6));
		ArrayList <Integer> list7 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
		System.out.println(test.go(list7));
		ArrayList <Integer> list8 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
		System.out.println(test.go(list8));
		ArrayList <Integer> list9 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(test.go(list9));
		ArrayList <Integer> list10 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
		System.out.println(test.go(list10));
		ArrayList <Integer> list11 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
		System.out.println(test.go(list11));
	}
}