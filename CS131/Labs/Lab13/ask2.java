
public class ask2 {
	
	public static boolean isUgly(int N)
	{
		while(N % 5 == 0)
		{
			N /= 5;
		}
		
		while(N % 3 == 0)
		{
			N /= 3;
		}
		
		while(N % 2 == 0)
		{
			N /= 2;
		}
		
		return N == 1;
	}
	
	public static void main(String[] args) {
		int n = StdIn.readInt();
		
		System.out.print(isUgly(n)); 
	}

}
