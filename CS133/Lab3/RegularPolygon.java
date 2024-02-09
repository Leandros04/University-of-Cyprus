package cs.lab3;

public class RegularPolygon 
{
	private int n; 
	private int side;
	private int centerX;
	private int centerY;
	
	public RegularPolygon()
	{
		this.n = 3;
		this.side = 1;
		this.centerX = 0;
		this.centerY = 0;
		
		getPerimeter();
		getArea();
		
		drawPolygon(n, side, centerX, centerY);
	}
	
	public RegularPolygon(int n, int side)
	{
		this.n = n;
		this.side = side;
		
		getPerimeter();
		getArea();
		
		drawPolygon(n, side, centerX, centerY);
	}
	
	public RegularPolygon(int n, int side, double centerX, double centerY)
	{
		this.n = n;
		this.side = side;
		this.centerX = (int) centerX;
		this.centerY = (int) centerY;
		
		getPerimeter();
		getArea();
		
		drawPolygon(n, side, centerX, centerY);
	}
	
	private void drawPolygon(int n , int side, double centerX, double centerY)
	{
		
	}
	
	public int getPerimeter()
	{
		return this.n * this.side;
	}
	
	public int getArea()
	{
		return (int) (this.n * this.side/(4 * Math.tan(180/this.n)));
	}
	
	public boolean equals(RegularPolygon r)
	{
		if(r.n == this.n && r.side == this.side)
		{
			return true;
		}else
			return false;
	}
}
