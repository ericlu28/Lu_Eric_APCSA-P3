//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double biggest = Math.max(Math.max(Math.max(one, two), three), four);
		return biggest;
	}

	public String toString()
	{
	   return Double.toString(one) + ", " + Double.toString(two) + ", " +Double.toString(three) + ", " + Double.toString(four);
	}
}