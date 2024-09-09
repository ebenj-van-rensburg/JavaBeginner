// import statements here:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShopCart {
    public static void main(String[] args){
        // Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate = LocalDateTime.now();
        // Initialize the orderDate to the current date and time. Print it.
        System.out.println(orderDate);
        // Format orderDate using ISO_LOCAL_DATE; Print it.
        orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(orderDate);
    }
}
