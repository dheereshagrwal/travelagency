package travelagency;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean enroll(Activity activity) {
        return true;
    }
}
