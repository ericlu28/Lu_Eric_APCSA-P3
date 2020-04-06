//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("What is the name of your first monster?");
		String monsterName1 = keyboard.next();
		
		System.out.println("What is the size of your first monster?");
		int monsterSize1 = keyboard.nextInt();
		
		//instantiate monster one
		Monster m1 = new Skeleton(monsterName1, monsterSize1);
		//ask for name and size
		System.out.println("What is the name of your second monster?");
		String monsterName2 = keyboard.next();
		
		System.out.println("What is the size of your second monster?");
		int monsterSize2 = keyboard.nextInt();
		
		//instantiate monster two
		Monster m2 = new Skeleton(monsterName2, monsterSize2);
		
		System.out.println("Monster 1 - " + monsterName1 + " " + monsterSize1);
		System.out.println("Monster 2 - " + monsterName2 + " " + monsterSize2);
		
		if (m1.isBigger(m2))
		{
			System.out.println("Monster one is bigger than Monster two.");
		}
		if (m2.isBigger(m1))
		{
			System.out.println("Monster two is bigger than Monster one.");
		}
		if (m1.namesTheSame(m2) == true)
		{
			System.out.println("Monster one has the same name as Monster two.");
		}
		if (m1.namesTheSame(m2) == false)
		{
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		
		
	}
}