import java.util.ArrayList;

public class ShopCart {
    public static void main(String[] args){
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> cart = new ArrayList<>();
        cart.add("BMW");
        cart.add("Audi");
        cart.add("Ford");

        System.out.println(cart);
        // add (insert) another element at a specific index
        cart.add(1, "Subaru");
        System.out.println(cart);
        // Check for the existence of a specific String element.
        //   If it exists, remove it.
        if (cart.contains("Subaru")){
            cart.remove("Subaru");
        }
        System.out.println(cart);
    }
}
