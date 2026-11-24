package com.satz.springrestsecurity.repository;

import com.satz.springrestsecurity.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    public Customer findByEmail(String email);
    public Customer findByPassword(String password);
}
