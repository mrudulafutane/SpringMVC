package com.example.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.entity.Customer;

public interface HomeService {
	public void addCustomerData(Customer customer);
	
	public void addfileData(MultipartFile file);
	

}
