public class Crossword
{
	private Square[][] puzzle;
	
	public Square(boolean isBlack, int num)
	{
		
	}
	
	public Crossword(boolean[][] blackSquares) {
		puzzle = new Square[blackSquares.length][blackSquares.length];
		
		for (int r = 0; r<blackSquares.length; r++)
		{
			for (int c = 0; c<blackSquares.length; c++)
			{
				if (blackSquares[r][c] == true)
				{
					puzzle[r][c] = new Square(true, 0);
				}
				else
				{
					int num = 1;
					puzzle[r][c] = new Square(false, num);
					num++;
				}
			}
		}
	}
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
	{
		if (r == 0 || c == 0)
		{
			return false;
		}
			return (!(blackSquares[r][c]) && blackSquares[r-1][c] || blackSquares[r][c-1]);
	}
}

