
public class ask1 {

	public static void main(String[] args) 
	{
		String str; 
		int c = 0;
		String[] words = new String[110];
		int[] apprnces = new int[110];
		
		boolean exist = false;
		
		int maxc = 0;
		int maxw = 0;
		int i = 0;
		
		while(!StdIn.isEmpty())
		{
			str = StdIn.readString();
			
			for(i = 0; i < c; i++)
			{
				if(str.equals(words[i]))
				{
					exist = true;
					break;
				}
			}	
			
			if(exist)
			{
				apprnces[i]++;
					
			}else 
			{
				words[c] = str;
				apprnces[c]++;
				c++;
			}
				
			if(apprnces[i] > maxc)
			{
				maxc = apprnces[i];
				maxw = i;
			}
		}
	}

}
