public class FinancialForecast {
        public static double futureAmount(double PrincipalAmount, double rateOfReturn, int timePeriod) {
        if (timePeriod == 0) {
            return PrincipalAmount;
        }
        return futureAmount(PrincipalAmount, rateOfReturn, timePeriod - 1) * (1 + rateOfReturn);
    }

}