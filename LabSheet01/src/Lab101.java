import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product nane: ");
		String productName = input.nextLine();
		
		System.out.print("Input Product Unit: ");
		int ProductUnit = input.nextInt();
		
		System.out.print("Input Price Per Unit: ");
		int ProductPrice = input.nextInt();
		
		double totalPriceofProduct = ProductUnit * ProductPrice;
		
		System.out.println("----------------------------------");
		System.out.print("Total Price is "+ totalPriceofProduct+ " bath." );
		System.out.println("\n----------------------------------");
		
		double Discount = totalPriceofProduct - (totalPriceofProduct*15/100);
		double totalPrice = totalPriceofProduct - Discount;
		System.out.print("How many discount (%) : ");
		double Discount15 = input.nextInt();
		System.out.println("----------------------------------");
		
		System.out.println("Discount from 15%\t"+frm.format(totalPrice) + " bath.");
		System.out.print("Amount to be paid\t"+ frm.format(Discount)+" bath.");
		
	}

}
