public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " sucessfull. Current balance: $" + getBalance());
    }

    @Override 
    public void withdraw(double amount) {
        if(getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $" + amount + " sucessfull. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdraw failed");
        }
    }
}