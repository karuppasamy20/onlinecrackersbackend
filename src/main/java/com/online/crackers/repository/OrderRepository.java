package com.online.crackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.crackers.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, String> {

}
