package cs.fibonacci;

public class Fibonacci 
{
	 public static long fibonacci(int num) {
		 switch (num) 
		 {
		 	case 0: 
		 		return 0;
		 	case 1: 
		 		return 1;
		    default:
		    	return fibonacci(num - 1) + fibonacci(num - 2);
		 }
	 }
	 
	 public static void main(String[] args)
	 {
		 System.out.println(fibonacci(20));
	 }
}
