
public class ask3 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
	    StdDraw.setXscale(-1, 1);
		StdDraw.setYscale(-1, 1);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.01);
		
		for(double theta = 0; theta <= Math.PI * 2; theta += 0.001)
		{
			
			double r = Math.sin(N * theta);
			
			double x = r * Math.cos(theta);
			double y = r * Math.sin(theta);
			StdDraw.line(x,  y,  x,  y);
		}
	}

}
