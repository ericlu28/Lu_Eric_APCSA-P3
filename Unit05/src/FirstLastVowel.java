//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		String str = a;
		if ((str.startsWith("a")) || (str.startsWith("e"))	|| (str.startsWith("i")) || (str.startsWith("o")) || (str.startsWith("u")) || (str.startsWith("A")) || (str.startsWith("E")) || (str.startsWith("I")) || (str.startsWith("O")) || (str.startsWith("U")) || (str.endsWith("a")) || (str.endsWith("e"))	|| (str.endsWith("i")) || (str.endsWith("o")) || (str.endsWith("u")) || (str.endsWith("A")) || (str.endsWith("E")) || (str.endsWith("I")) || (str.endsWith("O")) || (str.endsWith("U")))	
				return "yes";
		else
			return "no";
	}
}