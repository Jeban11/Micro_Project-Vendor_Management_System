package com.vms.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vms.bean.Vendor;

public interface VendorDAO extends JpaRepository<Vendor, Long> {

}
