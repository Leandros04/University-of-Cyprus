package cs.lab2;

/**
 * This class implements Rational numbers.
 * 
 * 
 * @author Leandros Antoniades
 * @since 23/01/2024
 * 
 */
public class RationalNumbers 
{
	/**
	 * This represents the numerator of a {@link RationalNumbers} number.
	 */
	private int numerator;
	private int denominator;
	
	/**
	 * The default constructor.
	 */
	public RationalNumbers()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	/**
	 * The constructor with two arguments.
	 * 
	 * @param numerator The numerator of the {@link RationalNumbers} number.
	 * @param denominator The denominator of the rational number.
	 */
	public RationalNumbers(int numerator, int denominator)
	{
		this.numerator = numerator;
		if(denominator == 0)
			throw new ArithmeticException("Denominator of rational is zero.");
		
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
	
	/**
	 * This method adds two {@link RationalNumbers} numbers.
	 * 
	 * This method takes one {@link RationalNumbers} number parameter and adds 
	 * it to the {@link RationalNumbers} calling the method.
	 * 
	 * @param r A {@link RationalNumbers} number.
	 * @return A {@link RationalNumbers} number.
	 */
	public RationalNumbers add(RationalNumbers r)
	{
		int newNumerator = this.numerator + r.denominator + this.denominator + r.numerator;
		int newDenominator = this.denominator + r.denominator;
		
		return new RationalNumbers(newNumerator, newDenominator);
	}
}
