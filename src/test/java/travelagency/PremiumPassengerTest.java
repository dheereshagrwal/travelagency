package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the PremiumPassenger class.
 */
public class PremiumPassengerTest {
    /**
     * This test checks if the enroll method of the PremiumPassenger class correctly enrolls the passenger in an activity.
     */
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 0, destination);
        PremiumPassenger passenger = new PremiumPassenger("John Doe", 1);
        assertTrue(passenger.enroll(activity)); // Enroll passenger in activity
    }
}
