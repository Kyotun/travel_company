import java.util.ArrayList;
public abstract class Person {
    private String name = "";
    private String surname = "";
    private String ID = "";
    private int age = 0;

    // Void Methods
    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("ID: " + getID());
    }

    public static void printSize(ArrayList<? extends Person> list){
        System.out.println(list.size());
    }

    // Bool Methods

    @Override
    public boolean equals(Object obj){
        Person p = (Person) obj;
        return getID().equals(p.getID());
    }

    public static boolean idController(String id){
        return id.charAt(0) != '0' && Character.isDigit(id.charAt(0)) && Character.isDigit(id.charAt(1)) && Character.isDigit(id.charAt(2)) && Character.isDigit(id.charAt(3))
                && Character.isDigit(id.charAt(4)) && Character.isDigit(id.charAt(5)) && Character.isDigit(id.charAt(6)) && Character.isDigit(id.charAt(7)) &&
                Character.isDigit(id.charAt(8)) && Character.isDigit(id.charAt(9)) && Character.isDigit(id.charAt(10));
    }

    public static boolean nameController(String n){
        int l = n.length();
        if(l > 2){
            for(int i = 0; i < l; i++){
                char p = n.charAt(i);
                if ( p == ' ' || p == '.' || (p <= 90 && p >= 65) || (p <= 122 && p >= 97) ){
                    continue;
                } else {
                    System.out.println("Please give just whitespaces and letters.");
                    return false;
                }
            }
            return true;
        } else{
            System.out.println("Entry should be longer than 2 characters.");
            return false;
        }
    }

    //Set Methods
    public void setName(String name){
        if(nameController(name)){
            this.name = name;
        }
    }

    public void setSurname(String surname){
        if(nameController(name)){
            this.surname = surname;
        }
    }

    public void setID(String ID) {
        if(idController(ID)){
            this.ID = ID;
        } else{
            throw new BadIDFormat("ID cannot start with '0' and should contain 11 number.");
        }
    }

    public void setAge(int age){
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
