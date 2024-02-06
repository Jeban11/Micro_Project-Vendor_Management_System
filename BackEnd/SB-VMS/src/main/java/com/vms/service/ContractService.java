package com.vms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vms.bean.Contract;
import com.vms.controller.CONcontroller;

@Service
public abstract class ContractService {
	@Autowired
	CONcontroller dao;
	@PostMapping("/ContractInsert")
	public abstract String performinsertContracts(@RequestBody Contract cus);

	@PutMapping("/ContractUpdate")
	public abstract String performupdateContracts(@RequestBody Contract stu);
    
	@DeleteMapping("/ContractDelete")
	public abstract String performdeleteContracts(Long id);

	@GetMapping("/ContractViewAll")
	public abstract List<Contract> getAllContracts();

	@GetMapping("ViewContract/{id}")
	public abstract Contract ViewDetail(@PathVariable("id") int id);

}
