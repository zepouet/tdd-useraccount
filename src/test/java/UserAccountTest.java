import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class UserAccountTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private UserAccount userAccount;

    @Before
    public void setup() {
        userAccount = new UserAccount();
    }

    /*

    @Test
    public void newlyOpenedAccountHasEmptyBalance() throws UserAccountActionInvalidException {
        userAccount.open();

        assertEquals(0, userAccount.getBalance());
    }

    @Ignore("Remove to run test")
    @Test
    public void canDepositMoney() throws UserAccountActionInvalidException {
        userAccount.open();

        userAccount.deposit(10);

        assertEquals(10, userAccount.getBalance());
    }

    @Ignore("Remove to run test")
    @Test
    public void canDepositMoneySequentially() throws UserAccountActionInvalidException {
        userAccount.open();

        userAccount.deposit(5);
        userAccount.deposit(23);

        assertEquals(28, userAccount.getBalance());
    }

    @Ignore("Remove to run test")
    @Test
    public void canWithdrawMoney() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.deposit(10);

        userAccount.withdraw(5);

        assertEquals(5, userAccount.getBalance());
    }

    @Ignore("Remove to run test")
    @Test
    public void canWithdrawMoneySequentially() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.deposit(23);

        userAccount.withdraw(10);
        userAccount.withdraw(13);

        assertEquals(0, userAccount.getBalance());
    }




}
