public class Order {
    private double unitPrice;
    private int quantityOrdered;
    // Constructor
    public Order (int u, double p) {
        quantityOrdered = u;
        unitPrice = p;
    }
    public Order (int u) {
        quantityOrdered = u;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }
    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    // Auxiliary methods
    public double getOrderTotal()
    {
        return unitPrice * quantityOrdered;
    }
}
