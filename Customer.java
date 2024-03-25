public class Customer extends Person {

    private String customer_number = "";

    //Set Methods
    public void setCustomerNumber(String customer_number) {
        this.customer_number = customer_number;
    }

    //Get Methods
    public String getCustomerNumber() {
        return customer_number;
    }

    // Void Methods

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("ID: " + getID());
        System.out.println("Age: " + getAge());
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
        this.customer_number = customer_number;
    }

    // Overrides
    @Override
    public String toString() {
        return getCustomerNumber() + ": " + "ID: " + getID() + ", Name: " + getName() + ", Surname: " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return getID().equals(customer.getID()) && getCustomerNumber().equals(customer.getCustomerNumber());
        }
        return false;
    }
}
