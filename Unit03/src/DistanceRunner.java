//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.printf("Enter X1::");
		int xOne = keyboard.nextInt();
		out.printf("Enter X2::");
		int yOne = keyboard.nextInt();
		out.printf("Enter Y1::");
		int xTwo = keyboard.nextInt();
		out.printf("Enter Y2::");
		int yTwo = keyboard.nextInt();
		
		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print();
		
		out.printf("Enter X1::");
		int xOne0 = keyboard.nextInt();
		out.printf("Enter X2::");
		int yOne0 = keyboard.nextInt();
		out.printf("Enter Y1::");
		int xTwo0 = keyboard.nextInt();
		out.printf("Enter Y2::");
		int yTwo0 = keyboard.nextInt();
		
		Distance test0 = new Distance();
		test.setCoordinates(xOne0, yOne0, xTwo0, yTwo0);
		test.calcDistance();
		test.print();
		
		out.printf("Enter X1::");
		int xOne1 = keyboard.nextInt();
		out.printf("Enter X2::");
		int yOne1 = keyboard.nextInt();
		out.printf("Enter Y1::");
		int xTwo1 = keyboard.nextInt();
		out.printf("Enter Y2::");
		int yTwo1 = keyboard.nextInt();
		
		Distance test1 = new Distance();
		test.setCoordinates(xOne1, yOne1, xTwo1, yTwo1);
		test.calcDistance();
		test.print();
			
	}
}