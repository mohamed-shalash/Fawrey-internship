package example.account;

import org.example.account.AccountManager;
import org.example.account.AccountManagerImpl;
import org.example.account.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountManagerTest {

    Customer customer = new Customer();
    AccountManager accountManager = new AccountManagerImpl();

    @Test void givenAmountBelowMaxCreditForNormalCustomerWhenWithdrawThenSubtractFromBalance() {
        // Arrange
        customer.setBalance(100);

        // Act
        String result = accountManager.withdraw(customer, 80);

        // Assert
        int expectedBalance = customer.getBalance();
        Assertions.assertEquals(20, expectedBalance);
        Assertions.assertEquals("success", result);
    }


    @Test void givenAmountBiggerMaxCreditForNormalCustomerWhenWithdrawThenSubtractFromBalance() {
        // Arrange
        customer.setBalance(100);

        // Act
        String result = accountManager.withdraw(customer, 120);

        // Assert
        int expectedBalance = customer.getBalance();
        Assertions.assertEquals(100, expectedBalance);
        Assertions.assertEquals("insufficient account balance", result);
    }

    @Test void givenAmountBelowMaxCreditForNormalCustomerWhenWithdrawBiggerThanAllowedDrow() {
        // Arrange
        customer.setBalance(999);
        customer.setVip(false);
        customer.setCreditAllowed(true);
        // Act
        String result = accountManager.withdraw(customer, 1001);

        // Assert
        int expectedBalance = customer.getBalance();
        Assertions.assertEquals(999, expectedBalance);
        Assertions.assertEquals("maximum credit exceeded", result);
    }



}
