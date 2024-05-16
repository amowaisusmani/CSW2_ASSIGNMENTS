

abstract class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdrawal(double amount);
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Override deposit method to calculate interest
    @Override
    public void deposit(double amount) {
        double interest = (getBalance() + amount) * interestRate;
        setBalance(getBalance() + amount + interest);
    }

    // Override withdrawal method to ensure sufficient balance
    @Override
    public void withdrawal(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdrawal method to check overdraft limit
    @Override
    public void withdrawal(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
}

// BankingApplication class
public class Q07 {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("123456", 5000.0, 0.02);
        CurrentAccount currentAccount = new CurrentAccount("789012", 2000.0, 1000.0);

        // Test deposit and withdrawal operations
        savingsAccount.deposit(1000.0);
        savingsAccount.withdrawal(6000.0);
        currentAccount.deposit(500.0);
        currentAccount.withdrawal(3000.0);

        // Display account details
        System.out.println("Savings Account: " + savingsAccount.getAccountNumber() + ", Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account: " + currentAccount.getAccountNumber() + ", Balance: " + currentAccount.getBalance());
    }
}
