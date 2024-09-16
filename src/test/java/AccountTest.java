import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AccountTest {

    @Test
    void 계좌_생성() {
        Account account = Account.createAccountEmpty(new Balance());
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    void 계좌_생성_1000() {
        Account account = Account.createAccountWithInitialDeposit(new Balance(), NaturalNumber.from(1000));
        assertThat(account.getBalance()).isEqualTo(1000);
    }

    @Test
    void 계좌_입금_확인() {
        Account account = Account.createAccountWithInitialDeposit(new Balance(), NaturalNumber.from(10000));
        account.deposit(NaturalNumber.from(1000));
        assertThat(account.getBalance()).isEqualTo(11000);
    }

    @Test
    void 계좌_출금_확인() {
        Account account = Account.createAccountWithInitialDeposit(new Balance(), NaturalNumber.from(10000));

        account.withdraw(NaturalNumber.from(1000));

        assertThat(account.getBalance()).isEqualTo(9000);
    }

    @Test
    void 계좌_출금_잔액_부족_예외() {
        Account account = Account.createAccountWithInitialDeposit(new Balance(), NaturalNumber.from(10000));

        assertThatThrownBy(()-> account.withdraw(NaturalNumber.from(20000)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}