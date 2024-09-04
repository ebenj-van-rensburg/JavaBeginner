package chTenExTwo;

public class ShopCart {
    public static void main(String[] args){
        Order order = new Order("Rick Wilson", 510.00, "VA", Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
