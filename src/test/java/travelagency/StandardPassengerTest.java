package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the StandardPassenger class.
 */
public class StandardPassengerTest {
    /**
     * This test checks if the enroll method of the StandardPassenger class correctly enrolls the passenger in an activity.
     */
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        StandardPassenger passenger = new StandardPassenger("John Doe", 1, 150.0);
        assertTrue(passenger.enroll(activity)); // Enroll passenger in activity
        assertFalse(passenger.enroll(activity)); // Attempt to enroll passenger in same activity again (should fail)
    }
}
