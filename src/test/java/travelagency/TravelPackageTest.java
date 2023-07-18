package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the TravelPackage class.
 */
public class TravelPackageTest {
    /**
     * This test checks if the addPassenger method of the TravelPackage class correctly adds passengers to the travel package.
     */
    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Hawaii Adventure", 2);
        Passenger passenger1 = new StandardPassenger("John Doe", 1, 100.0);
        Passenger passenger2 = new StandardPassenger("Jane Doe", 2, 100.0);
        Passenger passenger3 = new StandardPassenger("Bob Smith", 3, 100.0);
        travelPackage.addPassenger(passenger1); // Add first passenger
        travelPackage.addPassenger(passenger2); // Add second passenger
        travelPackage.addPassenger(passenger3); // Attempt to add third passenger (should fail)
        assertEquals(2, travelPackage.getPassengers().size());
    }
}
