
public class ask1 {

	public static void main(String[] args) 
	{
		
		StdDraw.setXscale(0, Math.PI);
		StdDraw.setYscale(0, Math.PI);
		
		double radius = Math.PI/40, rad = 0;
		
		double radius0x = Math.PI/40;
		double radius0y = Math.PI/40;
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.clear(StdDraw.BLUE);
		StdDraw.filledCircle(radius0x, radius0y, radius);		
		
		for(rad = 0; rad <= Math.PI - radius; rad+=0.005)
		{
			double traj = Math.sin(rad);
			
			if(rad <= Math.PI / 4 || rad >= 3 * Math.PI / 4)
			{
				StdDraw.clear(StdDraw.BOOK_BLUE);
				StdDraw.setPenColor(StdDraw.RED);
			}else {
				StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE);
				StdDraw.setPenColor(StdDraw.YELLOW);
			}
			StdDraw.filledCircle(rad, traj, radius);
			StdDraw.pause(1);
			StdDraw.show();
		}
	}
}
