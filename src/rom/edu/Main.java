package rom.edu;
/* @author   Romanyuk Bohdan
   @project   LabWork2
   @class  BusinessClass
   @version  1.0.0
   @since 05.04.2021 - 17.21
  */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main {

    public static void main(String[] args) {


        // 1. Create two appropriate classes and 5 objects of each one.

        // Creating 5 objects of BusinessClass Class

        BusinessClass businessClassTicket1 = new BusinessClass("Borispol-Kair", 36, 2409, 1.9);
        BusinessClass businessClassTicket2 = new BusinessClass("Donetck-Paris", 29, 1943.6, 1.4);
        BusinessClass businessClassTicket3 = new BusinessClass("Washington-Kyiv", 33, 3962, 1.8);
        BusinessClass businessClassTicket4 = new BusinessClass("Chernihiv-Budapesht", 28, 800, 1.3);
        BusinessClass businessClassTicket5 = new BusinessClass("Rome-Lviv", 41, 1131.4, 2.1);


        // Creating 5 objects of LowCost Class

        LowCost lowCostTicket1 = new LowCost("Uzhhorod-Zhitomir", 9, 570);
        LowCost lowCostTicket2 = new LowCost("Kyiv-Odessa", 5, 625);
        LowCost lowCostTicket3 = new LowCost("Lviv-Kyiv", 7, 479);
        LowCost lowCostTicket4 = new LowCost("Barselona-Lviv", 6.5, 2351.6);
        LowCost lowCostTicket5 = new LowCost("Moskva-Belgorod", 8, 647);

        // Creating ArrayList and adding both types of tickets

        List<ICosting> tickets = new ArrayList<>();
        tickets.add(businessClassTicket1);
        tickets.add(businessClassTicket2);
        tickets.add(businessClassTicket3);
        tickets.add(businessClassTicket4);
        tickets.add(businessClassTicket5);
        tickets.add(lowCostTicket1);
        tickets.add(lowCostTicket2);
        tickets.add(lowCostTicket3);
        tickets.add(lowCostTicket4);
        tickets.add(lowCostTicket5);

        // 2. Calculate the total price  of all tickets

        int totalTicketsPrice = tickets.stream().mapToInt(ICosting::getCost).sum();
        System.out.println("Total cost of all tickets: " + totalTicketsPrice + " ₴");


        // 3. Find the ticket with highest price

        ICosting ticketWithHighestPrice = tickets.stream().max(Comparator
                .comparingInt(ICosting::getCost)).orElse(null);
        System.out.println("Highest Price Ticket: " + ticketWithHighestPrice);


        // 4. Find the ticket with lowest price

        ICosting ticketWithLowestPrice = tickets.stream().min(Comparator
                .comparingInt(ICosting::getCost)).orElse(null);
        System.out.println("Ticket with lowest price: " + ticketWithLowestPrice);


        // 5. Find the average price of tickets

        double averageTicketsPrice = tickets.stream()
                .mapToInt(ICosting::getCost).average().orElse(0);
        System.out.println("Average tickets price: " + averageTicketsPrice + " ₴");


        // 6. Which tickets are more expensive, business-class or low-cost?

        double lowCostPrice = tickets.stream()
                .filter(el -> el instanceof LowCost).mapToInt(ICosting::getCost).sum();
        double businessClassPrice = tickets.stream()
                .filter(el -> el instanceof BusinessClass).mapToInt(ICosting::getCost).sum();

        // if-else condition for checking whats more expensive

        if (businessClassPrice > lowCostPrice){
            System.out.println("Business-class prices are higher!");
        } else if (lowCostPrice > businessClassPrice){
            System.out.println("Low-cost prices are higher!");
        } else {
            System.out.println("Prices are the same!");
        }



        /* ------------------------OUTCOME------------------------
       Total cost of all tickets: 637629 ₴
       Highest Price Ticket: BusinessClass{name='Washington-Kyiv',
       kilometerPrice=33.0, distance=3962.0, сlassMultiplier=1.8}
       Ticket with lowest price: LowCost{name='Kyiv-Odessa',
       kilometerPrice=5.0, distance=625.0}
       Average tickets price: 63762.9 ₴
       Business-class prices are higher!
           ------------------------OUTCOME------------------------*/



    }
}
