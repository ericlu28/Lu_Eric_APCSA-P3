//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double deltay = 0;
		double deltax = 0;
		double m = 0;
		deltay = y2-y1;
		deltax = x2-x1;
		m = deltay/deltax;
		return m;
		
	}

}