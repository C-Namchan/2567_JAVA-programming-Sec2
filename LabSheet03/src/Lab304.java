import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Full name: ");
		String fullName=input.nextLine();
		
		//space detector
		int spaceVacancy = fullName.indexOf(" ");
		
		if(spaceVacancy == -1) {
			System.out.println("Incorrect Name");
			
		}else {
			String firstName =fullName.substring(0,spaceVacancy);
			String lastName = fullName.substring(spaceVacancy + 1);	
		
			firstName = firstName.toUpperCase();
			lastName = lastName.toLowerCase();
			
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
		}
		
	}
	
}