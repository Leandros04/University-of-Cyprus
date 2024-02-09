
public class MyInteger {
	
	int value;
	
	public MyInteger(int value)
	{
		value = this.value;
	}
	
	public int getInt(int value)
	{
		return this.value;
	}
	
	public boolean isEven()
	{
		if(this.value % 2 == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isEven(int value)
	{
		if(value % 2 == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static boolean isEven(MyInteger value)
	{
		if(value.value % 2 == 0)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public static boolean isOdd(int value)
	{
		if(value % 2 != 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if(this.value % 2 != 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger value)
	{
		if(value.value % 2 != 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static boolean isPrime(int value)
	{
		if(value % 1 == 0 && value % value == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger value)
	{
		if(value.value % value.value == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		if(this.value % 1 == 0 && this.value % this.value == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}

	public static String parseInt(String s) {
		
		return String.valueOf(s);
	}
}
