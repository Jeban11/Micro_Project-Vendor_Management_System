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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vms.bean.Vendor;
import com.vms.dao.VendorDAO;
import com.vms.service.VendorService;

@RestController
@CrossOrigin("http://localhost:4200")
public class VMScontroller {
	@Autowired
	VendorDAO dao;
	VendorService service;

	@PostMapping("/VendorInsert")
	public String performinsertVendors(@RequestBody Vendor ven) {
		dao.save(ven);
		return "Inserted";
	}

	@PutMapping("/VendorUpdate")
	public String performupdateVendors(@RequestBody Vendor ven) {
		dao.save(ven);
		return "Updated";
	}

	@DeleteMapping("/VendorDelete/{id}")
	public String performdeleteCustomer(@PathVariable("id") Long id) {
		dao.deleteById(id);
		return "Deleted";
	}
//	@DeleteMapping("/PerformDelete")
//	public String performdeleteVendors(@RequestParam("id") int id) {
//		dao.deleteById(id);
//		return "Deleted";
//	}

	@GetMapping("/AllVendors")
	public List<Vendor> getAllVendors() {
		System.out.println("Inside View All");
		Iterator<Vendor> it = dao.findAll().iterator();
		List<Vendor> list = new ArrayList<Vendor>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;

	}

	@GetMapping("/ViewVendor/{id}")
	public Vendor ViewDetail(@PathVariable("id") Long id) {
		Vendor ven = dao.findById(id).get();
		return ven;

	}

}
