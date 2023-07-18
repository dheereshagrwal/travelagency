package travelagency;

/**
 * Represents a standard-level passenger in a travel package.
 */
public class StandardPassenger extends Passenger {
    private double balance;

    /**
     * Creates a new StandardPassenger with the given name, number, and balance.
     *
     * @param name    the name of the passenger
     * @param number  the passenger's number
     * @param balance the passenger's account balance
     */
    public StandardPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    /**
     * Enrolls the passenger in the given activity if they have sufficient funds.
     *
     * @param activity the activity to enroll in
     * @return true if the passenger was enrolled, false otherwise
     */
    @Override
    public boolean enroll(Activity activity) {
        if (balance >= activity.getCost()) {
            balance -= activity.getCost();
            activities.add(activity);
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
