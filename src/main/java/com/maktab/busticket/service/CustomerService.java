package com.maktab.busticket.service;

import com.maktab.busticket.entity.Customer;

public interface CustomerService {
    Customer findByUserNameAndPassword(String username, String password);

    Customer addCustomer(Customer customer);

  //  Customer update(Customer customer);

    void delete(Customer customer);
}
