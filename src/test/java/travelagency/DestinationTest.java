package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

public class DestinationTest {
    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Hawaii");
        Activity activity1 = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        Activity activity2 = new Activity("Hiking", "Hiking in Hawaii", 50.0, 10, destination);
        destination.addActivity(activity1);
        destination.addActivity(activity2);
        assertEquals(2, destination.getActivities().size());
        assertEquals(activity1, destination.getActivities().get(0));
        assertEquals(activity2, destination.getActivities().get(1));
    }
}
