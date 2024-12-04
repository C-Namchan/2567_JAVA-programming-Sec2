import javax.swing.*;
import java.text.DecimalFormat;
public class Lab105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,###.00000");
		//tax
		final double TAX_RATE = 0.0625;
		//input dialog box
		String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order \nPlease enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		String cdprices = JOptionPane.showInputDialog("Please enter the price of CD in U.S dollars");
		double cdPrice = Double.parseDouble(cdprices);
		String cdQuanity = JOptionPane.showInputDialog("Please enter the qunity to be puchased");
		int cdQua = Integer.parseInt(cdQuanity);
		
		//CD calculation
		double cdsubTotal =	cdPrice * cdQua;
		double cdTotal = cdsubTotal * (1+TAX_RATE);
		
		
		//show Dialog
		JOptionPane.showMessageDialog(null,"Summary of the transaction:"+"\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+
				"\nCD Unit Price: $"+cdprices+"\nCD Quanity: "+ cdQuanity +"\n\nSubtotal: "+ cdsubTotal+"\nTax rate: 6.25% "
				 + "\nTotal: $" + df.format(cdTotal)+"\n\nEnd of Program");
	}

}
