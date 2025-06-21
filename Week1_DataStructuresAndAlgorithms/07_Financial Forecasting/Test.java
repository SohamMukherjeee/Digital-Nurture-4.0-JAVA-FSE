import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Financial Forecasting--------------------------");
        System.out.println("Enter the Principle amount: ");
        double PrincipalAmount = sc.nextDouble();

        System.out.println("Enter the rate of return: ");
        double rateOfReturn = sc.nextDouble();

        System.out.println("Enter the Time period(years): ");
        int timePeriod = sc.nextInt();
        
        double ans=FinancialForecast.futureAmount(PrincipalAmount,rateOfReturn,timePeriod);
        System.out.println("The principle amount "+PrincipalAmount+" after "+timePeriod+" years will be: "+ ans);

    }
}
