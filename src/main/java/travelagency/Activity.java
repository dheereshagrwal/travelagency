package travelagency;

/**
 * Represents an activity in a travel package.
 */
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int enrolled;
    private Destination destination;

    /**
     * Creates a new Activity with the given name, description, cost, capacity, and destination.
     *
     * @param name        the name of the activity
     * @param description a brief description of the activity
     * @param cost        the cost of the activity
     * @param capacity    the maximum number of people who can enroll in the activity
     * @param destination the destination where the activity takes place
     */
    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.enrolled = 0;
        this.destination = destination;
    }

    /**
     * Enrolls a passenger in the activity if there is space available.
     *
     * @return true if the passenger was enrolled, false otherwise
     */
    public boolean enroll() {
        if (enrolled < capacity) {
            enrolled++;
            return true;
        }
        return false;
    }

    /**
     * Returns the name of the activity.
     *
     * @return the name of the activity
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a brief description of the activity.
     *
     * @return a brief description of the activity
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the cost of the activity.
     *
     * @return the cost of the activity
     */
    public double getCost() {
        return cost;
    }

    /**
     * Returns the maximum number of people who can enroll in the activity.
     *
     * @return the maximum number of people who can enroll in the activity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns the destination where the activity takes place.
     *
     * @return the destination where the activity takes place
     */
    public Destination getDestination() {
        return destination;
    }
    
    /**
     * Returns the number of people currently enrolled in the activity.
     *
     * @return the number of people currently enrolled in the activity
     */
    public int getEnrolled() {
        return enrolled;
    }
}
