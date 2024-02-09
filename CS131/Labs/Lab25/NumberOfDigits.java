
public class NumberOfDigits {
	public static int numOfDigits(int n)
	{
		if(n / 10 == 0)
			return 1;
		return 1 + numOfDigits(n / 10);
	}
	
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		
		System.out.println(numOfDigits(n));
	}
}
