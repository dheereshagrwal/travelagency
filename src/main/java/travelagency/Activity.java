package travelagency;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int enrolled;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.enrolled = 0;
        this.destination = destination;
    }

    public boolean enroll() {
        if (enrolled < capacity) {
            enrolled++;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }
    
    public int getEnrolled() {
        return enrolled;
    }

}

