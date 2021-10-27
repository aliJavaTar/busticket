package com.maktab.busticket.repository;

import com.maktab.busticket.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsernameAndPassword(String username, String password);

    Customer addCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    //Customer update(Customer customer);

}
