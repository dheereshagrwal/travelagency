package travelagency;

public class Main {
    public static void main(String[] args) {
        TravelPackage travelPackage = new TravelPackage("Summer Adventure", 10);

        Destination beach = new Destination("Beach");
        Activity swimming = new Activity("Swimming", "Swim in the ocean", 10, 5, beach);
        Activity sunbathing = new Activity("Sunbathing", "Relax on the beach", 5, 10, beach);
        beach.addActivity(swimming);
        beach.addActivity(sunbathing);

        Destination mountains = new Destination("Mountains");
        Activity hiking = new Activity("Hiking", "Hike in the mountains", 15, 8, mountains);
        Activity camping = new Activity("Camping", "Camp in the mountains", 20, 6, mountains);
        mountains.addActivity(hiking);
        mountains.addActivity(camping);

        travelPackage.addDestination(beach);
        travelPackage.addDestination(mountains);

        Passenger alice = new StandardPassenger("Alice", 1, 50);
        alice.enroll(swimming);
        alice.enroll(hiking);

        Passenger bob = new GoldPassenger("Bob", 2, 40);
        bob.enroll(sunbathing);
        bob.enroll(camping);

        Passenger charlie = new PremiumPassenger("Charlie", 3);
        charlie.enroll(swimming);
        charlie.enroll(sunbathing);
        charlie.enroll(hiking);
        charlie.enroll(camping);

        travelPackage.addPassenger(alice);
        travelPackage.addPassenger(bob);
        travelPackage.addPassenger(charlie);

        // Print itinerary
        System.out.println("--- Itinerary ---");
        travelPackage.printItinerary();
        // Print passenger list
        System.out.println("--- Passenger List ---");
        travelPackage.printPassengerList();

        // Print details of individual passenger
        System.out.println("--- Passenger Details ---");
        alice.printDetails();

        // Print details of activities with available spaces
        System.out.println("--- Available Activities ---");
        travelPackage.printAvailableActivities();

    }
}
