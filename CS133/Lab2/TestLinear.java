package cs.lab2;

public class TestLinear {

	public static void main(String[] args) {
		int a = 2, b = 4, c = 5, d = 1, e = 8, f = 3;
		
		LinearEquation lin = new LinearEquation(a, b, c, d, e, f);
		
		System.out.println(lin.findX(a, b, c, d, e, f));
		System.out.println(lin.findY(a, b, c, d, e, f));
	}
}
