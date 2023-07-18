package travelagency;

public class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    @Override
    public boolean enroll(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
        if (balance >= discountedCost) {
            balance -= discountedCost;
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
