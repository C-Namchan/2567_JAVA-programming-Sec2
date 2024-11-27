import java.util.*;
import java.text.*;
public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int time = input.nextInt();
		int hour = time/60;
		int day = hour /60;
		int year = day/365;
		int other = year%365;
		System.out.print(time +" minutes is approximately "+year+"years and "+day+"days");

	}

}
