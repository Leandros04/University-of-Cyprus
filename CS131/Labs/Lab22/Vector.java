import java.util.Arrays;

public class Vector {
	private int n;
	private double[] data;
	
	public Vector(double[] data)
	{
		n = data.length;
		
		//defensive copy technique
		this.data = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			this.data[i] = data[i];
		}
		//
	}
	
	public double[] plus(Vector b)
	{
		this.data = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			b.data[i] += data[i];
		}
		
		return this.data;
	}
	
	public double[] minus(Vector b)
	{
		this.data = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			b.data[i] -= data[i];
		}
		
		return this.data;
	}
	
	public double times(double t)
	{
		this.data = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			this.data[i] *= data[i];
		}
		
		return this.data[n-1];
	}
	
	public double magnitude()
	{
		return Math.sqrt(dot(this));
	}
	
	public double dot(Vector b)
	{
		if(this.n != b.n)
		{
			throw new IllegalArgumentException("Dimensions Wrong.");
		}
		
		double sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += this.data[i] * b.data[i];
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "Vector [n=" + n + ", data=" + Arrays.toString(data) + ", magnitude()=" + magnitude() + "]";
	}
	
	public static void main(String[] args)
	{
		double[] xdata = { 1.0, 2.0, 3.0, 4.0 };
		double[] ydata = { 5.0, 2.0, 4.0, 1.0 };
		
		Vector x = new Vector(xdata);
		Vector y = new Vector(ydata);
		
		StdOut.println("x = " + x);
		StdOut.println("y = " + y);
		StdOut.println("x + y = " + x.plus(y));
		StdOut.println("10x = " + x.times(10.0));
		StdOut.println("|x| = " + x.magnitude());
		StdOut.println("<x, y> = " + x.dot(y));
		//StdOut.println("|x - y| = " + x.minus(y).magnitude());
	}
	
}
