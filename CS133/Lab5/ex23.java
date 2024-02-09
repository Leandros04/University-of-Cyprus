package cs.lab8;

class ex23 {
	String s; 
	  
    { 
        s = "FIRST"; 
    } 
  
    { 
        s = "SECOND"; 
    } 
  
    public ex23(){ 
        s = "THIRD"; 
    } 
  
    public ex23(String s) { 
        this(); 
  
        System.out.println(this.s); 
    } 
} 
  
public class ClassTwo{ 
    public static void main(String[] args) { 
        ex23 one = new ex23("LAST"); 
    } 
} 
