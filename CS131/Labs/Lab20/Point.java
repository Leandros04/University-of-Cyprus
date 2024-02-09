
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
	
	public int getX()
	{
		return 0;
	}
	
	public int getY()
	{
		return 0;
	}
	
	public static void sort(Point[] tab, boolean b)
	{
		if(b)
		{
			for(int i = 0; i < tab.length; i++) 
			{
				for(int j = i + 1; j < tab.length; j++)
				{
					if(tab[i].getX() > tab[j].getX())
					{
						Point tmp = tab[i];
						tab[i] = tab[j];
						tab[j] = tmp;
					}
				}
			}
		}else if(!b)
		{
			for(int i = 0; i < tab.length; i++) 
			{
				for(int j = i + 1; j < tab.length; j++)
				{
					if(tab[i].getY() > tab[j].getY())
					{
						Point tmp = tab[i];
						tab[i] = tab[j];
						tab[j] = tmp;
					}
				}
			}
		}
	}
	
	//alternate method for ask1 Lab20
	public boolean greater(Point p, boolean b)
	{
		if(b)
		{
			return greaterInX(p);
		}
		
		return greaterInY(p);
	}
	
	private boolean greaterInX(Point p)
	{
		return this.x > p.x;
	}
	
	private boolean greaterInY(Point p)
	{
		return this.y > p.y;
	}
	
	public static void sort2(Point[]t, boolean b)
	{
		for(int i = 0; i < t.length; i++)
		{
			for(int j = i + 1; j < t.length; j++)
			{
				if(t[i].greater(t[j], b))
				{
					Point tmp = t[i];
					t[i] = t[j];
					t[j] = tmp;
				}
			}
		}
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
