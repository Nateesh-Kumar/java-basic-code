import java.util.Scanner;

public class harmonicseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("The sum of the Harmonic Series up to %d terms is: %.2f%n", n, sum);
    }
}
