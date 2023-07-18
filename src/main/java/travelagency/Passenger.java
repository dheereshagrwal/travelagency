package travelagency;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a passenger in a travel package.
 */
public abstract class Passenger {
    private String name;
    private int number;
    protected List<Activity> activities;

    /**
     * Creates a new Passenger with the given name and number.
     *
     * @param name   the name of the passenger
     * @param number the passenger's number
     */
    public Passenger(String name, int number) {
        this.name = name;
        this.number = number;
        this.activities = new ArrayList<>();
    }

    /**
     * Enrolls the passenger in the given activity.
     *
     * @param activity the activity to enroll in
     * @return true if the passenger was enrolled, false otherwise
     */
    public abstract boolean enroll(Activity activity);

    /**
     * Prints details about the passenger, including their name, number, and enrolled activities.
     */
    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + number);
        for (Activity activity : activities) {
            System.out.println("    Activity: " + activity.getName());
            System.out.println("    Destination: " + activity.getDestination().getName());
            System.out.println("    Cost: " + activity.getCost());
            System.out.println();
        }
    }

    /**
     * Returns the name of the passenger.
     *
     * @return the name of the passenger
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the passenger's number.
     *
     * @return the passenger's number
     */
    public int getNumber() {
        return number;
    }
}
