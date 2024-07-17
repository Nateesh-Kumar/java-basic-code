import java.util.Scanner;

public class quadeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("There are no real solutions.");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("The solutions are x1 = %.2f and x2 = %.2f%n", x1, x2);
        }
    }
}

