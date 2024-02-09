public class array3d {

    public static void main(String[] args)
    {
        int[][][] arr = new int[5][5][5];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i][0][0] += i+1;
            for(int j = 0; j < arr.length; j++)
            {
                arr[0][j][0] += j+1;
                for(int k = 0; k < arr.length; k++)
                {
                    arr[0][0][k] += k+1;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                for(int k = 0; k < arr.length; k++)
                {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
