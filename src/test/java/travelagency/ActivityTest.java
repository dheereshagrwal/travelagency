package travelagency;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class tests the Activity class.
 */
public class ActivityTest {
    /**
     * This test checks if the constructor of the Activity class correctly initializes its fields.
     */
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

    /**
     * This test checks if the enroll method of the Activity class correctly enrolls participants and updates the enrolled count.
     */
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        assertEquals(0, activity.getEnrolled());
        assertTrue(activity.enroll()); // Enroll first participant
        assertEquals(1, activity.getEnrolled());
        assertTrue(activity.enroll()); // Enroll second participant
        assertEquals(2, activity.getEnrolled());
        assertFalse(activity.enroll()); // Attempt to enroll third participant (should fail)
    }
}
