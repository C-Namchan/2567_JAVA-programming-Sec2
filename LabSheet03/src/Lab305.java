import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		//declare input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input some sentence: ");
		String senTence = input.nextLine();
		
		//. end detector
		while(!senTence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			senTence =input.nextLine();
		}	
		//space
		System.out.println();
		
		
		for (int i = 0;	i<senTence.length(); i++) {
			//pull word from index 'i'
			char alphabet = senTence.charAt(i);
			
			//check space and show
			if (alphabet==' ') {
				System.out.println();
			}else {
				System.out.print(alphabet);
			}
		}
		
	}

}