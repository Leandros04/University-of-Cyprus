
public class HexValue {
	public static int  hexValue(char ch)
	{
		if(ch >= '0' && ch <='9')
		{
			return ch - '0';
		}
		if(ch >= 'A' && ch <= 'F')
		{
			return ch = 'A' + 10;
		}
	
		if(ch >= 'a' && ch <= 'f')
		{
			return ch - '0' + 10;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		char ch = StdIn.readChar();
		
		StdOut.print(hexValue(ch));
	}

}
