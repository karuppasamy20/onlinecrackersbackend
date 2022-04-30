package com.online.crackers.dao;

import java.util.List;

import com.online.crackers.entity.CrackersEntity;
import com.online.crackers.entity.OrderEntity;
import com.online.crackers.entity.ResponseModel;
import com.online.crackers.entity.UserEntity;

public interface CrackersDAO {
	
	public List<CrackersEntity> getAllCrackers();
	public OrderEntity saveOrder(OrderEntity bookingorder);
	public ResponseModel saveUser(UserEntity user);
	public List<OrderEntity> getOrders();
}
