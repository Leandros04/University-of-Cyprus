
public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point()
	{
		x = 0;
		this.y = 0;
	}
	
	public void translate(double dx, double dy)
	{
		this.x += dx;
		this.y += dy;
	}
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	
	public boolean same(Point p)
	{
		return (this.x == p.x) && (this.y == p.y);
	}
	
	public boolean isCollinear(Point p1, Point p2)
	{
		return p1 == p2;
	}
	
	public static void main(String[] args) 
	{
		 Point o = new Point(0,0);
		 System.out.println(o.toString());
		 Point p = new Point(1.5,3.4);
		 System.out.println(p.toString());
		 p.translate(0.5,-1.4);
		 System.out.println("After moving: " + p.toString());
		 
		 Point p1 = new Point();
		 Point p2 = new Point();
		 System.out.println(p1 == p2); 
		 System.out.println(p1.same(p2)); 
	}
}
