package travelagency;

import static org.junit.Assert.*;

import org.junit.Test;


public class ActivityTest {
    @Test
    public void testEnroll() {
        Destination destination = new Destination("Hawaii");
        Activity activity = new Activity("Surfing", "Surfing in Hawaii", 100.0, 2, destination);
        assertTrue(activity.enroll());
        assertTrue(activity.enroll());
        assertFalse(activity.enroll());
    }
}
