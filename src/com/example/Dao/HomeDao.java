 package com.example.Dao;

import org.springframework.web.multipart.MultipartFile;

import com.example.entity.Customer;

public interface HomeDao {
	
	public void addCustomerData(Customer customer);	
 
	public void addfileData(MultipartFile file);
}
