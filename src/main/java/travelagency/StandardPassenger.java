package travelagency;

public class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    @Override
    public boolean enroll(Activity activity) {
        if (balance >= activity.getCost()) {
            balance -= activity.getCost();
            return true;
        }
        return false;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Balance: " + balance);
    }
}
