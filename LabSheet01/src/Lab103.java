import javax.swing.*;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parkMinute = JOptionPane.showInputDialog("Input Time Parking (minute):");
		int parkingMinute = Integer.parseInt(parkMinute);
		
		int hour = parkingMinute / 60;
		int	remainMinute = parkingMinute % 60;
		double parkHourPrice = hour * 50;
		double parkMinutePrice = remainMinute * 0.25;
		double parkingPrice = parkMinutePrice + parkHourPrice;
		String frmparkingPrice = String.format("%,.2f",parkingPrice);
		JOptionPane.showMessageDialog(null,"Your parking " + hour +" hour " + remainMinute +" minute."+
		"\nAmount to be paid is " + parkingPrice + " Bath.");

	}

}
