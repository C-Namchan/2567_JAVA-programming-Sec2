import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		int space=0 ,word=0;
		
		String words =JOptionPane.showInputDialog(null,"Input sentense : ");
		
		
		while(!words.endsWith("."))
		{
			JOptionPane.showInputDialog(null,"Input sentense, again : ");
			break;
		}
		
		for(int i=0; i<words.length();i++)
		{
			if(words.charAt(i)==' ')
			{
				space++;
			}
		}
		
		String[] splitword = words.split(" ");
		for(int i=0;i< splitword.length ;i++)
		{
			word++;
		}
		
		JOptionPane.showMessageDialog(null,"This sentence has "+ space +" spacebars. "+"\nThis sentence has "+ word +" words.");
		
	

	}

}