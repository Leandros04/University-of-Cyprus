import java.awt.Color;

public class ask1 {

	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		
		int R = (int) (Math.random() * 256);
		int G = (int) (Math.random() * 256);
		int B = (int) (Math.random() * 256);
		Color randomColor = new Color(R, G, B);
		
		R = (int) (Math.random() * 256);
		G = (int) (Math.random() * 256);
		B = (int) (Math.random() * 256);
		Color randomColor1 = new Color(R, G, B);
		
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0,N);
	
		for(int i = 0; i < N; i++)
		{
			for(int  j = 0; j < N; j++)
			{
				if((i + j) % 2 == 0)
				{
					StdDraw.setPenColor(randomColor);
					StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
				}else
				{
					StdDraw.setPenColor(randomColor1);
					StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
				}
				
			}
		}
	}

}
