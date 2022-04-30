package com.online.crackers.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;

import com.online.crackers.constants.Constants;
import com.online.crackers.dao.CrackersDAO;
import com.online.crackers.entity.CrackersEntity;
import com.online.crackers.entity.OrderEntity;
import com.online.crackers.entity.ResponseModel;
import com.online.crackers.entity.UserEntity;
import com.online.crackers.repository.CrackersRepository;
import com.online.crackers.repository.OrderRepository;
import com.online.crackers.repository.UserRepository;

@Component
public class CrackersDAOImpl implements CrackersDAO {
	
	@Autowired
	CrackersRepository crackersRepository;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
    private JavaMailSender sender;
	@Autowired
	UserRepository userRepository;

	@Override
	public List<CrackersEntity> getAllCrackers() {
		// TODO Auto-generated method stub
		return crackersRepository.findAll();
	}

	@Override
	public OrderEntity saveOrder(OrderEntity bookingorder) {
		// TODO Auto-generated method stub
		
		OrderEntity orderEntity = orderRepository.save(bookingorder);
//		try {
//			sendEmail(orderEntity);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return orderEntity;
	}

	private void sendEmail(OrderEntity orderEntity) throws Exception{
		// TODO Auto-generated method stub
		MimeMessage message = sender.createMimeMessage();
		 
        // Enable the multipart flag!
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom("onlinecrackers2022@gmail.com");
        helper.setTo(orderEntity.getEmailid());
        helper.setText("<html><body>Here is a cat picture"+orderEntity.toString()+"!<body></html>", true);
        helper.setSubject("Online Crackers - Order confirmed :"+orderEntity.getOrderid());
 
        sender.send(message);
	}

	public ResponseModel saveUser(UserEntity user) {
		// Save the user details
		ResponseModel response = new ResponseModel<UserEntity>();
		
		try {
			
			response.setStatus(Constants.success);
			response.setMessage(Constants.successmessage);
			response.setData(userRepository.save(user));
		}catch(Exception e) {
			response.setStatus(Constants.failure);
			response.setMessage(e.getMessage());
		}
		return response;
	}

	public List<OrderEntity> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
