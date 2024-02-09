
public class ask3 {

	public static void main(String[] args) {
		String str = StdIn.readString();
		
		char encrypted[] = new char[str.length()];
		char decrypted[] = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++)
		{
			encrypted[i] = (char)((str.charAt(i) - 'A' + 2) % 26 + 'A');
		}
		
		for(int i = 0; i < encrypted.length; i++)
		{
			int ch = encrypted[i] - 'A' -2;
			
			if(ch < 0)
			{
				decrypted[i] = (char)(ch + 26 + 'A');
			}else
			{
				decrypted[i] = (char)(ch + 'A');
			}
		}
		
		for(int i = 0; i < str.length(); i++) 
		{
			StdOut.print(encrypted[i]);
		}
		
		StdOut.println();
		
		for(int i = 0; i < str.length(); i++)
		{
			StdOut.print(decrypted[i]);
		}
	}

}
