package com.vms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vms.bean.Contract;
import com.vms.bean.Vendor;
import com.vms.repo.ContractRepo;
import com.vms.service.ContractService;

@RestController
@CrossOrigin("http://localhost:4200")
public class CONcontroller {
	@Autowired
	ContractRepo repo;
    ContractService service;
    
	@PostMapping("/ContractInsert")
	public String performinsertContracts(@RequestBody Contract con) {
		repo.save(con);
		return "Inserted";
	}

	@PutMapping("/ContractUpdate")
	public String performupdateContracts(@RequestBody Contract con) {
		repo.save(con);
		return "Updated";
	}

	@DeleteMapping("/ContractDelete/{id}")
	public String performdeleteContracts(@PathVariable("id") Long id) {
		repo.deleteById(id);
		return "Deleted";
	}


	@GetMapping("/ContractViewAll")
	public List<Contract> getAllContracts() {
		System.out.println("Inside View All");
		Iterator<Contract> it = repo.findAll().iterator();
		List<Contract> list = new ArrayList<Contract>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;

	}

	@GetMapping("/ViewContract/{id}")
	public Contract ViewDetail(@PathVariable("id") Long id) {
		Contract con =repo.findById(id).get();
		return con;
		
	}
	

}
