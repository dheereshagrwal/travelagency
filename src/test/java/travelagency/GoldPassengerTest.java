package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

public class GoldPassengerTest {
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        GoldPassenger passenger = new GoldPassenger("John Doe", 1, 95.0);
        assertTrue(passenger.enroll(activity));
        assertFalse(passenger.enroll(activity));
    }
}
