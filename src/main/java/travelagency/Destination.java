package travelagency;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a destination in a travel package.
 */
public class Destination {
    private String name;
    private List<Activity> activities;

    /**
     * Creates a new Destination with the given name.
     *
     * @param name the name of the destination
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Adds an activity to the destination.
     *
     * @param activity the activity to add
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    /**
     * Returns the name of the destination.
     *
     * @return the name of the destination
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a list of activities available at the destination.
     *
     * @return a list of activities available at the destination
     */
    public List<Activity> getActivities() {
        return activities;
    }
}
