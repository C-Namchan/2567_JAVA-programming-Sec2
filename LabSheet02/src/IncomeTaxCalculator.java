import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your taxable income: ");
        int taxableIncome = scanner.nextInt();

        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        
        
        double tax = 0;

        if (taxableIncome > 20000) {
            tax += (taxableIncome - 20000) * TAX_RATE_ABOVE_20K; 
            taxableIncome = 20000;
        }
        else if (taxableIncome > 40000) {
            tax += (taxableIncome - 40000) * TAX_RATE_ABOVE_40K; 
            taxableIncome = 40000;
        }
        
        else if (taxableIncome > 60000) {
            tax += (taxableIncome - 60000) * TAX_RATE_ABOVE_60K; 
            taxableIncome = 60000;
        }
       
        
        System.out.printf("Total tax to pay: $%.2f\n", tax);
	}
}