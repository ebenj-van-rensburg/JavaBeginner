package chNineExTwo;

public class ShopCart {
    public static void main(String[] args) {
        // Declare, instantiate, and initialize a Customer object
        Customer customer = new Customer("Eben", "123-456-7890");
        // Print the customer object name
        System.out.println(customer.getName());
        customer.setName("Bobert");
        System.out.println(customer.getName());

        System.out.println(customer.getSsn());
        // cannot set the ssn, it is private and has no public method
    }
}
