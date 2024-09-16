import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void 계좌_생성() {
        Account account = new Account();
        Assertions.assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    void 계좌_생성_1000() {
        Account account = new Account(NaturalNumber.from(1000));
        Assertions.assertThat(account.getBalance()).isEqualTo(1000);
    }

    @Test
    void 계좌_입금_확인() {
        Account account = new Account(NaturalNumber.from(10000));
        account.deposit(NaturalNumber.from(1000));
        Assertions.assertThat(account.getBalance()).isEqualTo(11000);
    }

}