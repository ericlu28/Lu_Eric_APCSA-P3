//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] s = {"a","b","c","d","e","f","g"};
		Grid g = new Grid(10,10,s);
		System.out.println(g);
		System.out.println(g.findMax(s));
	}
}