
public class ask1 {
	
	public static double sum(int n)
	{
		if(n == 1)
			return 1;
		return 1.0/n + sum(n - 1);
	}
	
	//irrelevant relative example
	public static int sumOdd(int n)
	{
		if(n == 0)
			return 0;
		if(n % 2 == 1)
			return (n % 10) + sumOdd(n / 10);
		return sumOdd(n / 10);	
	}
}
