public class currentAccount extends bankAccount {
    private double overdraftLimit;

    public currentAccount(String accountName, long accountNumber, double balance, double overdraftLimit) {
        super(accountName, accountNumber, balance, 0);   // current accounts earn no interest
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (balance + overdraftLimit < amount) {
            System.out.println("Overdraft limit exceeded");
        } else {
            balance -= amount;   // balance can go negative, up to the limit
            System.out.println("Withdrawn=" + amount);
        }
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
        System.out.println("Overdraft limit: " + overdraftLimit);
    }
}