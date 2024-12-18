import java.util.*;

public class Lab306 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//count word
		int word = 0;	
		
		System.out.print("Message : ");
		String cenTence = input.nextLine();
		
		if(cenTence.indexOf("Nichi"	)>=0) {
			
			String[] splitword = cenTence.split(" ");
			for(int i=0;i< splitword.length ;i++)
			{
				word++;
			}
			System.out.print("Nichi is a sentence and the number of message is: " + word);
		}else {
			System.out.print(cenTence);
		}

	}

}