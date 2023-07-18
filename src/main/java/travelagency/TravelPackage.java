package travelagency;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
    
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

    public void printPassengerList() {
        System.out.println("*** Travel Package: " + name + " ***");
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size() + "\n");
        for (Passenger passenger : passengers) {
            System.out.println("  Passenger Name: " + passenger.getName());
            System.out.println("  Passenger Number: " + passenger.getNumber() + "\n");
        }
    }

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
