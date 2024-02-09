package cs.lab8;

public class ex14 {
	 static void methodOne(int[] a) { 
	        int[] b = new int[5]; 
	         a = b; 
	         System.out.print(a.length); 
	         System.out.print(b.length); 
	    } 
	  
	    public static void main(String[] args) { 
	        int[] a = new int[10]; 
	        methodOne(a); 
	         System.out.print(a.length); 
	    } 
}
