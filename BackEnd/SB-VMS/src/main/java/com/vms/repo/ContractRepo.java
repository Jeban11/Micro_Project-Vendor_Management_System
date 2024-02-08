package com.vms.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vms.bean.Contract;

public interface ContractRepo extends JpaRepository<Contract, Long> {

}
