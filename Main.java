import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            System.out.println("100- Exit.");
        }

    }
}
