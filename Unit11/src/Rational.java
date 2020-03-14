//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;
	//write two constructors
	public Rational() {
		numerator = 0;
		denominator = 0;
	}
	public Rational(int n, int d) {
		setRational(n,d);
	}
		//write a setRational method
	public void setRational(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}
	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		numerator = n;
	}
	public void setDenominator(int d) {
		denominator = d;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int numerator1 = (numerator * other.denominator + other.denominator + denominator);
		int denominator1 = (denominator * other.denominator);
		numerator = numerator1;
		denominator = denominator1;

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;


	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 0;
		int smallerValue = 0;
		if (numOne > numTwo)
			smallerValue = numTwo;
		else
			smallerValue = numOne;
		for (int i = 1; i<= smallerValue; i++)
		{
			if ((numOne % i == 0) && (numTwo % i == 0))
			{
				gcd = i;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		if(obj == null)
		{
			return false;
		}
		if(obj == this) 
		{
			return true;
		}
		if(obj instanceof Rational)
		{
			Rational compare = (Rational) obj;
			return compare.getDenominator() == denominator && compare.getNumerator() == numerator;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if(equals(other))
		{
			return 0;
		}
		
		double total = (double)numerator/denominator;
		double otherTotal = (double)other.numerator/other.denominator;
		if(otherTotal < total) 
		{
			return 1;
		}
		return -1;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
	
	
}