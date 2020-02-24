//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		boolean choice;
		
		//add in a do while loop after you get the basics up and running
		do
		{
			out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
			String player = keyboard.nextLine();
			
			RockPaperScissors s = new RockPaperScissors(player);
			out.print(s.toString());
			
			out.print("\nDo you want to play again?\n");
			String YesorNo = keyboard.nextLine();
			
			if (YesorNo.equals("N"))
			{
				choice = false;
			}
			if (YesorNo.equals("Y"))
			{
				choice = true;
			}
			else
			{
				out.print("Enter a valid option :: Y/N");
				
				choice = false;
			}
		} while (choice == true);
			
			
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
	}
}



