package travelagency;

/**
 * Represents a premium-level passenger in a travel package.
 */
public class PremiumPassenger extends Passenger {
    /**
     * Creates a new PremiumPassenger with the given name and number.
     *
     * @param name   the name of the passenger
     * @param number the passenger's number
     */
    public PremiumPassenger(String name, int number) {
        super(name, number);
    }

    /**
     * Enrolls the passenger in the given activity.
     *
     * @param activity the activity to enroll in
     * @return true if the passenger was enrolled, false otherwise
     */
    @Override
    public boolean enroll(Activity activity) {
        return true;
    }
}
