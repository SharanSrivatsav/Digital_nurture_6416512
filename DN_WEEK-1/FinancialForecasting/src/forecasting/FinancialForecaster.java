package forecasting;

public class FinancialForecaster {

    /**
     * Recursively calculates the future value of an initial amount given a growth rate and number of periods.
     *
     * @param initialValue The starting value.
     * @param growthRate The growth rate per period (e.g., 0.05 for 5%).
     * @param periods The number of periods to forecast.
     * @return The future value after the specified number of periods.
     */
    public static double calculateFutureValueRecursive(double initialValue, double growthRate, int periods) {
        // Base Case: If no periods are left, the future value is the current initial value.
        if (periods == 0) {
            return initialValue;
        }
        // Recursive Step: Calculate the value for the next period and call the function for the remaining periods.
        else {
            double valueAfterOnePeriod = initialValue * (1 + growthRate);
            return calculateFutureValueRecursive(valueAfterOnePeriod, growthRate, periods - 1);
        }
    }
}

