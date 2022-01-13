package com.learningSpring.WebAppMVC.service;

import com.learningSpring.WebAppMVC.dao.CustomerDAO;
import com.learningSpring.WebAppMVC.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

   public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
