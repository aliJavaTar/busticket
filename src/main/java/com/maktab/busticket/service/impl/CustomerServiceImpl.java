
package com.maktab.busticket.service.impl;

import com.maktab.busticket.entity.Customer;
import com.maktab.busticket.repository.CustomerRepository;
import com.maktab.busticket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findByUserNameAndPassword(String username, String password) {
        return customerRepository.findByUsernameAndPassword(username,password);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
//    @Override
//    public Customer update(Customer customer) {
//        return customerRepository.update(customer);
//    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }
}
