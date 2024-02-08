package com.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vms.bean.Login;
import com.vms.bean.Response;
import com.vms.service.LOGservice;

@RestController
@CrossOrigin("http://localhost:4200")
public class LOGcontroller {


	@Autowired
	LOGservice service;
	
	@RequestMapping("/login")
	public ResponseEntity<?> performLogin(@RequestBody Login log) {
		Response res=service.login(log);
			return ResponseEntity.ok(res);
	}

}
