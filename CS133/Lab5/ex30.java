package cs.lab8;

public class ex30 {
	 int m; 
     double n; 
  
    public ex30(int i)    { 
        m = i; 
    } 
  
    public ex30(double d)    { 
        n = d; 
    } 
  
    { 
        System.out.println(m); 
         System.out.println(n); 
    } 
  
    public static void main(String[] args)    { 
        ex30 a1 = new ex30(500); 
         ex30 a2 = new ex30(50.0); 
  
        System.out.println(a1.m+" : "+a1.n); 
         System.out.println(a2.m+" : "+a2.n); 
    } 
} 
