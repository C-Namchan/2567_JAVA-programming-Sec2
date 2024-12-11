import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		
		//Declare Variable text to merge the texts
		String txtConcate = "";
		
		//Declare Variable name word to receive text from console
		String word;
		
		while(true) {
			System.out.print("Enter word: ");
			word = type.next();
			
			//check condition to stop receive the text
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Progeam Terminate");
				break;
			}
			//find sum
			txtConcate += word + " ";
		}
		
		System.out.println(txtConcate.toUpperCase());
		type.close();
	}

}
