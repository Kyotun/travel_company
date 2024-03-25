public class BadIDFormatException extends RuntimeException{
    private String message;

    public BadIDFormatException(String msg){
        super(msg);
    }

    public void setMessage(String msg){
        this.message = msg;
    }
    public String getMessage(){
        return message;
    }
}