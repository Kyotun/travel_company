public class Person {
    private String name = "";
    private String surname = "";
    private String ID = "";
    private int age = 0;

    //Set Methods
    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAlter(int age){
        this.age = age;
    }

    public void setPersonData(String ID, String name, String surname, int age){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    //Get Methods
    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getID(){
        return this.ID;
    }


    // Constructors
    public Person(String ID){
        this.ID = ID;
    }

    public Person(String ID, String name){
        this(ID);
        this.name = name;
    }
    
    public Person(String ID, String name, String surname){
        this(ID, name);
        this.surname = surname;
    }
}
