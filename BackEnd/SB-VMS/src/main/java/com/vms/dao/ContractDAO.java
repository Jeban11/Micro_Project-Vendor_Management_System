package com.vms.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vms.bean.Contract;

public interface ContractDAO extends JpaRepository<Contract, Long> {

}
