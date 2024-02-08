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

import com.vms.bean.Product;
@Service
public abstract class ProductService {
	@Autowired
	
	@PostMapping("/ProductInsert")
	public abstract String performinsertProducts(@RequestBody Product cus);

	@PutMapping("/ProductUpdate")
	public abstract String performupdateProducts(@RequestBody Product stu);


	@DeleteMapping("/ProductDelete")
	public abstract String performdeleteProducts(@RequestParam("id") Long id);

	@GetMapping("/ProductViewAll")
	public abstract List<Product> getAllProducts();

	@GetMapping("ProductView/{id}")
	public abstract Product ViewDetail(@PathVariable("id") Long id);


}
