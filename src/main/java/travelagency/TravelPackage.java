package travelagency;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a travel package with a name, passenger capacity, itinerary, and list of passengers.
 */
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    /**
     * Creates a new TravelPackage with the given name and passenger capacity.
     *
     * @param name             the name of the travel package
     * @param passengerCapacity the maximum number of passengers allowed in the travel package
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    /**
     * Adds a destination to the travel package's itinerary.
     *
     * @param destination the destination to add
     */
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    /**
     * Adds a passenger to the travel package if there is space available.
     *
     * @param passenger the passenger to add
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
    }

    /**
     * Returns a list of passengers in the travel package.
     *
     * @return a list of passengers in the travel package
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }
    
    /**
     * Prints the travel package's itinerary, including destinations and activities.
     */
    public void printItinerary() {
        System.out.println("*** Travel Package: " + name + " ***");
        for (Destination destination : itinerary) {
            System.out.println("\n--- Destination: " + destination.getName() + " ---");
            for (Activity activity : destination.getActivities()) {
                System.out.println("  Activity: " + activity.getName());
                System.out.println("    Description: " + activity.getDescription());
                System.out.println("    Cost: " + activity.getCost());
                System.out.println("    Capacity: " + activity.getCapacity());
            }
        }
    }

    /**
     * Prints a list of passengers in the travel package.
     */
    public void printPassengerList() {
        System.out.println("*** Travel Package: " + name + " ***");
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size() + "\n");
        for (Passenger passenger : passengers) {
            System.out.println("  Passenger Name: " + passenger.getName());
            System.out.println("  Passenger Number: " + passenger.getNumber() + "\n");
        }
    }

    /**
     * Prints a list of activities with available spaces.
     */
    public void printAvailableActivities() {
        System.out.println("Available Activities:\n");
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.getCapacity() > activity.getEnrolled()) {
                    System.out.println("  Activity: " + activity.getName());
                    System.out
                            .println("  Spaces Available: " + (activity.getCapacity() - activity.getEnrolled()) + "\n");
                }
            }
        }
    }
}
