import java.awt.Color;

public class ask2 {
	public static void main(String[] args) 
	{
		Color colors[] = {StdDraw.BLACK, StdDraw.BLUE, StdDraw.BOOK_BLUE, StdDraw.BOOK_LIGHT_BLUE, StdDraw.BOOK_RED, StdDraw.CYAN, StdDraw.DARK_GRAY, StdDraw.GRAY, StdDraw.GREEN, StdDraw.LIGHT_GRAY, StdDraw.MAGENTA, StdDraw.ORANGE, StdDraw.PINK, StdDraw.PRINCETON_ORANGE, StdDraw.RED, StdDraw.WHITE, StdDraw.YELLOW};
		int i, j, minPos, secondMinPos;
		
		int N = Integer.parseInt(args[0]);		

		// set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

		double rx[] = new double[N], ry[] =  new double[N];	// position
		double vx[] = new double[N], vy[] = new double[N];	// velocity
		double radius[] = new double[N]; // radius
		double minDist, secondMinDist, distance[][] = new double[N][N];
		
		// initial values
		for(i = 0; i < N; i++) 
		{
			rx[i] = Math.random() * 2 - 1;
			ry[i] = Math.random() * 2 - 1;
			vx[i] = Math.random() * 0.03;	
			vy[i] = Math.random() * 0.03;
			
			radius[i] = 0.05;
		}

		// main animation loop
		while (true)  
		{
			// clear the background
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(0, 0, 1.0);
			
			for(i = 0; i < N; i++) 
			{
				// bounce off wall according to law of elastic collision
		   		if (Math.abs(rx[i] + vx[i]) > 1.0 - radius[i]) 
		   			vx[i] = -vx[i];
		   		
		   		if (Math.abs(ry[i] + vy[i]) > 1.0 - radius[i]) 
		   			vy[i] = -vy[i];

		    	// update position
				rx[i] = rx[i] + vx[i]; 
				ry[i] = ry[i] + vy[i]; 

				// draw ball on the screen
				StdDraw.setPenColor(colors[i]); 
				StdDraw.filledCircle(rx[i], ry[i], radius[i]); 
			}

			for(i = 0; i < N; i++) 
			{
				distance[i][i] = 0;
				minDist = 1000;
				minPos = -1;
				
				for(j = 0; j < N; j++) 
				{
					// find nearest particle within range
					if(i != j) {
						distance[i][j] = Math.sqrt(Math.pow(rx[i]-rx[j], 2)+ Math.pow(ry[i] - ry[j], 2));
						
						if(distance[i][j] < minDist) 
						{
							minDist = distance[i][j];
							minPos = j;
						}
					}
				}
				
				secondMinDist = 1000;
				secondMinPos = -1;
				
				for(j = 0; j < N; j++) 
				{
					if(i != j && distance[i][j] < secondMinDist && distance[i][j] != minPos) 
					{
						secondMinDist = distance[i][j];
						secondMinPos = j;
					}
				}
				
				vx[i] = vx[minPos] * 3.0/4 + vx[secondMinPos] * 1.0/4;
				vy[i] = vy[minPos] * 3.0/4 + vy[secondMinPos] * 1.0/4;
			}
			
			// display and pause for 20 ms
			StdDraw.pause(15);
			StdDraw.show(); 
		} 
	}
}
