package com.online.crackers.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ClientIdGenerator  implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// Order ID generation 
		LocalDate currentdate = LocalDate.now();
		String month = currentdate.getMonth().toString().substring(0, 3);
	    String prefix = "OC"+currentdate.getDayOfMonth()+month;
	    Connection connection = session.connection();

	    try {
	        Statement statement=connection.createStatement();

	        ResultSet rs=statement.executeQuery("select count(orderid) as Id from orderdetails");

	        if(rs.next())
	        {
	            int id=rs.getInt(1)+1;
	            String generatedId = prefix + id;
	            return generatedId;
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    return null;
	}

}
