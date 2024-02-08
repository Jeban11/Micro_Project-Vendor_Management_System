package com.vms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vms.bean.Login;

public interface LoginRepo extends JpaRepository<Login, Long>{


	public Login findByUsername(String username);
	public Login findByPassword(String password);

}
