package com.vms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vms.bean.Product;

public interface ProductDAO extends JpaRepository<Product, Long>{

}
