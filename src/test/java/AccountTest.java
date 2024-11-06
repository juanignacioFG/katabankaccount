import org.example.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    void TestAccountInitialCredit() {
        //given
        //when
        Account account = new Account(1000);
        //then
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void testAddAmountToAccount() {
        //given
        Account account = new Account(1000);
        //whenn
        account.deposit(500);
        //then
        double balance = account.getBalance();
        assertEquals(1500, balance);
    }

    @Test
    void TestQuitMoney() {

        //given
        Account account = new Account(1000);
        //when
        account.withdraw(200);
        //then
        double balance = account.getBalance();
        assertEquals(800, balance);

    }

    @Test
    void withdrawMoreThanBalance() {
        //given
        Account account = new Account(100);
        //when
        account.withdraw(200);
        //then
        double balance = account.getBalance();
        assertEquals(100, balance);

    }
}
