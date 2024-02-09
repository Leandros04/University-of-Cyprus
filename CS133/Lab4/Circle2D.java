package cs.lab4;

public class Circle2D 
{
	private double x;
	private double y;
	private double radius;
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public Circle2D()
	{
		this.x = 0;
		this.y = 0;
		
		this.radius = 1;
	}
	

	public Circle2D(int x, int y, double radius)
	{
		this.x = x;
		this.y = y;
		
		this.radius = radius;
	}
	
	public double getArea()
	{
		double pi = Math.PI;
		
		return pi * (this.radius * this.radius);
	}
	
	public double getPerimeter()
	{
		double pi = Math.PI;
		
		return 2 * (pi * this.radius);
	}
	
	public boolean contains(double x, double y)
	{
		return (x < this.radius && y < this.radius);
	}
	
	private static double distance(double x1, double x2, double y1, double y2)
	{
		return (Math.sqrt((x2 - x1) + (y2 - y1)));
	}
	
	public boolean contains(Circle2D circle)
	{
		double d = distance(this.x, this.y, circle.x, circle.y);
		
		return (d + circle.radius) < this.radius;
	}
	
	public boolean overlaps(Circle2D circle)
	{
		return (circle.radius < (this.radius + circle.radius));
	}
	
	
}
