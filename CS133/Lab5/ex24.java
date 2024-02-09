package cs.lab8;

class ex24 {
	static    { 
        System.out.println('A'); 
    } 
  
    static char c = 'Z'; 
  
    static char getC()    { 
        return c; 
    } 
} 
public class ClassTwo{ 
    { 
        System.out.println('B'); 
    } 
  
    public static void main(String[] args)    { 
        char c; 
         c = ex24.getC(); 
         System.out.println(c); 
    } 
} 

