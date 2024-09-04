package chTenExTwo;

public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    // exercise 2 & 3
    public void calcDiscount() {
        switch (custType) {
            case CORP:
                if (total > 500) {
                    discount = 8;
                } else {
                    discount = 5;
                }
                break;
            case PRIVATE:
                if (total > 900) {
                    discount = 7;
                } else {
                    discount = 0;
                }
                break;
            case NONPROFIT:
                if (total > 900) {
                    discount = 10;
                } else {
                    discount = 5;
                }
                break;
        }
    }
}
