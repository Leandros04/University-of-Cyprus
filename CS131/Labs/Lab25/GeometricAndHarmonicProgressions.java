
public class GeometricAndHarmonicProgressions {
	public static int firstNumTimes(int n)
	{
		if(!(n / 1 == n && n / n == 1))
			return n;
		return n * (n - 1);
	}
	
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		
		System.out.println(firstNumTimes(n));
	}
}
