package com.vms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vms.bean.Login;
import com.vms.bean.Response;
import com.vms.repo.LoginRepo;

@Service
public class LOGservice {
	
	@Autowired
	LoginRepo repo;
	Login log;
	
	public Response login(Login log) {
		Login ref=repo.findByUsername(log.getUsername());
		Login pass=repo.findByPassword(log.getPassword());
		if(ref!=null && pass!=null) {
			String value=ref.getPassword();
			String word=pass.getPassword();
			if (value.equals(word)) {
				return new Response("User Success");
			}
			else {
				return new Response("Login Fail");
			}
		}  else {
			return new Response("Login Fail");
		}
		
	}	


		
	}	


