public class Account {

    private int balance;

    public Account() {
    }

    public Account(NaturalNumber naturalNumber) {
        deposit(naturalNumber);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(NaturalNumber naturalNumber) {

        this.balance += naturalNumber.getNaturalNumber();
    }
}
