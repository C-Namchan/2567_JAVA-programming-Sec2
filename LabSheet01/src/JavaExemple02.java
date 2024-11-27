import javax.swing.*;
public class JavaExemple02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show and receive Dialog box
		String productName =JOptionPane.showInputDialog("Input Product Name: ");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""
				+ "Input Price per Unit"));
		
		double TotalPriceofProduct = productUnit * productPrice;
		double TotalwithVat = TotalPriceofProduct * 1.07;
		String frmtotalPriceofProduct = (String.format"%,.2f",TotalPriceofProduct);
		string frmtotalPriceofProduct = String.Format
		//display to dialog box
		JOptionPane.showInputDialog(null, "Total Price is: " + TotalPriceofProduct + " baht." +"\nAdd VAT7% is " +
		TotalwithVat + " baht.");
		
	
		
	}

}
