public class SunTrajectory {
	public static void main(String[] args) {

		double trajectory, rad, step=0.005, radius = 0.05;
		StdDraw.setXscale(0, Math.PI);
		StdDraw.setYscale(0, Math.PI);
		for(rad=0; rad<=Math.PI; rad+=step) {
			StdDraw.setPenColor(StdDraw.GRAY);		
			StdDraw.filledSquare(Math.PI/2,Math.PI/2,Math.PI/2);
			trajectory = Math.sin(rad);
			if(rad<=Math.PI/4 || rad>=3*Math.PI/4)
				StdDraw.setPenColor(StdDraw.RED);
			else
				StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.filledCircle(rad, trajectory, radius);
			StdDraw.pause(1);
			StdDraw.show();
		}
	}
}
