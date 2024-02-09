
public class ask1 {

    public static void rearrange(int N, int[] arr) 
    {
    	int tmp = 0;
        for(int i = 0; i < N; i++) 
        {
            if(arr[i] != -1 && arr[i] != i)
            {
            	tmp = arr[i];
            }
            while(arr[tmp] != -1 && arr[tmp] != tmp)
            {
            	int s = arr[tmp];
            
            	arr[tmp] = tmp;
            	
            	tmp = s;
            }
            
            arr[tmp] = tmp;
            
            if(arr[i] != i)
            {
            	arr[i] = -1;
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
        	
            System.out.print(arr[i] + ", ");
        }
        
        System.out.print("]");
    }

}
