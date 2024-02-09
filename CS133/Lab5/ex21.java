package cs.lab8;

class ex21 {
	 static int i = 10; 
	  
	    static { 
	        i = 20; 
	    } 
	  
	    public ex21(int i)    { 
	        System.out.println(i); 
	         this.i = i; 
	    } 
	  
	    { 
	        i = 30; 
	    } 
	} 
	public class ClassTwo { 
	    public static void main(String[] args){ 
	        System.out.println(ex21.i); 
	    } 
} 
