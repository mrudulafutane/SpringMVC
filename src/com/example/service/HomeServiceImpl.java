package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.Dao.HomeDao;
import com.example.entity.Customer;

@Service
public class HomeServiceImpl implements HomeService {
@Autowired
private HomeDao homedao;

	@Override
	public void addCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		homedao.addCustomerData(customer);
		
		
	}

	@Override
	public void addfileData(MultipartFile file) {
		// TODO Auto-generated method stub
		
	}


}
