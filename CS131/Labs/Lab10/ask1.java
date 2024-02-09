
public class ask1 {

	public static void main(String[] args) {
		String str = StdIn.readString();
		
		char[] tab = new char[str.length()];
		
		int c = 0;
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			tab[c] = str.charAt(i);
			c++;
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			StdOut.print(tab[i] + " ");
		}
	}

}
