public class NameFormatException extends RuntimeException{
    private String message;

    public NameFormatException(String msg){super(msg);}

    public void setMessage(String msg){this.message = msg;}
    public String getMessage(){return message;}

}
