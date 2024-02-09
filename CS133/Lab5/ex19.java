package cs.lab8;

public class ex19 {
	static int i = 10; 
    int j = 100; 
 
   { 
       methodOne(); 
        i = 100; 
        j = 10; 
   } 
 
   void methodOne() { 
       System.out.println("i = "+i); 
        System.out.println("j = "+j); 
   } 
   public static void main(String[] args) { 
       ex19 a = new ex19(); 
        a.methodOne(); 
   } 
} 
