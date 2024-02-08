package com.vms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vms.bean.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
