/******************************************************************************
 *  Compilation:  javac Complex.java
 *  Execution:    java Complex
 *
 *  Data type for complex numbers.
 *
 *  % java Complex
 *  a            = 5.0 + 6.0i
 *  b            = -3.0 + 4.0i
 *  Re(a)        = 5.0
 *  Im(a)        = 6.0
 *  |a|          = 7.810249675906654
 *  b + a        = 2.0 + 10.0i
 *  a - b        = 8.0 + 2.0i
 *  a * b        = -39.0 + 2.0i
 *  b * a        = -39.0 + 2.0i
 *
 ******************************************************************************/

public class Complex {
    // declare the real part
    // declare the imaginary part
	
    // create a new object with the given real and imaginary parts
    public Complex(Complex c) 
    {
    	return new Complex(Complex a, Complex b);
    }

    // return a string representation of the invoking Complex object
    public String toString() 
    {
        
    }

    // return abs/modulus/magnitude
    public double abs(Complex x, Complex y) 
    {
		return Math.abs(x) + Math.abs(y);
        
    }

    // return a new Complex object
    public Complex plus(Complex c) 
    {	
    	double newReal = re(c);
    	double newIM = im(c);
    	return new Complex(newReal, newIM);
    }

    // return a new Complex object
    public Complex minus(Complex c) 
    {
       double newReal = re(c);
       double newIm = im(c);
       return new Complex(newReal, newIm);
    }

    // return a new Complex object
    public Complex times(Complex c) 
    {
       double newReal = re(c);
       double newIm = im(c);
       return new Complex(newReal, newIm);
    }

    // return the real part
    public Complex re(Complex a, Complex b) 
    {
    	return new Complex()
	}
	
	// return imaginary part
    public Complex im() 
    { 
    	
	}

    // sample client for testing
    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        StdOut.println("a            = " + a);
        StdOut.println("b            = " + b);
        StdOut.println("Re(a)        = " + a.re());
        StdOut.println("Im(a)        = " + a.im());
		StdOut.println("|a|          = " + a.abs());
        StdOut.println("b + a        = " + b.plus(a));
        StdOut.println("a - b        = " + a.minus(b));
        StdOut.println("a * b        = " + a.times(b));
        StdOut.println("b * a        = " + b.times(a));
        StdOut.println("tan(a)       = " + a.tan());
    }

}
