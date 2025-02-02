public class Account {

    private Balance balance;

    private Account(Balance balance) {
        this.balance = balance;
    }

    public static Account createAccountEmpty(Balance balance) {
        return new Account(balance);
    }

    public static Account createAccountWithInitialDeposit(Balance balance, NaturalNumber depositAmount) {
        Account account = new Account(balance);
        account.deposit(depositAmount);
        return account;
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
