
public class GCD {
	
	public static int gcd(int x, int y)
	{
		int gcd = (x % y);
		return gcd;
	}
	public static void main(String[] args) {
		int x = StdIn.readInt();
		int y = StdIn.readInt();
		
		if(y != 0)
		{
			while(y != 0)
			{
				int temp = x & y;
				if(x >= y && y > 0)
				{
					gcd(temp, y);
				}
			}
		}
		
		if(y == 0)
		{
			StdOut.print(gcd(x, y));
		}

	}

}
