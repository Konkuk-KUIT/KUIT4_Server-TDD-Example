public class Account {

    private int balance;

    public Account() {
    }

    public Account(int i) {

        this.balance = i;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        this.balance += i;
    }
}
