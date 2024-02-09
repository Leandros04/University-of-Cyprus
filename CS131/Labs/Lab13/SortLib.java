
public class SortLib {

	public static void selectionSort(int[] arr, int N)
	{	
		System.out.print("Enter up to 100 positive numbers; Enter 0 to end.\n");
		int k = 0;
		
		do {
			arr[k] = StdIn.readInt();
			k++;
		}while(arr[k] > 0);
		
		int minIndex, tmp;
		
		for(int i = 0; i < N - 1; i++)
		{
			minIndex = i;
			for(int j = 0; j < N; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			
			tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		
		System.out.print("Your numbers in sorted order are:\n\n");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\n");
		}

	}
	
	public static void insertionSort(int[] arr, int N, int val)
	{
		int i = N - 1;
		
		while(i >= 0 && arr[i] > val)
		{
			arr[i+1] = arr[i];
			i--;
		}
		
		arr[i+1] = val;
		
		System.out.print("Your numbers in sorted order are:\n\n");
		
		for(int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[i] + "\n");
		}
	}

}
