package cs.lab8;

class ex28 {
	int i = 50; 
	} 
	  
	class Y{ 
	    int i = 100; 
	    ex28 x; 
	} 
	  
	public class MainClass{ 
	    public static void main(String[] args)    { 
	        ex28 x = new ex28(); 
	         Y y = new Y(); 
	         y.x = x; 
	         System.out.println(x.i); 
	         System.out.println(y.i); 
	         System.out.println(y.x.i); 
	    } 
	} 
