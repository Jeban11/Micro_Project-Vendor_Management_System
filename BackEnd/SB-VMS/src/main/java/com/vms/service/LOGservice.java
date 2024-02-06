package com.vms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vms.bean.Login;
import com.vms.dao.LoginDAO;

@Service
public class LOGservice {
	
	@Autowired
	LoginDAO dao;

	public boolean login(Login login) {
		Login ref=dao.findByUsername(login.getUsername());
		Login pass=dao.findByPassword(login.getPassword());
		if(ref!=null && pass!=null) {
			String value=ref.getPassword();
			String word=pass.getPassword();
			if (value.equals(word)) {
				return true;
			}
			else {
				return false;
			}
		}  else {
		return false;
		}
		
	}	

}
