package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerD {
	
	@Autowired
	@Qualifier("customerJPA")
	CustomerJPA customerdaoa;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test() {
		System.out.print("HOME PAGE PINGED \n");
		List<CustomerEntity> x = customerdaoa.getCustomersByQuery("SELECT * FROM customers");
		x.forEach((customer->{
			System.out.println(customer.toString());
		}));
		return "sairam";
	}
	
	@RequestMapping("/greeting")
    public String greeting() {
        return "sairam";
    }
}

