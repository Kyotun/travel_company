public class Coworker extends Person{
    private String user_number= "";

    //Get Methods
    public String getUsernumber(){
        return this.user_number;
    }

    //Set Methods
    public void setUsernumber(String user_number){
        this.user_number= user_number;
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
        this.user_number = user_number;
    }
}
