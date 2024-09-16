public class Account {

    private Balance balance;

    public Account(Balance balance) {
        this.balance = balance;
    }

    public Account(Balance balance, NaturalNumber naturalNumber) {
        this.balance = balance;

        deposit(naturalNumber);
    }

    public int getBalance() {
        return balance.getBalance();
    }

    public void deposit(NaturalNumber naturalNumber) {
        this.balance.add(naturalNumber);
    }

    public void withdraw(NaturalNumber naturalNumber) {
        this.balance.subtract(naturalNumber);
    }
}
