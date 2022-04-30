package com.online.crackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.crackers.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

}
