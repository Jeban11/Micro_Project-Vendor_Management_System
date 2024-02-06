package com.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vms.bean.Login;

import com.vms.service.LOGservice;

@RestController
@CrossOrigin("http://localhost:4200")
public class LOGcontroller {
	@Autowired
	LOGservice lservice;
	
	@PostMapping("/login")
	public String perfomLogin(Login login) {
		boolean res=lservice.login(login);
        if(res==true) {
        	return "Login Success";
        }
        else {
        	return "Login Fail";
        }

}
}
