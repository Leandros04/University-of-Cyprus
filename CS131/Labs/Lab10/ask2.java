
public class ask2 {

	public static void main(String[] args) {
		String str = StdIn.readString();
		String str2 = "";
		
		int c = 0;
		
		for(int i = 1; i < str.length(); i++)
		{
			if(str.charAt(i) == str.charAt(i-1))
			{
				c++;
			}else if(c != 1)
			{
				str2 += c + str.charAt(i-1);
			}else
			{
				str2 += str.charAt(i-1);
			}
			c = 1;
			
			if(c != 1)
			{
				str2 += c + str.charAt(i-1);
			}else
			{
				str2 += str.charAt(i-1);
			}
		}
	}
}









