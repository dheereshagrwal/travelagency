package travelagency;

/**
 * Represents a gold-level passenger in a travel package.
 */
public class GoldPassenger extends Passenger {
    private double balance;

    /**
     * Creates a new GoldPassenger with the given name, number, and balance.
     *
     * @param name    the name of the passenger
     * @param number  the passenger's number
     * @param balance the passenger's account balance
     */
    public GoldPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    /**
     * Enrolls the passenger in the given activity at a discounted cost if they have sufficient funds.
     *
     * @param activity the activity to enroll in
     * @return true if the passenger was enrolled, false otherwise
     */
    @Override
    public boolean enroll(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
        if (balance >= discountedCost) {
            balance -= discountedCost;
            return true;
        }
        return false;
    }

    /**
     * Prints details about the passenger, including their name, number, enrolled activities, and account balance.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Balance: " + balance);
    }
}
