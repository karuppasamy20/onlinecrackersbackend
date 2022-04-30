package com.online.crackers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.crackers.entity.CrackersEntity;

@Repository
public interface CrackersRepository extends JpaRepository<CrackersEntity, String>{
	
	public CrackersEntity findById(Integer id);

}
