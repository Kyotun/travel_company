public class Customer extends Person{

    private String customer_number = "";

    @Override
    public String toString(){
        return getCustomerNumber() + ": " + "ID: " + getID() + ", Name: " + getName() + ", Surname: " + getSurname();
    }

    //Set Methods
    public void setCustomerNumber(String customer_number){
        this.customer_number = customer_number;
    }

    //Get Methods
    public String getCustomerNumber(){
        return customer_number;
    }

    //Constructors
    public Customer(String ID){
        super(ID);
    }

    public Customer(String ID, String customer_number){
        super(ID);
        this.customer_number = customer_number;
    }

    public Customer(String ID, String name, String surname){
        super(ID, name, surname);
    }

    public Customer(String ID, String name, String surname, String customer_number){
        super(ID, name, surname);
        this.customer_number = customer_number;
    }
}
