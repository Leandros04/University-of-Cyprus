import java.util.Scanner;

public class Reverse {
	
	public static void rev(int i)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number " + i + ": ");
		int n = scanner.nextInt();
		
		if(n == 0) {
			System.out.print("The numbers in reverse order are: ");
			return;
		}else {
			rev(i + 1);
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		int n = 0; 
		
		do {
			rev(n);
		}while(n != 0);
	}
}
