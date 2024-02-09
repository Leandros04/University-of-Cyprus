import java.util.Scanner;

public class Palindrome {
	public static boolean palindrome(String str)
	{
		if(str.length() <= 1)
			return true;
		if(str.charAt(0) != str.charAt(str.length() - 1))
			return false;
		return palindrome(str.substring(1, str.length() - 1));
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		System.out.println("Is " + str + " a palindrome?\t" + palindrome(str));
	}
}
