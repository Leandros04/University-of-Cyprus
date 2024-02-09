package cs.lab1;

public class RationalNumbers 
{
	private int numerator;
	private int denominator;
	
	public RationalNumbers()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public RationalNumbers(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		
		simplify();
	}
	
	private void simplify()
	{
	    int g = gcd(numerator, denominator);
	    
	    numerator /= g;
	    denominator /= g;
	}
	
	private static int gcd(int a, int b)
	{
		int gcd = 1;
	    for (int i = 1; i <= a && i <= b; i++) {
	        if (a % i == 0 && b % i == 0) {
	            gcd = i;
	        }
	    }
	    
	    return gcd;
	}
	
	public double getValue()
	{
		return (double) numerator / denominator;
	}


	public String toString() 
	{
		return numerator + " / " + denominator ;
	}
	
	public RationalNumbers add(RationalNumbers r)
	{
		int newNumerator = r.numerator;
		int newDenominator = r.denominator;
		
		return new RationalNumbers(newNumerator, newDenominator);
	}

	
}
