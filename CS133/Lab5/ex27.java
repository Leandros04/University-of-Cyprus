package cs.lab8;

public class ex27 {
	 String s; 
	  
	    public ex27()    { 
	        this("It's not me"); 
	         System.out.println('A'); 
	         System.out.println(s); 
	    } 
	  
	    ex27(String  s)    { 
	        System.out.println('B'); 
	         System.out.println(this.s); 
	         this.s = s; 
	    } 
	  
	    { 
	        System.out.println('C'); 
	         System.out.println(s); 
	         this.s = "ABCD"; 
	    } 
	  
	    public static void main(String[] args)    { 
	        ex27 a1 = new ex27(); 
	         ex27 a2 = new ex27("It's me"); 
	    } 
	} 
