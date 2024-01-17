package com.example.Dao;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.Customer;
import com.example.entity.FileData;
@Repository
public class HomeDaoImpl implements HomeDao{
@Autowired
private SessionFactory sf;
	@Override
	public void addCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		
		Session session = sf.openSession();
		session.save(customer);
		session.beginTransaction().commit();
	}
	@Override
	public void addfileData(MultipartFile file) {
		// TODO Auto-generated method stub
		
		Session session = sf.openSession();
		
		try {
		FileData filedata = new FileData();
		filedata.setFilename(file.getOriginalFilename());
		filedata.setFileinfo(file.getBytes());
		session.save(filedata);
		session.beginTransaction().commit();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
