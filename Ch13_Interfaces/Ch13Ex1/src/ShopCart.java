import java.util.ArrayList;
import java.util.Arrays;

public class ShopCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        // Convert the days array into an ArrayList
        ArrayList<String> daysList = new ArrayList<>(Arrays.asList(days));
        // Loop through the ArrayList, printing out "sunday" elements in
        //   upper case (use toUpperCase() method of String class)
        // Print all other days in lower case
        for (String day : daysList){
            if (day.equals("sunday")){
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day);
            }
        }
        // Print out the ArrayList
        System.out.println(daysList);
    }
}
