package forecasting;

public class Main {

    public static void main(String[] args) {
        double initialInvestment = 1000.0;
        double annualGrowthRate = 0.05; // 5%
        int numberOfYears = 10;

        System.out.println("--- Recursive Financial Forecasting ---");
        System.out.println("Initial Investment: $" + initialInvestment);
        System.out.println("Annual Growth Rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Number of Years: " + numberOfYears);

        double futureValue = FinancialForecaster.calculateFutureValueRecursive(initialInvestment, annualGrowthRate, numberOfYears);
        System.out.printf("Future Value after %d years: $%.2f\n", numberOfYears, futureValue);

        System.out.println("\n--- Testing with different values ---");
        initialInvestment = 5000.0;
        annualGrowthRate = 0.07;
        numberOfYears = 5;
        System.out.println("Initial Investment: $" + initialInvestment);
        System.out.println("Annual Growth Rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Number of Years: " + numberOfYears);
        futureValue = FinancialForecaster.calculateFutureValueRecursive(initialInvestment, annualGrowthRate, numberOfYears);
        System.out.printf("Future Value after %d years: $%.2f\n", numberOfYears, futureValue);
    }
}

