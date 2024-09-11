import javax.swing.*;

public class DialogApp {

    public static void main(String[] args) {
        try {
            String s;
            s = JOptionPane.showInputDialog("Enter an integer:");
            int x = Integer.parseInt(s);
            System.out.println("You entered " + x + ".");
        }
        catch(NumberFormatException e) {
            System.out.println("You entered " + e.getMessage() + ".");
        }
    }
}
