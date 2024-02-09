
public class ask1_v2 {

    public static void rearrange(int N, int[] arr) 
    {
    	for(int i = 0; i < N; i++)
    	{
    	if(arr[i] != -1)
    	      while(arr[i] != -1 && arr[i] != i)
    	      {
    	    	  int tmp = arr[i];
    	      
    	    	  arr[i] = arr[arr[i]];
    	    	  arr[arr[i]] = tmp;
    	      }
    	}
    }
    
    public static void main(String[] args) {

        int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16,2, 14, 17, 4};

        int N = arr.length;

        rearrange(N, arr);
        
        System.out.print("[");
        for (int i = 0; i < N; i++)
        {
        	while(i < N - 1)
        	{
        		if(i!=0)
            System.out.print(",");
            System.out.print(arr[i] + " ");
            break;
        	}
        }
        
        System.out.print("]");
    }

}
