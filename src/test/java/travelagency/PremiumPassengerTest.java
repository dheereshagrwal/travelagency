package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

public class PremiumPassengerTest {
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 0, destination);
        PremiumPassenger passenger = new PremiumPassenger("John Doe", 1);
        assertTrue(passenger.enroll(activity));
    }
}
