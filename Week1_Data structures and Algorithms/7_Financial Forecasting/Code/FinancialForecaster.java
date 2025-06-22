import java.util.Scanner;

public class FinancialForecaster {

    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter the annual growth rate (e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(initialAmount, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}