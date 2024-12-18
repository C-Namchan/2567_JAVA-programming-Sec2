import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullname;
		String firstName;
		
		System.out.println("Please enter your name, seperated a space.");
		System.out.print(":");
		fullname = input.nextLine();
		
		int space = fullname.indexOf(' '); //find space bar
		firstName = fullname.substring(0,space);//first name
		
		//to get the middle name
		System.out.println(abbreviantName(fullname)+firstName);
		
		input.close();
	}//end main method
	public static String abbreviantName(String fName) {
		String initailLetter="";
		
		for(int i =0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				initailLetter =(initailLetter+fName.charAt(i+1)).toUpperCase();
				initailLetter = initailLetter + ".";
			}
		}
		return initailLetter;
	}

}
