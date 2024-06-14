package june13Overloading;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, String description) {
        balance += amount;
        System.out.println("Deposited " + amount + " (" + description + ")");
    }

    public void deposit(BankAccount fromAccount, double amount) {
        fromAccount.balance -= amount;
        balance += amount;
        System.out.println("Transferred " + amount + " from account " + fromAccount);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        
        account1.deposit(100);
        account2.deposit(account1, 50);

        System.out.println("Balance of account2: " + account2.getBalance());
    }
}

