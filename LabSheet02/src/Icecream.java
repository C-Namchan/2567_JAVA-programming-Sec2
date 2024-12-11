import javax.swing.*;
public class Icecream {

	public static void main(String[] args) {
		final int VANILLA = 10;
		final int CHOCOLATE = 15;
		final int TOPPING = 5;
		int iceCreamsoDelicious;
		
		iceCreamsoDelicious =Integer.parseInt(JOptionPane.showInputDialog("[1]Vanila Flavor 10 B.\n[2]Chocolate Flavor 15 B."
				+ "\nPress number to choose flavor:"));
		
		while(iceCreamsoDelicious !=1 && iceCreamsoDelicious !=2) {	
			JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
			
			iceCreamsoDelicious =Integer.parseInt(JOptionPane.showInputDialog("[1]Vanila Flavor 10 B.\n[2]Chocolate Flavor 15 B."
					+ "\nPress number to choose flavor:"));			
	}
		
		int toppingMAI = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",
				JOptionPane.YES_NO_OPTION);
		
		int price =(iceCreamsoDelicious==2 ? CHOCOLATE : VANILLA) + (toppingMAI==1 ? 0 : TOPPING);
		
		
		String flavorchoice = (iceCreamsoDelicious ==1) ? "Vanilla Flavor" : "Chocolate Flavor";
		String topping =(toppingMAI == 1) ? "no topping" : "with topping";
		JOptionPane.showMessageDialog(null, "You chose " + flavorchoice + "\n And " + topping + ".\nTotal price = " + price + " baht.");
		
	} 
}	