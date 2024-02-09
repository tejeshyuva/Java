package exceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testSuccessfulWithdrawal() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(500);
            assertEquals(500, account.getBalance());
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            fail("No exception expected for a valid withdrawal");
        }
    }

    @Test
    public void testInsufficientFundsException() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
            fail("InsufficientFundsException expected but not thrown");
        } catch (InsufficientFundsException e) {
            assertEquals("Insufficient funds", e.getMessage());
            assertEquals(1000, account.getBalance()); // Balance should remain unchanged
        } catch (InvalidWithdrawalException e) {
            fail("Unexpected InvalidWithdrawalException thrown");
        }
    }

    @Test
    public void testInvalidWithdrawalException() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(-200);
            fail("InvalidWithdrawalException expected but not thrown");
        } catch (InvalidWithdrawalException e) {
            assertEquals("Withdrawal amount cannot be negative", e.getMessage());
            assertEquals(1000, account.getBalance()); // Balance should remain unchanged
        } catch (InsufficientFundsException e) {
            fail("Unexpected InsufficientFundsException thrown");
        }
    }
}

