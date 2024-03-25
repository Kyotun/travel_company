import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        ArrayList<Coworker> coworkers = new ArrayList<Coworker>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<TravelPacket> travel_packets = new ArrayList<TravelPacket>();

        Scanner sc = new Scanner(System.in);
        int option = 0;

        try {
            while (option != 100) {

                option = 0;

                System.out.println("Options:");
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
                System.out.println("Please choose an option: ");

                option = sc.nextInt();
                sc.nextLine();

                if (option == 1) {
                    System.out.println("Please enter the personal ID: ");
                    String id = sc.nextLine();

                    if (Person.isIDValid(id)) {
                        System.out.println("Please enter the name: ");
                        String nm = sc.nextLine();

                        if (Person.checkName(nm)) {
                            System.out.println("Please enter the surname:");
                            String nn = sc.nextLine();

                            if (Person.checkSurname(nn)) {
                                Coworker cw = new Coworker(id, nm, nn, String.valueOf(coworkers.size()));
                                System.out.println("Coworker number: W" + coworkers.size());
                                coworkers.add(cw);
                                System.out.println("Thank you for your time!");
                            }
                        }
                    }
                } else if (option == 2) {
                    for (Coworker coworker : coworkers) {
                        System.out.println(coworker);
                    }
                    System.out.println("There is no person left to show.");

                } else if (option == 3) {
                    System.out.println("Please enter the personal ID: ");
                    String id = sc.nextLine();
                    System.out.println("Please enter the coworker number: ");
                    String cn = sc.nextLine();

                    Coworker cw = new Coworker(id, cn);

                    int index = coworkers.indexOf(cw);

                    if (index == -1) {
                        System.out.println("Coworker could not be found.");
                    } else {
                        System.out.println(coworkers.get(index));
                    }

                } else if (option == 4) {
                    System.out.println("Please enter the personal ID: ");
                    String id = sc.nextLine();

                    if (Person.isIDValid(id)) {
                        System.out.println("Please enter the name: ");
                        String nm = sc.nextLine();

                        if (Person.checkName(nm)) {
                            System.out.println("Please enter the surname:");
                            String nn = sc.nextLine();

                            if (Person.checkSurname(nn)) {
                                Customer customer = new Customer(id, nm, nn, String.valueOf(customers.size()));
                                System.out.println("Your customer number: C" + String.valueOf(customers.size()));
                                customers.add(customer);
                                System.out.println("Thank you for your time!");

                            }
                        }
                    }
                } else if (option == 5) {
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    System.out.println("There is no person left to show.");

                } else if (option == 6) {
                    System.out.println("Please enter the personal ID: ");
                    String id = sc.nextLine();
                    System.out.println("Please enter the customer number: ");
                    String kn = sc.nextLine();

                    Customer customer = new Customer(id, kn);

                    int index = customers.indexOf(customer);

                    if (index == -1) {
                        System.out.println("Person could not be found.");
                    } else {
                        System.out.println(customers.get(index));
                    }

                } else if (option == 7) {
                    System.out.println("Please enter the packet ID: ");
                    String pktid = sc.nextLine();

                    System.out.println("Please enter the destination: ");
                    String dest = sc.nextLine();

                    System.out.println("Please enter the date: ");
                    String date = sc.nextLine();

                    System.out.println("Please enter the duration: ");
                    int duration = sc.nextInt();

                    System.out.println("Please enter the price: ");
                    float price = sc.nextFloat();

                    TravelPacket travel_packet = new TravelPacket(pktid, dest, date, duration, price);
                    travel_packets.add(travel_packet);
                    System.out.println("Packet is added. There is " + travel_packets.size() + " packet in list.");

                } else if (option == 8) {
                    for (TravelPacket travelPacket : travel_packets) {
                        System.out.println(travelPacket);
                    }
                    System.out.println("There is no packet left to show.");
                } else if (option == 8) {
                    for (TravelPacket travelPacket : travel_packets) {
                        System.out.println(travelPacket);
                    }
                    System.out.println("There is no packet left to show.");

                } else if (option == 9) {
                    System.out.println("Please enter the packet ID: ");
                    String pktid = sc.nextLine();

                    TravelPacket travel_packet = new TravelPacket(pktid);

                    int index = travel_packets.indexOf(travel_packet);

                    if (index == -1) {
                        System.out.println("Travel packet could not be found.");
                    } else {
                        System.out.println(travel_packets.get(index));
                    }
                } else if (option == 10) {
                    System.out.println("Please enter the packet ID: ");
                    String pktid = sc.nextLine();
                    TravelPacket travel_packet = new TravelPacket(pktid);

                    if (travel_packets.contains(travel_packet)) {
                        int index = travel_packets.indexOf(travel_packet);
                        TravelPacket travel_packet2 = travel_packets.get(index);
                        System.out.println("Please enter the new price: ");
                        float price = sc.nextFloat();
                        travel_packet2.setPrice(price);
                        System.out.println("Price is changed.");
                    }

                } else if (option == 11) {
                    System.out.println("Please enter the personal ID: ");
                    String id = sc.nextLine();
                    System.out.println("Please enter the coworker number: ");
                    String wn = sc.nextLine();
                    Coworker coworker = new Coworker(id, wn);

                    if (coworkers.contains(coworker)) {
                        int index = coworkers.indexOf(coworker);
                        Coworker coworker2 = coworkers.get(index);
                        System.out.println("Please give the new name: ");
                        String nn = sc.nextLine();
                        coworker2.setSurname(nn);
                    } else {
                        System.out.println("Coworker could not be found.");
                    }
                } else if (option == 12) {
                    System.out.println("Please enter the personal ID of customer: ");
                    String id = sc.nextLine();

                    System.out.println("Please enter the customer number of customer: ");
                    String cn = sc.nextLine();

                    System.out.println("Please enter the packet ID to add customers list: ");
                    String pktid = sc.nextLine();

                    int index = customers.indexOf(new Customer(id, cn));

                    if (index >= 0) {
                        Customer temp_k = customers.get(index);
                        index = travel_packets.indexOf(new TravelPacket((pktid)));
                        if (index >= 0) {
                            TravelPacket tp = travel_packets.get(index);
                            temp_k.addPacket(tp);
                        } else {
                            System.out.println("Travel packet could not be found.");
                        }
                    } else {
                        System.out.println("Customer could not be found.");
                    }
                } else if (option == 13) {
                    System.out.println("Please give the personal ID: ");
                    String id = sc.nextLine();

                    System.out.println("Please enter the customer number: ");
                    String cn = sc.nextLine();

                    Customer customer = new Customer(id, cn);

                    int index = customers.indexOf(customer);

                    if (index == -1) {
                        System.out.println("Customer could not be found.");
                    } else {
                        Customer cst = customers.get(index);
                        cst.getPacket();
                    }
                } else if (option == 100) {
                    System.out.println("See you later!");
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Error:" + ime + ". Please give a number!");
            sc.nextLine();
        } catch (BadIDFormatException bid) {
            System.out.println("Fail:" + bid);
            sc.nextLine();
        } catch (NameFormatException nfe) {
            System.out.println("Fail:" + nfe);
            sc.nextLine();
        } catch (Exception excp) {
            System.out.println("Fail:" + excp);
            sc.nextLine();

        }

    }
}
