package com.online.crackers.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.crackers.dao.CrackersDAO;
import com.online.crackers.entity.CrackersEntity;
import com.online.crackers.entity.OrderEntity;
import com.online.crackers.entity.ResponseModel;
import com.online.crackers.entity.UserEntity;
import com.online.crackers.service.CrackersService;

@CrossOrigin
@RestController
@RequestMapping("crackers")
public class CreackersDetails {
	
	@Autowired
	CrackersService  crackersService;
	
	@RequestMapping("alldetails")
	public List<CrackersEntity> getAllCrackers() {
		return crackersService.getAllCrackers();
	}
	
	@RequestMapping("orders")
	public List<OrderEntity> getOrders() {
		return crackersService.getOrders();
	}
	
	@PutMapping("saveorder")
	public OrderEntity saveOrder(@RequestBody OrderEntity bookingorder) {
		System.out.println("test"+bookingorder.toString());
		return crackersService.saveOrder(bookingorder);
	}
	
	@PostMapping("saveuser")
	public ResponseModel saveUser(@RequestBody UserEntity user) {
		System.out.println("test"+user.toString());
		return crackersService.saveUser(user);
	}

}
