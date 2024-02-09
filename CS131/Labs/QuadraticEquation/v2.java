import java.util.Scanner;

public class v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quadratic equation (e.g., ax^2 + bx + c = 0): ");
        String equation = scanner.nextLine();

        String[] terms = equation.split("\\s*[+=]\\s*");
        double a = 0, b = 0, c = 0;

        for (String term : terms) {
            if (term.endsWith("x^2")) {
                a = Double.parseDouble(term.replace("x^2", ""));
            } else if (term.endsWith("x")) {
                b = Double.parseDouble(term.replace("x", ""));
            } else {
                c = Double.parseDouble(term);
            }
        }

        double D = (b * b) - 4 * a * c;
        double x1 = 0, x2 = 0;

        if (D < 0) {
            System.out.print("D < 0 ==> No roots found.");
        } else if (D == 0) {
            System.out.println("D = 0 ==> One real root found.");
            x1 = -b / (2.0 * a);
        } else {
            System.out.println("D > 0 ==> Two real roots found.");
            x1 = (-b + Math.sqrt(D)) / (2.0 * a);
            x2 = (-b - Math.sqrt(D)) / (2.0 * a);
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("D: " + D);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        
        scanner.close();
    }
}
