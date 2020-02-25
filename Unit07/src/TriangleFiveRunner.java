//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);

		  out.print("Enter the letter :: ");
		  String character = keyboard.next();
		  char c = character.charAt(0);
		  
		  out.print("Enter an amount :: ");
		  int amt = keyboard.nextInt();
		  
		  TriangleFive play = new TriangleFive(c,amt);
		  out.print(play.toString());
		  
	   
	}
}