// This class creates a Greeter object
// that displays a hello message
// in a dialog box.
import javax.swing.JOptionPane;
public class Greeter2
{
    public void sayHello()
    {
        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
