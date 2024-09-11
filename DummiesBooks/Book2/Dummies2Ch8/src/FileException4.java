import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException4 {
    public static void main(String[] args) {
            try {
                openFile("c:\test.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
    public static void openFile(String file) throws FileNotFoundException {
            FileInputStream f = new FileInputStream(file);
    }
}
