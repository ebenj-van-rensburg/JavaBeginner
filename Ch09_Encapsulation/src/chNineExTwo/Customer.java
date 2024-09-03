package chNineExTwo;

public class Customer {
    private String name;
    private String ssn;
    // Encapsulate this class.  Make ssn read only.
    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {return name;}
    public void setName(String newName) {this.name = newName;}

    public String getSsn() {return ssn;}
}
