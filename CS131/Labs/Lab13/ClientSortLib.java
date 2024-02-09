
public class ClientSortLib {

	public static void main(String[] args) {
		char d;
		int[] arr = new int[100];
		int N = arr.length;
		int  val = 0;
		int k = 0;
		System.out.print("a) Selection Sort\nb) Insertion Sort\n");
		d = StdIn.readChar();
		
		while(d != 'c')
		{
			if(d == 'a')
			{
				SortLib.selectionSort(arr, N);
			}else if(d == 'b')
			{
				System.out.print("Enter up to 100 positive numbers; Enter 0 to end.\n");
				do {
					arr[k] = StdIn.readInt();
					SortLib.insertionSort(arr, N, val);
					k++;
				}while(arr[k] > 0);
			}else if(d == 'c')
			{
				System.exit(d);
			}
		}

	}

}
