package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.Customer;
import com.example.service.HomeService;

@Controller
public class HomeController {
@Autowired
private HomeService homeservice;

	@RequestMapping(value = "/")

	public String getIndexPage() {

		return "index";

	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	
	public String getRegisterdData(@ModelAttribute Customer customer) {
		
		System.out.println("Registerd Data: " + customer);
		homeservice .addCustomerData(customer);
		return "login";
	}

	 @RequestMapping(value = "/upload", method = RequestMethod.POST)
		 
		 public String addfileData(@RequestPart MultipartFile file){
		 
		 System.out.println("file name : " + file.getOriginalFilename());
		 
		 homeservice.addfileData(file);
		 
	  return "index";
}
}