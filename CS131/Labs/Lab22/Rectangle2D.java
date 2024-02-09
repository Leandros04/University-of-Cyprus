
public class Rectangle2D {
	
	double x;
	double y;
	double width;
	double height;
	
	public Rectangle2D()
	{
		this.x = 0;
		this.y = 0;
		
		this.width = 1;
		this.height = 1;
	}
	
	public Rectangle2D(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getPerimeter()
	{
		return((this.width) * 2 + (this.height) * 2);
	}
	
	public double getArea()
	{
		return(this.width * this.height);
	}
	
	public boolean contains(double x, double y)
	{
		return (x <= this.width || x <= this.height && y <= this.width || y <= this.height);
	}
	
	public boolean contains(Rectangle2D r)
	{
		return(r.width <= this.width && r.height <= this.height);
	}
	
	public boolean overlaps(Rectangle2D r)
	{
		return (r.width > this.width && r.height > this.height);
	}
}
