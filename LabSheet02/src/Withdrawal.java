import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)* 100000;
		DecimalFormat frm = new DecimalFormat("#,###,###");
		
		//System.out.println(balance);
		int moneywithdraw =Integer.parseInt(JOptionPane.showInputDialog("Your balance: "+frm.format(balance)+"\nInput money to withdraw"));
		
		if(moneywithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneywithdraw > 50000 ) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 50,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneywithdraw% 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw "+(moneywithdraw%100)+" bath.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null,"You withdraw "+ frm.format(moneywithdraw) + " bath." + "\n1000 = "+(moneywithdraw/1000)
					+"\n500 = "+frm.format(((moneywithdraw%1000)/500)) + "\n100 = "+ frm.format(((moneywithdraw%500)/100)));
		}
	}

}
