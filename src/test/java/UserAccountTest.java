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

    @Ignore("Remove to run test")
    @Test
    public void cannotWithdrawMoneyFromEmptyAccount() throws UserAccountActionInvalidException {
        userAccount.open();

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Cannot withdraw money from an empty account");

        userAccount.withdraw(5);
    }

    @Ignore("Remove to run test")
    @Test
    public void cannotWithdrawMoreMoneyThanYouHave() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.deposit(6);

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Cannot withdraw more money than is currently in the account");

        userAccount.withdraw(7);
    }

    @Ignore("Remove to run test")
    @Test
    public void cannotDepositNegativeAmount() throws UserAccountActionInvalidException {
        userAccount.open();

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Cannot deposit or withdraw negative amount");

        userAccount.deposit(-1);
    }

    @Ignore("Remove to run test")
    @Test
    public void cannotWithdrawNegativeAmount() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.deposit(105);

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Cannot deposit or withdraw negative amount");

        userAccount.withdraw(-5);
    }

    @Ignore("Remove to run test")
    @Test
    public void cannotGetBalanceOfClosedAccount() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.deposit(10);
        userAccount.close();

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Account closed");

        userAccount.getBalance();
    }

    @Ignore("Remove to run test")
    @Test
    public void cannotDepositMoneyIntoClosedAccount() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.close();

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Account closed");

        userAccount.deposit(5);
    }

    @Ignore("Remove to run test")
    @Test
    public void cannotWithdrawMoneyFromClosedAccount() throws UserAccountActionInvalidException {
        userAccount.open();
        userAccount.deposit(20);
        userAccount.close();

        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Account closed");

        userAccount.withdraw(5);
    }

    @Ignore("Remove to run test")
    @Test
    public void userAccountIsClosedBeforeItIsOpened() throws UserAccountActionInvalidException {
        expectedException.expect(UserAccountActionInvalidException.class);
        expectedException.expectMessage("Account closed");

        userAccount.getBalance();
    }


}
