package com.promineotech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.promineotech.inventoryManagement.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long>{

}
