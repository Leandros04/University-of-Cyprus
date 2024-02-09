
public class ask2 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		StdDraw.picture(N/2, N/2, "forest.jpg");
		
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.setPenRadius(0.1);
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				StdDraw.rectangle(i + 0.5,  j + 0.5,  0.5,  0.5);
			}
		}
	}

}
