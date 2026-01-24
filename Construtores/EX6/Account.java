public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        boolean falhou = false;
        if(accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            falhou = true;
        }
        if(balance >= 0) {
            this.balance = balance;
        } else {
            falhou = true;
        }
        if(falhou) {
            System.out.println("Validacao falhou");
        }
    }
}