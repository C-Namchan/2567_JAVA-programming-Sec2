import javax.swing.*;

public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
		
		//input dialog box
		String employeeName = JOptionPane.showInputDialog("Enter employee name");
		String workingHour = JOptionPane.showInputDialog("enter total hours for this employee");
		double workHours = Double.parseDouble( workingHour);
		
		//gross calculation
		final double hourlyWage = 7.5;
		double grossEarnings = workHours * 7.5;
		
		//net calculation
		final double taxrate = 0.15;
		double tax = grossEarnings * taxrate;
		double highSpeedNet = grossEarnings - tax;
		

		//show Dialog
		JOptionPane.showMessageDialog(null,"Employee name: "+ employeeName+"\nHours worked:"+ workingHour +
				"\nHourly wage:$ "+ hourlyWage + "\nGross earnings:$ "+ grossEarnings + "\nTax rate: " + taxrate+
				"\nTax:$ "+ tax + "\nNet earnings:$ "+highSpeedNet 	);

	}

}
