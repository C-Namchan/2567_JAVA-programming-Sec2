import javax.swing.*;
 
public class Lab506 {
    public static void main(String[] args)
    {
        
        String[] message = {"Good Morning", "Good Afternoon", "Good Evening" , "Good Night"};
        String messageOutput = "";
 
        for (String _message : message) {
        	messageOutput += "- " + _message + "\n";
        }
 
        JOptionPane.showMessageDialog(null, "The greeting words in English:" + "\n" + messageOutput);
 
    }
}