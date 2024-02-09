public class ScaleArray {
	
	public static double findBigger(double []arr)
	{
		double max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static double findSmaller(double []arr)
	{
		double min = arr[0];
		
		for(int i = arr.length - 1; i >= 0; i--)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static void scaleElement(double []arr, double min, double max)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] -= min;
		}
	}
	
	public static void readArray(double []tab)
	{
		for(int i = 0; i < tab.length; i++)
		{
			tab[i] = StdIn.readDouble();
		}
	}
	
	public static void printArray(double []arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			StdOut.print(arr[i] + " ");
			
		}
	}
	
	public static void main(String[] args) {
		double arr[] = new double[10];
		double max = findBigger(arr);
		double min = findSmaller(arr);
		
		readArray(arr);
		scaleElement(arr, min, max);
		printArray(arr);
	}
}
