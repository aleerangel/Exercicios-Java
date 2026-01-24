public class BankAccount {
    private int accountNumber;
    private double balance;

    private static String bankName;
    private static double interestRate;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount.setBankName("Banco nacional");
        BankAccount.setInterestRate(3.5);

        BankAccount account1 = new BankAccount(1, 1000.0);
        BankAccount account2 = new BankAccount(2, 2000.0);

        account1.printDetails();
        account2.printDetails();
    }
}