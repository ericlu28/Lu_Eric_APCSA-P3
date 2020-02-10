//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		while (x<5) {
			out.print("Enter the original bill amount :: ");
			double amt = keyboard.nextDouble();
			amt = Discount.getDiscountedBill(amt);
			out.print("Bill after discount :: ");
			out.printf("%.2f\n",amt);
			out.println("\n");
			x++;
		}
		

	}
}