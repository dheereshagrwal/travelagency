package travelagency;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActivityTest {
    @Test
    public void testConstructor() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        assertEquals("Surfing", activity.getName());
        assertEquals("Surfing in Hawaii", activity.getDescription());
        assertEquals(100.0, activity.getCost(), 0.001);
        assertEquals(2, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }

    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        assertEquals(0, activity.getEnrolled());
        assertTrue(activity.enroll());
        assertEquals(1, activity.getEnrolled());
        assertTrue(activity.enroll());
        assertEquals(2, activity.getEnrolled());
        assertFalse(activity.enroll());
    }
}
