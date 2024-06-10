package example.store;

import org.example.account.AccountManager;
import org.example.account.Customer;
import org.example.store.Product;
import org.example.store.Store;
import org.example.store.StoreImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {

    Store store;

    Product product = new Product();
    Customer customer = new Customer();

    static class AlwaysReturnSuccessAccountManager implements AccountManager {

        @Override
        public void deposit(Customer customer, int amount) {

        }

        @Override
        public String withdraw(Customer customer, int amount) {
            return "success";
        }
    }


    @Test void test1() {
        // Arrange
        product.setQuantity(8);
        store = new StoreImpl(new AlwaysReturnSuccessAccountManager());

        // Act
        String res=store.buy(product, customer);

        // Assert
        Assertions.assertEquals(7, product.getQuantity());
        Assertions.assertEquals("success", res);
    }

/////////////////////////////////////////////////////////
    @Test void test2() {
        // Arrange
        product.setQuantity(0);
        store = new StoreImpl(new AlwaysReturnSuccessAccountManager());

        // Act
        String res =store.buy(product, customer);

        // Assert
        Assertions.assertEquals(0, product.getQuantity());
        Assertions.assertEquals("Product out of stock", res);
    }


}
