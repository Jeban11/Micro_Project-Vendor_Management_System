package com.vms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vms.bean.Login;

public interface LoginDAO extends JpaRepository<Login, Long>{

	public Login findByUsername(String username);

	public Login findByPassword(String password);

}
