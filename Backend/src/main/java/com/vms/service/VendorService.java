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
import org.springframework.web.bind.annotation.RequestParam;

import com.vms.bean.Vendor;
import com.vms.repo.VendorRepo;

@Service
public abstract class VendorService {
	
	@Autowired
	VendorRepo repo;
	@PostMapping("/VendorInsert")
	public abstract String performinsertVendors(@RequestBody Vendor ven);
	

	@PutMapping("/VendorUpdate")
	public abstract String performupdateVendors(@RequestBody Vendor ven);


	@DeleteMapping("VendorDelete")
	public abstract String performdeleteVendors(@RequestParam("id") Long id);

	@GetMapping("/Vendors")
	public abstract List<Vendor> getAllVendors();

	@GetMapping("ViewVendor/{id}")
	public abstract Vendor ViewDetail(@PathVariable("id") Long id);

}
