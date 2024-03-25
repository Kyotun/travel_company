import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Coworker> coworkers = new ArrayList<Coworker>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<TravelPacket> travel_packets = new ArrayList<TravelPacket>();

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 100) {

            option = 0;

            System.out.println("Please choose an option:");
            System.out.println("1- Add a new co-worker.");
            System.out.println("2- List all of the co-workers.");
            System.out.println("3- Search co-worker.");
            System.out.println("4- Add customer.");
            System.out.println("5- List all of the customers.");
            System.out.println("6- Search customer.");
            System.out.println("7- Add a travel packet.");
            System.out.println("8- List all of the travel packets.");
            System.out.println("9- Search travel packet.");
            System.out.println("10- Change the price of a travel packet.");
            System.out.println("11- Change coworker surname.");
            System.out.println("12- Add packet to a customer.");
            System.out.println("13- List all packets of a customer.");
            System.out.println("100- Exit.");
        }

    }
}
