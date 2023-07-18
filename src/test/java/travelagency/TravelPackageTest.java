package travelagency;

import org.junit.Test;
import static org.junit.Assert.*;

public class TravelPackageTest {
    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Hawaii Adventure", 2);
        Passenger passenger1 = new StandardPassenger("John Doe", 1, 100.0);
        Passenger passenger2 = new StandardPassenger("Jane Doe", 2, 100.0);
        Passenger passenger3 = new StandardPassenger("Bob Smith", 3, 100.0);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);
        assertEquals(2, travelPackage.getPassengers().size());
    }
}
