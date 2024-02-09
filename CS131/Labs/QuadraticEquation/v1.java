import java.util.Scanner;

public class v1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0, c = 0;
        double D = 0;
        double x1 = 0, x2 = 0;

        System.out.print("Enter a, b and c (Space in Between): ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        D = (b * b) - 4 * a * c;

        System.out.printf("D: %.3f%n", D);

        if (D < 0) {
            System.out.print("D < 0 ==> No roots found.");
        } else if (D == 0) {
            System.out.println("D = 0 ==> One real root found.");
            x1 = -b / (2.0 * a);
            System.out.printf("x1: %.3f%n", x1);
            System.out.print("\tRounded: " + Math.round(x1));
        } else {
            System.out.println("D > 0 ==> Two real roots found.");
            x1 = (-b + Math.sqrt(D)) / (2.0 * a);
            x2 = (-b - Math.sqrt(D)) / (2.0 * a);
            System.out.printf("x1: %.3f%n", x1);
            System.out.print("\tRounded: " + Math.round(x1));
            System.out.printf("\nx2: %.3f%n", x2);
            System.out.print("\tRounded: " + Math.round(x2));
            
            scanner.close();
        }
    }
}
