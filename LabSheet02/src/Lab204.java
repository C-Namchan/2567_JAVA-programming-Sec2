import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		
		//input X and Y
		System.out.print("Input value of X:" );
		int x = scanner.nextInt();
		
		int y;
		do {
            System.out.print("Input value of Y: ");
            y = scanner.nextInt();
            if (y < x) {
                System.out.println("Input value of Y, again: ");
            }
        } while (y < x);
		
		//calculate sum
		int sum = x;
		int current = x;
		
		while(current<y) {
			System.out.println(current + "+" +(current+1)+ "=" + (sum+(current +1)));//current value + current value + 1 before before calculate the sum
																					
			sum += (current +1); //add sum
			current +=1; //add count
		}
			
	}

}
