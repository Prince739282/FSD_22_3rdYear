public class bankAccount {
    protected String accountName;
    protected long accountNumber;
    protected double balance;
    protected double roi;

    public bankAccount(String accountName, long accountNumber, double balance, double roi) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.roi = roi;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn=" + amount);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited=" + amount);
    }

    public void checkBalance() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Remaining balance: " + balance);
    }
}