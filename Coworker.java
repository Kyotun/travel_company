public class Coworker extends Person{
    private String user_number= "";

    // Get Methods
    public String getUserNumber(){return this.user_number;}

    // Set Methods
    public void setUserNumber(String user_number){this.user_number= user_number;}

    // Void Methods
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("ID: " + getID());
        System.out.println("Age: " + getAge());
        System.out.println("User Number: " + getUserNumber());
    }

    @Override
    public String toString(){
        return getUserNumber() + ": " + "ID: " + getID() + ", Name: " + getName() + ", Surname: " + getSurname();
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof  Coworker) {
            Coworker coworker = (Coworker) obj;
            return getID().equals(coworker.getID()) && getUserNumber().equals(coworker.getUserNumber());
        }
        return false;
    }

    //Constructors
    public Coworker(String ID){
        super(ID);
    }
    public Coworker(String ID, String user_number) {
        super(ID);
        this.user_number = user_number;
    }
    public Coworker(String ID, String name, String surname){
        super(ID, name, surname);
    }
    public Coworker(String ID, String name, String surname, String user_number){
        super(ID, name, surname);
        this.user_number = "W" + user_number;
    }
}
