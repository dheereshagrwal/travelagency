package travelagency;

import java.util.ArrayList;
import java.util.List;

public abstract class Passenger {
    private String name;
    private int number;
    private List<Activity> activities;

    public Passenger(String name, int number) {
        this.name = name;
        this.number = number;
        this.activities = new ArrayList<>();
    }

    public abstract boolean enroll(Activity activity);

    public void printDetails() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Number: " + number);
        System.out.println("");
        for (Activity activity : activities) {
            System.out.println("Activity: " + activity.getName());
            System.out.println("Destination: " + activity.getDestination().getName());
            System.out.println("Cost: " + activity.getCost());
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

