//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int range = 2;
		int rand = (int)(Math.random() * range);
		if (rand == 0)
		{
			compChoice = "R";
		}
		else if (rand == 1)
		{
			compChoice = "P";
		}
		if (rand == 2)
		{
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		if (playChoice.equals(compChoice))
		{
			String winner="!Draw Game!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		if (playChoice.equals("R") && (compChoice.equals("P")))
		{
			String winner= "!Computer wins <<Paper Covers Rock>>!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		if (playChoice.equals("R") && (compChoice.equals("S")))
		{
			String winner= "!Player wins <<Rock Breaks Scissors>>!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		if (playChoice.equals("P") && (compChoice.equals("R")))
		{
			String winner= "!Player wins <<Paper Covers Rock>>!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		if (playChoice.equals("P") && (compChoice.equals("S")))
		{
			String winner= "!Computer wins <<Scissors Cuts Paper>>!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		if (playChoice.equals("S") && (compChoice.equals("P")))
		{
			String winner= "!Player wins <<Scissors Cuts Paper>>!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		if (playChoice.equals("S") && (compChoice.equals("R")))
		{
			String winner= "!Computer wins <<Rock Breaks Scissors>>!";
			String output = "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
			return output + winner;
		}
		else
		{
			String output = "Invalid Statement";
			return output;
		}
	}

	public String toString()
	{
		String output = determineWinner();
		return output;
	}
}