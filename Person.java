import java.util.ArrayList;
public abstract class Person {
    // Object attributes
    private String name = "";
    private String surname = "";
    private String ID = "";
    private int age = 0;
    private  boolean authorisation;

    //Set Methods
    public void setName(String name){
        if(checkName(name)){
            this.name = name;
        }
    }
    public void setSurname(String surname){
        if(checkSurname(name)){
            this.surname = surname;
        }
    }
    public void setID(String ID) {
        if(checkID(ID)){
            this.ID = ID;
        } else{
            throw new BadIDFormatException("ID cannot start with '0' and should contain 11 number.");
        }
    }
    public void setAge(int age){this.age = age;}
    public void setAuthorisation(boolean authorisation){this.authorisation = authorisation;}
    public void setPersonData(String ID, String name, String surname, int age){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Get Methods
    public int getAge(){return this.age;}
    public String getName(){return this.name;}
    public String getSurname(){return this.surname;}
    public String getID(){return this.ID;}
    public boolean getAuthorisation(){return this.authorisation;}

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
    public Person(String ID, String name, String surname, int age) {
        this(ID, name, surname);
        this.age = age;
    }
    public Person(String ID, String name, String surname, int age, boolean authorisation){
        this(ID, name, surname, age);
        this.authorisation = authorisation;
    }

    // Class methods
    public static void printData(Person p){System.out.println(p.getID() + ", " + p.getName() + ", " + p.getSurname());}
    public static void printSize(ArrayList<? extends Person> list){System.out.println(list.size());}
    public static boolean checkID(String id){
        return id.charAt(0) != '0' && Character.isDigit(id.charAt(0)) && Character.isDigit(id.charAt(1)) && Character.isDigit(id.charAt(2)) && Character.isDigit(id.charAt(3))
                && Character.isDigit(id.charAt(4)) && Character.isDigit(id.charAt(5)) && Character.isDigit(id.charAt(6)) && Character.isDigit(id.charAt(7)) &&
                Character.isDigit(id.charAt(8)) && Character.isDigit(id.charAt(9)) && Character.isDigit(id.charAt(10));
    }
    public static boolean checkName(String name){
        int l = name.length();
        if(l > 2){
            for(int i = 0; i < l; i++){
                char p = name.charAt(i);
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
    public static boolean checkSurname(String surname) {
        if (surname.length() >= 2) {
            return true;
        } else {
            throw new NameFormatException("Surname should be longer than 2 characters.");
        }
    }


    // Overrides
    @Override
    public boolean equals(Object obj){
        Person p = (Person) obj;
        return getID().equals(p.getID());
    }

}
