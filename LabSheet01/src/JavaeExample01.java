import java.util.*; 
import java.text.*;
public class JavaeExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//marked object to receive data on keyboard
		Scanner input = new Scanner(System.in);//receive data name kub
		DecimalFormat frm = new DecimalFormat("#,###,00");
		System.out.print("Input product nane: ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();
		float TotalPriceofProduct = productUnit * productPrice;
		System.out.println("Total price is " +TotalPriceofProduct + frm.format(TotalPriceofProduct) +" bath.");
		
		float TotalwithVat = TotalPriceofProduct + (TotalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is " +TotalwithVat + frm.format(TotalwithVat) +" bath.");
		System.out.println();
		String frmTotalWithVat = String.format("#,2t");
		System.out.println("Output using Sring.format");
		System.out.println("Add VAT 7% is "+ frm.format(TotalwithVat) +" bath.");
		
		input.close(); //close the object
	}

}
