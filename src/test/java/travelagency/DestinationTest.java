package travelagency;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DestinationTest {
    @Test
    public void testConstructor() {
        Destination destination = new Destination("Hawaii");
        assertEquals("Hawaii", destination.getName());
        assertTrue(destination.getActivities().isEmpty());
    }

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Hawaii");
        Activity activity1 = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        Activity activity2 = new Activity("Hiking", "Hiking in Hawaii", 50.0, 10, destination);
        destination.addActivity(activity1);
        destination.addActivity(activity2);
        List<Activity> activities = destination.getActivities();
        assertEquals(2, activities.size());
        assertTrue(activities.contains(activity1));
        assertTrue(activities.contains(activity2));
    }
}
