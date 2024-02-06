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

import com.vms.bean.Product;

import com.vms.dao.ProductDAO;

@RestController
@CrossOrigin("http://localhost:4200")
public class PROcontroller {

	@Autowired
	ProductDAO dao;

	@PostMapping("/ProductInsert")
	public String performinsertVendors(@RequestBody Product pro) {
		dao.save(pro);
		return "Inserted";
	}

	@PutMapping("/ProductUpdate")
	public String performupdateVendors(@RequestBody Product pro) {
		dao.save(pro);
		return "Updated";
	}

	@DeleteMapping("/ProductDelete/{id}")
	public String performdeleteCustomer(@PathVariable("id") Long id) {
		dao.deleteById(id);
		return "Deleted";
	}
//	@DeleteMapping("/PerformDelete")
//	public String performdeleteVendors(@RequestParam("id") int id) {
//		dao.deleteById(id);
//		return "Deleted";
//	}

	@GetMapping("/ProductViewAll")
	public List<Product> getAllVendors() {
		System.out.println("Inside View All");
		Iterator<Product> it = dao.findAll().iterator();
		List<Product> list = new ArrayList<Product>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;

	}

	@GetMapping("ProductView/{id}")
	public Product ViewDetail(@PathVariable("id") Long id) {
		Product pro = dao.findById(id).get();
		return pro;

	}

}
