import javax.swing.*;

public class Lab401 {
	
	//main Method.
	
	public static void main(String[] args) {
		
		inputEmail();
		
		//end of main() Method.
	}
	public static void inputEmail() { //'static' is use for not to create an object
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(varEmail != null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
			}else {
				JOptionPane.showMessageDialog(null,"E-mail cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y]:");
		}while(ans != null && ans.equalsIgnoreCase("y"));
	
	}//end of inputEmail() Method
	
	
	public static boolean checkEmailError(String email) {
		/*while(email.startsWith("@")|| email.contains(" ")) {
			email =JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail againl: ");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(email));
	}//end of checkEmailError method
	public static boolean checkEmail (String email);
	if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
		return true;
	}else {
		return false;*/
		return email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
	}
}

