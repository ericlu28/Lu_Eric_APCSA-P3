//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		int x = 0;
		while (x < 5) 
		{
			LetterRemover LetterRemover = new LetterRemover();
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Sentence :: ");
			String sentences = keyboard.nextLine();
			System.out.print("letter to remove :: ");
			char character = keyboard.next().charAt(0);
			LetterRemover.setRemover(sentences, character);
			LetterRemover.removeLetters();
			System.out.print(LetterRemover);
			
			System.out.print("\n\n\nSentence :: ");
			String sentences1 = keyboard.next();
			System.out.print("letter to remove :: ");
			char character1 = keyboard.next().charAt(0);
			LetterRemover.setRemover(sentences1, character1);
			LetterRemover.removeLetters();
			System.out.print(LetterRemover + "\n\n\n");
			
			System.out.print("Sentence :: ");
			String sentences2 = keyboard.next();
			System.out.print("letter to remove :: ");
			char character2 = keyboard.next().charAt(0);
			LetterRemover.setRemover(sentences2, character2);
			LetterRemover.removeLetters();
			System.out.print(LetterRemover + "\n\n\n");
			
			System.out.print("Sentence :: ");
			String sentences3 = keyboard.next();
			System.out.print("letter to remove :: ");
			char character3 = keyboard.next().charAt(0);
			LetterRemover.setRemover(sentences3, character3);
			LetterRemover.removeLetters();
			System.out.print(LetterRemover + "\n\n\n");
			
			System.out.print("Sentence :: ");
			String sentences4 = keyboard.next();
			System.out.print("letter to remove :: ");
			char character4 = keyboard.next().charAt(0);
			LetterRemover.setRemover(sentences4, character4);
			LetterRemover.removeLetters();
			System.out.print(LetterRemover + "\n\n\n");
			
		}
	}
}