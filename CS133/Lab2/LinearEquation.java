package cs.lab2;

public class LinearEquation 
{
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private double x;
	private double y;
	
	public LinearEquation()
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.x = x;
		this.y = y;
	}
	
	public LinearEquation(int a, int b, int c, int d, int e, int f)
	{
		x = findX(a, b, c, d, e, f);
		y = findY(a, b, c, d, e, f);
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getD() {
		return d;
	}

	public int getE() {
		return e;
	}

	public int getF() {
		return f;
	}
	
	public double findX(int a, int b, int c, int d, int e, int f)
	{
		return (e * d - b * f) / (a * d - b * c);
	}
	
	public double findY(int a, int b, int c, int d, int e, int f)
	{
		return (a * f - e * c) / (a * d - b * c);
	}
}
