package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the GoldPassenger class.
 */
public class GoldPassengerTest {
    /**
     * This test checks if the enroll method of the GoldPassenger class correctly enrolls the passenger in an activity.
     */
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        GoldPassenger passenger = new GoldPassenger("John Doe", 1, 95.0);
        assertTrue(passenger.enroll(activity)); // Enroll passenger in activity
        assertFalse(passenger.enroll(activity)); // Attempt to enroll passenger in same activity again (should fail)
    }
}
