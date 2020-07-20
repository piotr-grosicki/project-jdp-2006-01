package com.kodilla.ecommercee.dao;

import com.kodilla.ecommercee.domains.Product;
import com.kodilla.ecommercee.domains.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDao extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}