package com.vms.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vms.bean.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Long> {

}
