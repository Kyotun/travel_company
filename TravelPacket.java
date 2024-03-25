public class TravelPacket {
    // Object attributes
    private String packetID = "";
    private String destination = "";
    private String date = "";
    private int duration = 0;
    private float price = 0;

    // Set methods
    public void setPacketID(String packetID){this.packetID = packetID;}
    public void setDestination(String destination){this.destination= destination;}
    public void setDatum(String date){this.date = date;}
    public void setDuration(int duration){this.duration = duration;}
    public void setPrice(float price){this.price = price;}

    //Get methods
    public String getPacketID(){return this.packetID;}
    public String getDestination(){return this.destination;}
    public String getDatum(){return this.date;}
    public int getDuration(){return this.duration;}
    public float getPrice(){return this.price;}

    // Constructors
    public TravelPacket(String packetID){
        this.packetID= packetID;
    }
    public TravelPacket(String packetID, String destination, String date, int duration, float price){
        this(packetID);
        this.destination = destination;
        this.date = date;
        this.duration = duration;
        this.price = price;
    }
}
