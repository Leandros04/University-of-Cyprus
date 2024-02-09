package cs.lab8;

class ex22 {
	{ 
        System.out.println(1); 
    } 
  
    static { 
        System.out.println(2); 
    } 
  
    public ex22(int i){ 
        System.out.println(3); 
    } 
  
    public ex22(){ 
        System.out.println(4); 
    } 
} 
public class ClassTwo { 
    { 
        System.out.println(5); 
    } 
  
    public static void main(String[] args){ 
        System.out.println(6); 
         ex22 one = new ex22(); 
         ex22 two = new ex22(10); 
    } 
} 

