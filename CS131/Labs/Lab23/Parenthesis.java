import java.util.Scanner;

public class Parenthesis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter input: ");
		String str = scanner.nextLine();

		CStack stack = new CStack(str.length());
		
		int op = 0, cl = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			if (!stack.isEmpty()) 
			{
				if (str.contains("[") || str.contains("(") || str.contains("{")) 
				{
					op++;
				} else {
					System.out.print("Wrong input entered.");
					break;
				}

				if (str.contains("]") || str.contains(")") || str.contains("}")) 
				{
					cl++;
				} else {
					System.out.print("Wrong input entered.");
				}
			}
		}
	}
}
