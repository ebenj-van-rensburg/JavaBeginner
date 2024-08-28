package ChFiveExTwo;

public class ShopCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Eben";
        String message;
        //Declare and initialize the items String array
        String[] itemList = {"Sword", "Dagger", "Shield", "Pauldron"};
        // Change message to show the number of items purchased.
        message = custName + " wants to buy " + itemList.length + " items";
        System.out.println(message);
        // Print an element from the items array.
        System.out.println(itemList[4]);
    }
}
