package chSevenExTwo;

public class ShopCart  {
    public static void main (String[] args){
        String custName = "Eben Janse van Rensburg";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
        // Get the index of the space character (" ") in custName.
        spaceIdx = custName.indexOf(" ");
        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        //Instantiate and initialize sb to firstName.
        sb = new StringBuilder(firstName);
        // Put the full name back together, using StringBuilder append method.
        sb.append(custName.substring(spaceIdx));
        // Print the full name.
        System.out.println(sb);
    }
}
