import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        int previousNumber = Integer.MIN_VALUE;
        int currentNumber; 
        
		while(true) {
			System.out.print("Input number: ");
			currentNumber = scanner.nextInt();
			
			if(currentNumber < previousNumber) {
				break;
			}
			previousNumber = currentNumber;
		}
		System.out.print("\nBYE BYE");
	}

}
