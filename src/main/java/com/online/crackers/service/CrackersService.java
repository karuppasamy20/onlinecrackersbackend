package com.online.crackers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.crackers.daoimpl.CrackersDAOImpl;
import com.online.crackers.entity.CrackersEntity;
import com.online.crackers.entity.OrderEntity;
import com.online.crackers.entity.ResponseModel;
import com.online.crackers.entity.UserEntity;

@Service
public class CrackersService {
	
	@Autowired
	CrackersDAOImpl crackersDAOImpl;
	
	public List<CrackersEntity> getAllCrackers() {
		return crackersDAOImpl.getAllCrackers();
	}

	public OrderEntity saveOrder(OrderEntity bookingorder) {
		// TODO Auto-generated method stub
		return crackersDAOImpl.saveOrder(bookingorder);
	}

	public ResponseModel saveUser(UserEntity user) {
		// TODO Auto-generated method stub
		return crackersDAOImpl.saveUser(user);
	}

	public List<OrderEntity> getOrders() {
		// TODO Auto-generated method stub
		return crackersDAOImpl.getOrders();
	}

}
