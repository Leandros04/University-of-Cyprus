
public class ask2 {

	public static void main(String[] args) {
		int sum = 0;
		
		String str = StdIn.readString();
		
		for(int i = 0; i < str.length(); i++)
		{
			sum += (int)str.charAt(i);
		}
		
		StdOut.print(sum);
	}

}
