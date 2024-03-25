import java.util.ArrayList;

public class Customer extends Person {

    private String customer_number = "";
    private ArrayList<TravelPacket> customer_packets = new ArrayList<TravelPacket>();

    //Set Methods
    public void setCustomerNumber(String customer_number) {
        this.customer_number = customer_number;
    }
    public void addPacket(TravelPacket paket){
        customer_packets.add(paket);
    }

    //Get Methods
    public String getCustomerNumber() {
        return customer_number;
    }
    public void getPacket(){
        for (TravelPacket customerPacket : customer_packets) {
            System.out.println(customerPacket);
        }
    }

    // Void Methods

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("ID: " + getID());
        System.out.println("Age: " + getAge());
    }

    // Overrides
    @Override
    public String toString() {
        return getCustomerNumber() + ": " + getID() + ", " + getName() + ", " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return getID().equals(customer.getID()) && getCustomerNumber().equals(customer.getCustomerNumber());
        }
        return false;
    }

    //Constructors
    public Customer(String ID) {
        super(ID);
    }

    public Customer(String ID, String customer_number) {
        super(ID);
        this.customer_number = customer_number;
    }

    public Customer(String ID, String name, String surname) {
        super(ID, name, surname);
    }

    public Customer(String ID, String name, String surname, String customer_number) {
        super(ID, name, surname);
        this.customer_number = "K" + customer_number;
    }
}
