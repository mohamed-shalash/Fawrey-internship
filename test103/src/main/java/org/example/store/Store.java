package org.example.store;

import org.example.account.Customer;

public interface Store {
    String buy(Product product, Customer customer);
}
