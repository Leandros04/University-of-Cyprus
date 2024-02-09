package cs.lab2;

public class TestQuadratic {

	public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation(1, -3, 2);
        equation1.findRoots(); 

        QuadraticEquation equation2 = new QuadraticEquation(1, 2, 1);
        equation2.findRoots(); 
        
        QuadraticEquation equation3 = new QuadraticEquation(1, 1, 1);
        equation3.findRoots(); 
    }
}
