public class savingAccount extends bankAccount {
    private static final double MIN_BALANCE = 500;

    public savingAccount(String accountName, long accountNumber, double balance, double roi) {
        super(accountName, accountNumber, balance, roi);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Denied: minimum balance of " + MIN_BALANCE + " must be maintained");
        } else {
            balance -= amount;
            System.out.println("Withdrawn=" + amount);
        }
    }

    public void addInterest() {
        double interest = balance * roi / 100;   // roi as a percentage, e.g. 4.5
        balance += interest;
        System.out.println("Interest added=" + interest);
    }
}