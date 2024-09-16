public class Account {

    private Balance balance = new Balance();

    public Account() {
    }

    public Account(NaturalNumber naturalNumber) {
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
